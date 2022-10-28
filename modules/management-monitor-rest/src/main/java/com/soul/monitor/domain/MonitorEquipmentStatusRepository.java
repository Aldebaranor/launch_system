package com.soul.monitor.domain;

import com.egova.data.service.AbstractRepositoryBase;
import com.soul.monitor.entity.MonitorEquipment;
import com.soul.monitor.entity.MonitorEquipmentStatus;
import org.springframework.cache.annotation.CacheConfig;


@CacheConfig(cacheNames = MonitorEquipmentStatus.NAME)
public interface MonitorEquipmentStatusRepository extends AbstractRepositoryBase<MonitorEquipmentStatus, String> {
}
