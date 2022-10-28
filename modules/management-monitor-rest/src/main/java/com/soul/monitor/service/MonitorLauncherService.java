package com.soul.monitor.service;


import com.soul.monitor.entity.MonitorCar;
import com.soul.monitor.entity.MonitorLauncher;
import com.soul.monitor.facade.MonitorCarFacade;
import com.soul.monitor.facade.MonitorLauncherFacade;
import org.springframework.cache.annotation.CacheConfig;

import java.util.List;

@CacheConfig(cacheNames = MonitorCar.NAME)
public interface MonitorLauncherService extends MonitorLauncherFacade {
    List<MonitorLauncher> getLauncherByCarId(String carId);
}
