package com.soul.monitor.netty.handler;

import com.soul.monitor.config.MetaConfig;
import com.soul.monitor.facade.UnpackMessageService;
import com.soul.monitor.netty.UnpackMassageFactory;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


/**
 * @Description:
 * @Author: nemo
 * @Date: 2022/3/26
 */
@Slf4j
@Component
@AllArgsConstructor
@NoArgsConstructor
public class NettyUdpClientHandlerTest extends SimpleChannelInboundHandler<DatagramPacket> {

    private UnpackMassageFactory factory;

    private MetaConfig metaConfig;

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, DatagramPacket datagramPacket) {

        ByteBuf content = datagramPacket.content();
        String unpackServiceCode = metaConfig.getUnpackServiceCodeTest();
        UnpackMessageService service = factory.get(unpackServiceCode);
        service.unpackNetty(content.copy());
    }

}