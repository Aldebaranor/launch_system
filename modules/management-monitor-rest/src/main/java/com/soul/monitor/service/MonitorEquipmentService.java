package com.soul.monitor.service;


import com.soul.monitor.entity.MonitorEquipment;
import com.soul.monitor.facade.MonitorEquipmentFacade;
import org.springframework.cache.annotation.CacheConfig;

import java.util.List;

@CacheConfig(cacheNames = MonitorEquipment.NAME)
public interface MonitorEquipmentService extends MonitorEquipmentFacade {
    List<MonitorEquipment> getBasic(String carId, String carType);
}
