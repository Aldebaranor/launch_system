package com.soul.monitor.service;

/**
 * @Author: Song
 * @Date 2023/2/6 10:50
 */

import com.egova.model.PageResult;
import com.egova.model.QueryModel;
import com.soul.monitor.condition.ArtilleryCondition;
import com.soul.monitor.entity.Artillery;
import com.soul.monitor.facade.ArtilleryFacade;
import org.springframework.cache.annotation.CacheConfig;

import java.util.List;

@CacheConfig(cacheNames = Artillery.NAME)
public interface ArtilleryService extends ArtilleryFacade {

    List<Artillery> getArtilleryById(String id);

    String insert(Artillery entity);

    void update(Artillery entity);

    int deleteById(String id);

    PageResult<Artillery> getPage(QueryModel<ArtilleryCondition> queryModel);
}
