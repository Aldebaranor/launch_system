package com.soul.monitor.service;


import com.soul.monitor.entity.MonitorCar;
import com.soul.monitor.facade.MonitorCarFacade;
import org.springframework.cache.annotation.CacheConfig;

import java.util.List;

@CacheConfig(cacheNames = MonitorCar.NAME)
public interface MonitorCarService extends MonitorCarFacade {
    List<MonitorCar> getAll();
}
