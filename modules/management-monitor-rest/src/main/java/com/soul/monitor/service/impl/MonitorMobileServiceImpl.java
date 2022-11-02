package com.soul.monitor.service.impl;


import com.egova.data.service.AbstractRepositoryBase;
import com.egova.data.service.TemplateService;
import com.flagwind.persistent.model.Sorting;
import com.soul.monitor.condition.MonitorMobileCondition;
import com.soul.monitor.domain.MonitorMobileRepository;
import com.soul.monitor.entity.MonitorMobile;
import com.soul.monitor.model.MonitorMobileModel;
import com.soul.monitor.service.MonitorMobileService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Priority;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;

@Slf4j
@Service
@Priority(5)
@RequiredArgsConstructor
public class MonitorMobileServiceImpl extends TemplateService<MonitorMobile, String> implements MonitorMobileService {

    private final MonitorMobileRepository monitorMobileRepository;

    @Override
    protected AbstractRepositoryBase<MonitorMobile, String> getRepository() {
        return monitorMobileRepository;
    }

    @Override
    public MonitorMobileModel getByCarId(String carId) {
        Random random  = new Random();
        MonitorMobileCondition monitorMobileCondition = new MonitorMobileCondition();
        monitorMobileCondition.setCarId(carId);
        List<MonitorMobile> list = query(monitorMobileCondition,new Sorting(Sorting.SortingMode.Descending,"time"));
        MonitorMobileModel monitorMobileModel = new MonitorMobileModel();
        monitorMobileModel.setLogs(list);
        monitorMobileModel.setStartPoint("113N,134E,0m");
        monitorMobileModel.setEndpoint("133N,134E,100000m");
        monitorMobileModel.setProgress(new BigDecimal(random.nextDouble()).setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue());
        return monitorMobileModel;
    }
}
