package com.soul.monitor.service.impl;
import com.egova.data.service.AbstractRepositoryBase;
import com.egova.data.service.TemplateService;
import com.egova.model.PageResult;
import com.egova.model.QueryModel;
import com.soul.monitor.condition.NoticeCondition;
import com.soul.monitor.domain.NoticeRepository;
import com.soul.monitor.entity.Artillery;
import com.soul.monitor.entity.Notice;
import com.soul.monitor.service.NoticeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Song
 * @Date 2023/2/6 14:59
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class NoticeServiceImpl extends TemplateService<Notice, String> implements NoticeService {

    private final NoticeRepository noticeRepository;

    @Override
    protected AbstractRepositoryBase<Notice,String> getRepository() {
        return noticeRepository;
    }

    @Override
    public List<Notice> getNoticeById(String id) {
        return null;
    }

    @Override
    public String insert(Notice entity){
        return super.insert(entity);
    }

    @Override
    public void update(Notice entity) {
        super.update(entity);
    }

    @Override
    public int deleteById(String id) {
        return super.deleteById(id);
    }

    @Override
    public PageResult<Notice> getPage(QueryModel<NoticeCondition> queryModel) {
        return super.page(queryModel.getCondition(),queryModel.getPaging(),queryModel.getSorts());
    }


}
