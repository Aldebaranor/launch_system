package com.soul.monitor.condition;


import com.egova.model.BaseEntity;
import com.egova.model.annotation.Display;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.flagwind.persistent.annotation.Condition;
import com.flagwind.persistent.annotation.ConditionOperator;
import com.flagwind.persistent.model.ClauseOperator;
import com.soul.monitor.entity.MonitorEquipment;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Data
@Condition
@Display("发射车设备状态")
public class MonitorEquipmentStatusCondition{


    @Display("主键")
    @ConditionOperator(name = "id", operator = ClauseOperator.Equal)
    private String id;

    @Display("发射车Id")
    @ConditionOperator(name = "carId", operator = ClauseOperator.Equal)
    private String carId;

    @Display("设备Id")
    @ConditionOperator(name = "equipmentId", operator = ClauseOperator.Equal)
    private String equipmentId;

    @Display("自检状态")
    @ConditionOperator(name = "selfStatus", operator = ClauseOperator.Equal)
    private String selfStatus;

    @Display("工作状态")
    @ConditionOperator(name = "workStatus", operator = ClauseOperator.Equal)
    private String workStatus;

}
