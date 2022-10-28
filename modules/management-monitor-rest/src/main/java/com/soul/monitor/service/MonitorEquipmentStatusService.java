package com.soul.monitor.service;


import com.soul.monitor.entity.MonitorEquipment;
import com.soul.monitor.entity.MonitorEquipmentStatus;
import com.soul.monitor.facade.MonitorEquipmentFacade;
import com.soul.monitor.facade.MonitorEquipmentStatusFacade;
import org.springframework.cache.annotation.CacheConfig;

import java.util.List;

@CacheConfig(cacheNames = MonitorEquipmentStatus.NAME)
public interface MonitorEquipmentStatusService extends MonitorEquipmentStatusFacade {
}
