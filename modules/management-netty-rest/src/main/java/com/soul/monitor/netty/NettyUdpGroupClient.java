package com.soul.monitor.netty;

import com.soul.monitor.netty.handler.NettyUdpClientHandler;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.DatagramPacket;
import io.netty.channel.socket.InternetProtocolFamily;
import io.netty.channel.socket.nio.NioDatagramChannel;
import io.netty.util.CharsetUtil;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.net.*;
import java.util.Enumeration;


/**
 * @Description:
 * @Author: nemo
 * @Date: 2022/3/23
 */
@Data
@Component
@Configuration
@Slf4j
@ConfigurationProperties(prefix = "management.netty")
@ConditionalOnProperty(prefix = "management.netty.udpGroup.client", name = "enable", havingValue = "true", matchIfMissing = false)
public class NettyUdpGroupClient {

    private Bootstrap bootstrap = new Bootstrap();

    private NioEventLoopGroup group = new NioEventLoopGroup();

    private NioDatagramChannel channel;

    private InetSocketAddress groupAddress;

    private String groupIp;

    private Integer groupPort;

    @PostConstruct
    public void start() throws Exception {
        System.setProperty("java.net.preferIPv4Stack", "true");// 只使用IPV4
        groupAddress = new InetSocketAddress(groupIp, groupPort);
        InetAddress localAddress = null;
        NetworkInterface ni = null;
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        while (networkInterfaces.hasMoreElements()) {
            NetworkInterface nia = networkInterfaces.nextElement();
            Enumeration<InetAddress> nias = nia.getInetAddresses();
            while (nias.hasMoreElements()) {
                InetAddress ia = nias.nextElement();
                if (!ia.isLinkLocalAddress() && !ia.isLoopbackAddress() && ia instanceof Inet4Address) {
                    localAddress = ia;
                    ni = nia;
                }
            }
        }
        bootstrap.group(group)
                .channelFactory(new ChannelFactory<Channel>() {
                    @Override
                    public NioDatagramChannel newChannel() {
                        return new NioDatagramChannel(InternetProtocolFamily.IPv4);
                    }
                })
                //.channel(NioDatagramChannel.class)
                // 设置LocalAddress
                .localAddress(localAddress, groupAddress.getPort())
                // 设置Option 组播
                .option(ChannelOption.IP_MULTICAST_IF, ni)
                // 设置Option 重复地址
                .option(ChannelOption.SO_REUSEADDR, true)
                .handler(new ChannelInitializer<Channel>() {
                    @Override
                    protected void initChannel(Channel channel) throws Exception {
                        ChannelPipeline pipeline = channel.pipeline();
                        pipeline.addLast(new NettyUdpClientHandler());
                    }
                });
        channel = (NioDatagramChannel) bootstrap.bind(groupAddress.getPort()).sync().channel();
        log.info("----------------------------UdpGroupClient start success");

    }

    @PreDestroy
    public void destory() throws InterruptedException {
        group.shutdownGracefully().sync();
        log.info("----------------------------关闭Netty");
    }


    //数据发送
    public void sendMsg(String msg) throws InterruptedException {
        this.channel.writeAndFlush(new DatagramPacket(Unpooled.copiedBuffer(msg, CharsetUtil.UTF_8),groupAddress)).sync();
    }


}