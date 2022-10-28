package com.soul.monitor.entity;


import com.egova.entity.Person;
import com.egova.model.BaseEntity;
import com.egova.model.annotation.Display;
import com.soul.monitor.condition.MonitorEquipmentCondition;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "monitor_equipment")
@Display("")
@EqualsAndHashCode(callSuper = true)
public class MonitorEquipment extends BaseEntity {

    public static final String NAME = "monitor:equipment";

    @Id
    @Display("主键")
    @Column(name = "id")
    private String id;

    @Display("发射车类型")
    @Column(name = "carType")
    private String carType;

    @Display("设备中文名称")
    @Column(name = "cname")
    private String cname;

    @Display("设备英文名称")
    @Column(name = "ename")
    private String ename;

    @Display("父ID")
    @Column(name = "parentId")
    private String parentId;

    @Display("等级")
    @Column(name = "grade")
    private Integer grade;

    @Display("排序字段")
    @Column(name = "sort")
    private Integer sort;

    @Transient
    private String SelfStatus;

    @Transient
    private String WorkStatus;

    @JoinColumn(name = "id")
    @OneToMany(targetEntity = MonitorEquipment.class, mappedBy = "parentId")
    private List<MonitorEquipment> children;
}
