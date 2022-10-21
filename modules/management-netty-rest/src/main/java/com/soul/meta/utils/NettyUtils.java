package com.soul.meta.utils;
import io.netty.buffer.ByteBuf;

import java.nio.charset.Charset;


/**
* @Description: 
* @Author: nemo
* @Date: 2022/3/26
*/
public class NettyUtils {

    public static String convertByteBufToString(ByteBuf byteBuf) {
        String msg;
        if(byteBuf.hasArray()){
            msg = new String(byteBuf.array(),byteBuf.arrayOffset() + byteBuf.readerIndex(),byteBuf.readableBytes());
        }else{
            byte[] bytes = new byte[byteBuf.readableBytes()];
            byteBuf.getBytes(byteBuf.readerIndex(),bytes);
            msg = new String(bytes,0,byteBuf.readableBytes());
        }

        return msg;

    }

    public static String getName(ByteBuf nameByteBuf) {

        for (int i = 0; i < nameByteBuf.readableBytes(); i++) {
            if (nameByteBuf.getByte(i) == 0) {
                String gbk = nameByteBuf.readBytes(i).toString(Charset.forName("GBK"));
                nameByteBuf.release();
                return gbk;
            }
        }
        return nameByteBuf.toString(Charset.forName("GBK"));
    }



}

