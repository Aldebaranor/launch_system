package com.soul.monitor.entity;

import com.egova.model.BaseEntity;
import com.egova.model.annotation.Display;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author: Song
 * @Date 2023/2/6 10:34
 */
@Data
@Entity
@Table(name = "artillery")
@Display("")
@EqualsAndHashCode(callSuper = true)
public class Artillery extends BaseEntity {

    public static final String NAME = "artillery";

    @Id
    @Display("主键")
    @Column(name = "id")
    private String id;

    @Display("火炮编号")
    @Column(name = "code")
    private String code;

    @Display("火炮名称")
    @Column(name = "name")
    private String name;

    @Display("火炮Ip地址")
    @Column(name = "hostIp")
    private String hostIp;

    @Display("连接状态")
    @Column(name = "connectStatus")
    private String connectStatus;

}
