package com.soul.monitor.domain;

/**
 * @Author: Song
 * @Date 2023/2/6 14:57
 */

import com.egova.data.service.AbstractRepositoryBase;
import com.soul.monitor.entity.Notice;
import org.springframework.cache.annotation.CacheConfig;

@CacheConfig(cacheNames = Notice.NAME)
public interface NoticeRepository extends AbstractRepositoryBase<Notice,String> {
}