package com.soul.meta.facade;

import io.netty.buffer.ByteBuf;

/**
 * @auther: 码头工人
 * @date: 2022/04/02/3:32 下午
 * @description:
 */
public interface UnpackMessageService {

    /**
     * @Author: Shizuan
     * @Date: 2022/4/6 16:01
     * @Description: 数据包接口
     * @params: buf 数据包
     * @return:void
     **/
    void unpackNetty(ByteBuf buf);
}
