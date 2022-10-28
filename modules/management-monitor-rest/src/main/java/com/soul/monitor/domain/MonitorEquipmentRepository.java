package com.soul.monitor.domain;

import com.egova.data.service.AbstractRepositoryBase;
import com.soul.monitor.entity.MonitorEquipment;
import org.springframework.cache.annotation.CacheConfig;


@CacheConfig(cacheNames = MonitorEquipment.NAME)
public interface MonitorEquipmentRepository extends AbstractRepositoryBase<MonitorEquipment, String> {
}
