package com.soul.monitor.entity;


import com.egova.model.BaseEntity;
import com.egova.model.annotation.Display;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Data
@Entity
@Table(name = "monitor_equipment_status")
@Display("")
@EqualsAndHashCode(callSuper = true)
public class MonitorEquipmentStatus extends BaseEntity {

    public static final String NAME = "monitor:equipment:status";

    @Id
    @Display("主键")
    @Column(name = "id")
    private String id;

    @Display("发射车Id")
    @Column(name = "carId")
    private String carId;

    @Display("设备Id")
    @Column(name = "equipmentId")
    private String equipmentId;

    @Display("自检状态")
    @Column(name = "selfStatus")
    private String selfStatus;

    @Display("工作状态")
    @Column(name = "workStatus")
    private String workStatus;

    @Display("采纳时间")
    @Column(name = "time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String time;

    @JoinColumn(name = "equipmentId")
    @OneToOne(targetEntity = MonitorEquipment.class,mappedBy = "id")
    private MonitorEquipment monitorEquipment;

}
