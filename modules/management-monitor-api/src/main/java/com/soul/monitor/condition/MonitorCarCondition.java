package com.soul.monitor.condition;


import com.egova.model.BaseEntity;
import com.egova.model.annotation.Display;
import com.flagwind.persistent.annotation.Condition;
import com.flagwind.persistent.annotation.ConditionOperator;
import com.flagwind.persistent.model.ClauseOperator;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Condition
@Display("发射车")
public class MonitorCarCondition extends BaseEntity {


    @Display("主键")
    @ConditionOperator(name = "id", operator = ClauseOperator.Equal)
    private String id;

    @Display("发射车类型")
    @ConditionOperator(name = "type", operator = ClauseOperator.Equal)
    private String type;

}
