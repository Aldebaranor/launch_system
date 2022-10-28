package com.soul.monitor.domain;

import com.egova.data.service.AbstractRepositoryBase;
import com.soul.monitor.entity.MonitorCar;
import com.soul.monitor.entity.MonitorLauncher;
import org.springframework.cache.annotation.CacheConfig;


@CacheConfig(cacheNames = MonitorLauncher.NAME)
public interface MonitorLauncherRepository extends AbstractRepositoryBase<MonitorLauncher, String> {
}
