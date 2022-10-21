package com.soul.meta.netty.handler;

import com.soul.management.config.MetaConfig;
import com.soul.meta.facade.UnpackMessageService;
import com.soul.meta.netty.UnpackMassageFactory;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author zhp91
 */
@Slf4j
@Component
@AllArgsConstructor
@NoArgsConstructor
public class NettyUdpServerHandler extends SimpleChannelInboundHandler<DatagramPacket> {

    private UnpackMassageFactory factory;

    private MetaConfig metaConfig;

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, DatagramPacket datagramPacket) {

        ByteBuf content = datagramPacket.content();
        String unpackServiceCode = metaConfig.getUnpackServiceCode();
        UnpackMessageService service = factory.get(unpackServiceCode);
        service.unpackNetty(content.copy());
    }
}