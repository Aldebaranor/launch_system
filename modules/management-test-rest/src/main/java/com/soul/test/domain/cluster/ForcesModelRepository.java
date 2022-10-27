package com.soul.test.domain.cluster;

import com.egova.data.service.AbstractRepositoryBase;
import com.soul.test.entity.ForcesModel;
import org.springframework.cache.annotation.CacheConfig;


/**
 * @Description:
 * @Author: nemo
 * @Date: 2022/5/23
 */
@CacheConfig(cacheNames = ForcesModel.NAME)
public interface ForcesModelRepository extends AbstractRepositoryBase<ForcesModel, String> {
}
