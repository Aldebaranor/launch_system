package com.soul.monitor.condition;

import com.egova.model.annotation.Display;
import com.flagwind.persistent.annotation.Condition;
import com.flagwind.persistent.annotation.ConditionOperator;
import com.flagwind.persistent.model.ClauseOperator;
import lombok.Data;


/**
 * @Author: Song
 * @Date 2023/2/6 10:57
 */
@Data
@Condition
@Display("火炮")
public class ArtilleryCondition {

    @Display("主键")
    @ConditionOperator(name = "id", operator = ClauseOperator.Equal)
    private String id;

    @Display("火炮编号")
    @ConditionOperator(name = "code", operator = ClauseOperator.Equal)
    private String code;

    @Display("火炮名称")
    @ConditionOperator(name = "name", operator = ClauseOperator.Like)
    private String name;

    @Display("火炮Ip地址")
    @ConditionOperator(name = "hostIp", operator = ClauseOperator.Equal)
    private String hostIp;

}
