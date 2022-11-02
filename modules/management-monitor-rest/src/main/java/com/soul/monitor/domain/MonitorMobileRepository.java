package com.soul.monitor.domain;

import com.egova.data.service.AbstractRepositoryBase;
import com.soul.monitor.entity.MonitorMobile;
import org.springframework.cache.annotation.CacheConfig;


@CacheConfig(cacheNames = MonitorMobile.NAME)
public interface MonitorMobileRepository extends AbstractRepositoryBase<MonitorMobile, String> {
}
