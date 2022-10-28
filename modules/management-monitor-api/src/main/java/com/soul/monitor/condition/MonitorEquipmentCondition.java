package com.soul.monitor.condition;


import com.egova.model.BaseEntity;
import com.egova.model.annotation.Display;
import com.flagwind.persistent.annotation.Condition;
import com.flagwind.persistent.annotation.ConditionOperator;
import com.flagwind.persistent.model.ClauseOperator;
import com.soul.monitor.entity.MonitorCar;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@Data
@Condition
@Display("发射车设备")
public class MonitorEquipmentCondition{

    @Display("主键")
    @ConditionOperator(name = "id", operator = ClauseOperator.Equal)
    private String id;

    @Display("发射车类型")
    @ConditionOperator(name = "carType", operator = ClauseOperator.Equal)
    private String carType;

    @Display("父ID")
    @ConditionOperator(name = "parentId", operator = ClauseOperator.Equal)
    private String parentId;

    @Display("等级")
    @ConditionOperator(name = "grade", operator = ClauseOperator.Equal)
    private Integer grade;

}
