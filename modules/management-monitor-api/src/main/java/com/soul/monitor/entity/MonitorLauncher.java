package com.soul.monitor.entity;


import com.egova.model.BaseEntity;
import com.egova.model.annotation.Display;
import com.soul.monitor.enums.RocketType;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "monitor_Launcher")
@Display("")
@EqualsAndHashCode(callSuper = true)
public class MonitorLauncher  extends BaseEntity{


    public static final String NAME = "monitor:launcher";

    @Id
    @Display("主键")
    @Column(name = "id")
    private String id;

    @Display("发射车Id")
    @Column(name = "carId")
    private String carId;

    @Display("发射架编号")
    @Column(name = "code")
    private String code;

    @Display("弹类型")
    @Column(name = "type")
    private RocketType type;

    @Display("弹孔1")
    @Column(name = "rocket1")
    private String rocket1;

    @Display("弹孔2")
    @Column(name = "rocket2")
    private String rocket2;

    @Display("弹孔3")
    @Column(name = "rocket3")
    private String rocket3;

    @Display("弹孔4")
    @Column(name = "rocket4")
    private String rocket4;
}
