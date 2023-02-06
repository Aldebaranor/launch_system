package com.soul.monitor.condition;
import com.egova.model.annotation.Display;
import com.flagwind.persistent.annotation.Condition;
import com.flagwind.persistent.annotation.ConditionOperator;
import com.flagwind.persistent.model.ClauseOperator;
import lombok.Data;
import java.sql.Timestamp;

/**
 * @Author: Song
 * @Date 2023/2/6 14:52
 */
@Data
@Condition
@Display("提示信息")
public class NoticeCondition {

    @Display("主键")
    @ConditionOperator(name = "id", operator = ClauseOperator.Equal)
    private String id;

    @Display("主键")
    @ConditionOperator(name = "content", operator = ClauseOperator.Like)
    private String content;

    @Display("创建时间")
    @ConditionOperator(name = "createTime", operator = ClauseOperator.Like)
    private Timestamp createTime;

    @Display("修改时间")
    @ConditionOperator(name = "modifyTime", operator = ClauseOperator.Like)
    private Timestamp modifyTime;

}
