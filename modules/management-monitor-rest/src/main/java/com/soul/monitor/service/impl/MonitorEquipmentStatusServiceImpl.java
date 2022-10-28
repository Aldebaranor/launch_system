package com.soul.monitor.service.impl;


import com.egova.data.service.AbstractRepositoryBase;
import com.egova.data.service.TemplateService;
import com.egova.model.PageResult;
import com.egova.model.QueryModel;
import com.egova.persistent.ClauseBuilder;
import com.flagwind.persistent.model.Clause;
import com.flagwind.persistent.model.SingleClause;
import com.flagwind.persistent.model.Sorting;
import com.soul.monitor.condition.MonitorEquipmentCondition;
import com.soul.monitor.domain.MonitorEquipmentRepository;
import com.soul.monitor.domain.MonitorEquipmentStatusRepository;
import com.soul.monitor.entity.MonitorEquipment;
import com.soul.monitor.entity.MonitorEquipmentStatus;
import com.soul.monitor.enums.StatusType;
import com.soul.monitor.model.MonitorAlert;
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

    @Override
    public MonitorAlert getAlert(String carId) {
        MonitorAlert monitorAlert =  monitorEquipmentStatusRepository.getAlertNum(carId);
        Clause clause = ClauseBuilder.and()
                .add(SingleClause.equal("carId", carId))
                .add(SingleClause.in("selfStatus", StatusType.Alert.getValue(), StatusType.Exception.getValue())).toClause();
        List<MonitorEquipmentStatus> equipmentStatusList = monitorEquipmentStatusRepository.seek(clause, Sorting.descending("time"));
        if (equipmentStatusList.size() > 5) {
            equipmentStatusList = equipmentStatusList.subList(0,5);
        }
        monitorAlert.setMonitorEquipmentStatuses(equipmentStatusList);
        return monitorAlert;
    }

    @Override
    public PageResult<MonitorEquipmentStatus> getPageAlert(QueryModel<MonitorEquipmentStatus> queryModel) {
        MonitorEquipmentStatus condition = queryModel.getCondition();
        String carId = condition.getCarId();
        Clause clause = ClauseBuilder.and()
                .add(SingleClause.equal("carId", carId))
                .add(SingleClause.in("selfStatus", StatusType.Alert.getValue(), StatusType.Exception.getValue())).toClause();
        List<MonitorEquipmentStatus> list = monitorEquipmentStatusRepository.seek(clause, queryModel.getPaging(), queryModel.getSorts());
        return PageResult.of(list,list.size());
    }

}
