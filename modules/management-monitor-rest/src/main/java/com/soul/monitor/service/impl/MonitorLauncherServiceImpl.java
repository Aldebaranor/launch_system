package com.soul.monitor.service.impl;


import com.egova.data.service.AbstractRepositoryBase;
import com.egova.data.service.TemplateService;
import com.flagwind.persistent.model.ChildClause;
import com.soul.monitor.condition.MonitorLauncherCondition;
import com.soul.monitor.domain.MonitorCarRepository;
import com.soul.monitor.domain.MonitorLauncherRepository;
import com.soul.monitor.entity.MonitorCar;
import com.soul.monitor.entity.MonitorLauncher;
import com.soul.monitor.service.MonitorCarService;
import com.soul.monitor.service.MonitorLauncherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Priority;
import java.util.List;

@Slf4j
@Service
@Priority(5)
@RequiredArgsConstructor
public class MonitorLauncherServiceImpl extends TemplateService<MonitorLauncher, String> implements MonitorLauncherService {

    private final MonitorLauncherRepository monitorLauncherRepository;

    @Override
    protected AbstractRepositoryBase<MonitorLauncher, String> getRepository() {
        return monitorLauncherRepository;
    }

    @Override
    public List<MonitorLauncher> getLauncherByCarId(String carId) {
        MonitorLauncherCondition monitorLauncherCondition  = new MonitorLauncherCondition();
        monitorLauncherCondition.setCarId(carId);
        return super.query(monitorLauncherCondition);
    }
}
