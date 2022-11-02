package com.soul.monitor.service;


import com.soul.monitor.entity.MonitorMobile;
import com.soul.monitor.facade.MonitorMobileFacade;
import com.soul.monitor.model.MonitorMobileModel;
import org.springframework.cache.annotation.CacheConfig;

@CacheConfig(cacheNames = MonitorMobile.NAME)
public interface MonitorMobileService extends MonitorMobileFacade {
    MonitorMobileModel getByCarId(String carId);
}
