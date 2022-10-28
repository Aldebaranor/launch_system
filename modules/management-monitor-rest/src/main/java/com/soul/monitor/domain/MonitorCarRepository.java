package com.soul.monitor.domain;

import com.egova.data.service.AbstractRepositoryBase;
import com.soul.monitor.entity.MonitorCar;
import org.springframework.cache.annotation.CacheConfig;


@CacheConfig(cacheNames = MonitorCar.NAME)
public interface MonitorCarRepository extends AbstractRepositoryBase<MonitorCar, String> {
}
