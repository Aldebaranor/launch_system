package com.soul.monitor.condition;


import com.egova.model.BaseEntity;
import com.egova.model.annotation.Display;
import com.flagwind.persistent.annotation.Condition;
import com.flagwind.persistent.annotation.ConditionOperator;
import com.flagwind.persistent.model.ClauseOperator;
import lombok.Data;

import javax.persistence.Column;

@Data
@Condition
@Display("发射车机动日志")
public class MonitorMobileCondition{


    @Display("主键")
    @ConditionOperator(name = "id", operator = ClauseOperator.Equal)
    private String id;

    @Display("发射车Id")
    @ConditionOperator(name = "carId", operator = ClauseOperator.Equal)
    private String carId;

}
