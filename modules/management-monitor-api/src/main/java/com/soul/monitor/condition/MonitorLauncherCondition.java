package com.soul.monitor.condition;


import com.egova.model.annotation.Display;
import com.flagwind.persistent.annotation.Condition;
import com.flagwind.persistent.annotation.ConditionOperator;
import com.flagwind.persistent.model.ClauseOperator;
import lombok.Data;

@Data
@Condition
@Display("发射架")
public class MonitorLauncherCondition {

    @Display("主键")
    @ConditionOperator(name = "id", operator = ClauseOperator.Equal)
    private String id;

    @Display("发射车Id")
    @ConditionOperator(name = "carId", operator = ClauseOperator.Equal)
    private String carId;

    @Display("发射架编号")
    @ConditionOperator(name = "code", operator = ClauseOperator.Equal)
    private String code;

    @Display("弹类型")
    @ConditionOperator(name = "type", operator = ClauseOperator.Equal)
    private String type;
}
