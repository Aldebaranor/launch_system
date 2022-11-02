package com.soul.monitor.entity;


import com.egova.model.BaseEntity;
import com.egova.model.annotation.Display;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "monitor_mobile")
@Display("")
@EqualsAndHashCode(callSuper = true)
public class MonitorMobile extends BaseEntity {

    public static final String NAME = "monitor：mobile";

    @Id
    @Display("主键")
    @Column(name = "id")
    private String id;

    @Display("发射车Id")
    @Column(name = "carId")
    private String carId;

    @Display("发射车机动日志")
    @Column(name = "log")
    private String log;

    @Display("日志时间")
    @Column(name = "time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private String time;

}
