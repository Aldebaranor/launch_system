package com.soul.monitor.service.impl;


import com.egova.data.service.AbstractRepositoryBase;
import com.egova.data.service.TemplateService;
import com.soul.monitor.condition.MonitorEquipmentCondition;
import com.soul.monitor.domain.MonitorEquipmentRepository;
import com.soul.monitor.domain.MonitorEquipmentStatusRepository;
import com.soul.monitor.entity.MonitorEquipment;
import com.soul.monitor.entity.MonitorEquipmentStatus;
import com.soul.monitor.service.MonitorEquipmentService;
import com.soul.monitor.service.MonitorEquipmentStatusService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Priority;
import java.util.List;

@Slf4j
@Service
@Priority(5)
@RequiredArgsConstructor
public class MonitorEquipmentStatusServiceImpl extends TemplateService<MonitorEquipmentStatus, String> implements MonitorEquipmentStatusService {

    private final MonitorEquipmentStatusRepository monitorEquipmentStatusRepository;

    @Override
    protected AbstractRepositoryBase<MonitorEquipmentStatus, String> getRepository() {
        return monitorEquipmentStatusRepository;
    }

}
