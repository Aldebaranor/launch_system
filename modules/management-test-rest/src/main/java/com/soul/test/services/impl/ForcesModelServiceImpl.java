package com.soul.test.services.impl;

import com.egova.data.service.AbstractRepositoryBase;
import com.egova.data.service.TemplateService;
import com.soul.test.domain.cluster.ForcesModelRepository;
import com.soul.test.entity.ForcesModel;
import com.soul.test.services.ForcesModelService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Priority;


/**
 * @Description:
 * @Author: nemo
 * @Date: 2022/5/23
 */
@Slf4j
@Service
@Priority(5)
@RequiredArgsConstructor
public class ForcesModelServiceImpl extends TemplateService<ForcesModel, String> implements ForcesModelService {

    private final ForcesModelRepository forcesModelRepository;


    @Override
    protected AbstractRepositoryBase<ForcesModel, String> getRepository() {
        return forcesModelRepository;
    }

}
