package com.soul.meta.netty;

import com.soul.management.config.MetaConfig;
import com.soul.meta.netty.handler.NettyUdpServerHandler;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.InternetProtocolFamily;
import io.netty.channel.socket.nio.NioDatagramChannel;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
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
@ConditionalOnProperty(prefix = "management.netty.udpGroup.server", name = "enable", havingValue = "true", matchIfMissing = false)
public class NettyUdpGroupServer {

    @Autowired
    private UnpackMassageFactory factory;

    @Autowired
    private MetaConfig metaConfig;

    private Bootstrap bootstrap = new Bootstrap();

    private NioEventLoopGroup group = new NioEventLoopGroup();

    private InetSocketAddress groupAddress;

    private NioDatagramChannel channel;

    private Integer groupPort;

    private String groupIp;

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
        System.out.println("---UDP组播，本机地址：" + localAddress);

        bootstrap.group(group)
                .channelFactory(new ChannelFactory<Channel>() {
                    @Override
                    public NioDatagramChannel newChannel() {
                        return new NioDatagramChannel(InternetProtocolFamily.IPv4);
                    }
                })
                .localAddress(localAddress, groupAddress.getPort())
                //设置Option 组播
                .option(ChannelOption.IP_MULTICAST_IF, ni)
                //设置Option 地址
                .option(ChannelOption.IP_MULTICAST_ADDR, localAddress)
                //设置地址
                .option(ChannelOption.SO_REUSEADDR, true)
                .option(ChannelOption.IP_MULTICAST_LOOP_DISABLED, true)
                .handler(new ChannelInitializer<Channel>() {
                    @Override
                    protected void initChannel(Channel channel) throws Exception {
                        ChannelPipeline pipeline = channel.pipeline().addLast();
                        pipeline.addLast(new NettyUdpServerHandler(factory, metaConfig));
                    }
                });
        channel = (NioDatagramChannel) bootstrap.bind(groupAddress.getPort()).sync().channel();
        //加入组
        channel.joinGroup(groupAddress, ni).sync();
        log.info("----------------------------UdpGroupServer start success");

    }

    @PreDestroy
    public void destory() throws InterruptedException {
        group.shutdownGracefully().sync();
        log.info("----------------------------关闭Netty");
    }

}