package com.soul.monitor.service;

/**
 * @Author: Song
 * @Date 2023/2/6 15:02
 */

import com.egova.model.PageResult;
import com.egova.model.QueryModel;
import com.soul.monitor.condition.NoticeCondition;
import com.soul.monitor.entity.Notice;
import com.soul.monitor.facade.NoticeFacade;
import org.springframework.cache.annotation.CacheConfig;

import java.util.List;

@CacheConfig(cacheNames = Notice.NAME)
public interface NoticeService extends NoticeFacade {

    List<Notice> getNoticeById(String id);

    String insert(Notice entity);

    void update(Notice entity);

    int deleteById(String id);

    PageResult<Notice> getPage(QueryModel<NoticeCondition> queryModel);
}
