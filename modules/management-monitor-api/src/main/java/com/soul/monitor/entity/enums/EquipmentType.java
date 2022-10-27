package com.soul.monitor.entity.enums;

import com.egova.associative.Associative;
import com.egova.associative.CodeTypeProvider;
import com.egova.model.PropertyDescriptor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Associative(
        name = "#{name}Dict",
        providerClass = CodeTypeProvider.class
)
public enum EquipmentType implements PropertyDescriptor {

    /**
     * 配电系统
     */
    DistributionSystem("0","配电系统"),
    /**
     * 发射系统
     */
    LaunchSystem("1","发射系统"),
    /**
     * 操瞄系统
     */
    OperationAimingSystem("2","操瞄系统"),
    /**
     * 控制系统
     */
    ControlSystem("3","控制系统"),
    /**
     * 监控系统
     */
    MonitoringSystem("4","监控系统"),
    /**
     * 中心控制器系统
     */
    CentralControllerSystem("5","中心控制器系统"),
    ;
    private final String value;
    private final String text;
}
