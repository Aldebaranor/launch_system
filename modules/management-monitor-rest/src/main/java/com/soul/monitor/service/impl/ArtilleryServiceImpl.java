package com.soul.monitor.service.impl;

import com.egova.data.service.AbstractRepositoryBase;
import com.egova.data.service.TemplateService;
import com.egova.model.PageResult;
import com.egova.model.QueryModel;
import com.soul.monitor.condition.ArtilleryCondition;
import com.soul.monitor.domain.ArtilleryRepository;
import com.soul.monitor.entity.Artillery;
import com.soul.monitor.service.ArtilleryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Song
 * @Date 2023/2/6 10:49
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class ArtilleryServiceImpl extends TemplateService<Artillery,String> implements ArtilleryService {

    private final ArtilleryRepository artilleryRepository;

    @Override
    protected AbstractRepositoryBase<Artillery,String> getRepository() {
        return artilleryRepository;
    }

    @Override
    public List<Artillery> getArtilleryById(String id) {
        ArtilleryCondition artilleryCondition = new ArtilleryCondition();
        artilleryCondition.setId(id);
        return super.query(artilleryCondition);
    }

    @Override
    public String insert(Artillery entity) {
        return super.insert(entity);
    }

    @Override
    public void update(Artillery entity) {
        super.update(entity);
    }

    @Override
    public int deleteById(String id) {
        return super.deleteById(id);
    }

    @Override
    public PageResult<Artillery> getPage(QueryModel<ArtilleryCondition> queryModel) {
        return super.page(queryModel.getCondition(),queryModel.getPaging(),queryModel.getSorts());
    }

}
