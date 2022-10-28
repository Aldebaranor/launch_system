package com.soul.monitor.service.impl;


import com.egova.data.service.AbstractRepositoryBase;
import com.egova.data.service.ConditionParser;
import com.egova.data.service.TemplateService;
import com.egova.persistent.ClauseBuilder;
import com.flagwind.persistent.model.ChildClause;
import com.flagwind.persistent.model.Clause;
import com.flagwind.persistent.model.CombineClause;
import com.flagwind.persistent.model.SingleClause;
import com.soul.monitor.condition.MonitorEquipmentCondition;
import com.soul.monitor.domain.MonitorEquipmentRepository;
import com.soul.monitor.domain.MonitorEquipmentStatusRepository;
import com.soul.monitor.entity.MonitorEquipment;
import com.soul.monitor.entity.MonitorEquipmentStatus;
import com.soul.monitor.service.MonitorEquipmentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Priority;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@Priority(5)
@RequiredArgsConstructor
public class MonitorEquipmentServiceImpl extends TemplateService<MonitorEquipment, String> implements MonitorEquipmentService {

    private final MonitorEquipmentRepository monitorEquipmentRepository;

    private final MonitorEquipmentStatusRepository monitorEquipmentStatusRepository;

    @Override
    protected AbstractRepositoryBase<MonitorEquipment, String> getRepository() {
        return monitorEquipmentRepository;
    }

    @Override
    public List<MonitorEquipment> getBasic(String carId, String carType) {
        MonitorEquipmentCondition monitorEquipmentCondition = new MonitorEquipmentCondition();
        monitorEquipmentCondition.setCarType(carType);
        monitorEquipmentCondition.setGrade(0);
        List<MonitorEquipment> list = super.seek(monitorEquipmentCondition);
        for (int i = 0; i < list.size(); i++) {
            for (int i1 = 0; i1 < list.get(i).getChildren().size(); i1++) {
                MonitorEquipmentStatus equipmentStatus = monitorEquipmentStatusRepository.query(SingleClause.equal("carId", carId)).stream().findFirst().orElse(null);
                list.get(i).getChildren().get(i1).setSelfStatus(equipmentStatus.getSelfStatus());
                list.get(i).getChildren().get(i1).setWorkStatus(equipmentStatus.getWorkStatus());
            }
        }
        return list;
    }
}
