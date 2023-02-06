package com.soul.monitor.domain;

import com.egova.data.service.AbstractRepositoryBase;
import com.soul.monitor.entity.Artillery;
import org.springframework.cache.annotation.CacheConfig;

/**
 * @Author: Song
 * @Date 2023/2/6 10:46
 */
@CacheConfig(cacheNames = Artillery.NAME)
public interface ArtilleryRepository extends AbstractRepositoryBase<Artillery, String> {
}
