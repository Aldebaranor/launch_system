package com.soul.monitor.service.impl;


import com.egova.data.service.AbstractRepositoryBase;
import com.egova.data.service.TemplateService;
import com.soul.monitor.domain.MonitorCarRepository;
import com.soul.monitor.entity.MonitorCar;
import com.soul.monitor.service.MonitorCarService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Priority;

@Slf4j
@Service
@Priority(5)
@RequiredArgsConstructor
public class MonitorCarServiceImpl extends TemplateService<MonitorCar, String> implements MonitorCarService {

    private final MonitorCarRepository monitorCarRepository;

    @Override
    protected AbstractRepositoryBase<MonitorCar, String> getRepository() {
        return monitorCarRepository;
    }
}
