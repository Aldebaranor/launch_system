package com.soul.meta.netty;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.soul.meta.facade.UnpackMessageService;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @auther: 码头工人
 * @date: 2022/04/02/3:25 下午
 * @description:数据包工厂
 */
@Data
@Service
public class UnpackMassageFactory {

    @Autowired
    private final Map<String, UnpackMessageService> map = new ConcurrentHashMap();


    public UnpackMessageService get(String code) {
        UnpackMessageService service = map.get(code);
        if (service == null) {
            throw new RuntimeException("未定义UnpackMessageService");
        }

        return service;
    }
}
