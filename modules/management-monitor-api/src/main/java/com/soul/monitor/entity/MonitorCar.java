package com.soul.monitor.entity;


import com.egova.model.BaseEntity;
import com.egova.model.annotation.Display;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "monitor_car")
@Display("")
@EqualsAndHashCode(callSuper = true)
public class MonitorCar extends BaseEntity {

    public static final String NAME = "monitor:car";

    @Id
    @Display("主键")
    @Column(name = "id")
    private String id;

    @Display("发射车类型")
    @Column(name = "type")
    private String type;

    @Display("发射车中文名")
    @Column(name = "cname")
    private String cname;

    @Display("发射车英文名")
    @Column(name = "ename")
    private String ename;

    @Display("发射车视频监控1")
    @Column(name = "video1")
    private String video1;

    @Display("发射车视频监控1")
    @Column(name = "video1")
    private String video2;

    @Display("发射车视频监控1")
    @Column(name = "video1")
    private String video3;

    @Display("发射车视频监控1")
    @Column(name = "video1")
    private String video4;

    @Display("发射车视频监控1")
    @Column(name = "video1")
    private String video5;

    @Display("发射车视频监控1")
    @Column(name = "video1")
    private String video6;
}
