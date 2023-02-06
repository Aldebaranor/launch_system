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
import java.sql.Timestamp;

/**
 * @Author: Song
 * @Date 2023/2/6 14:41
 */
@Data
@Entity
@Table(name = "artillery")
@Display("")
@EqualsAndHashCode(callSuper = true)
public class Notice extends BaseEntity{
    public static final String NAME = "notice";
    @Id
    @Display("主键")
    @Column(name = "id")
    private String id;

    @Display("信息内容")
    @Column(name = "content")
    private String content;

    @Display("创建时间")
    @Column(name = "createTime")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp createTime;

    @Display("修改时间")
    @Column(name = "modifyTime")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Timestamp modifyTime;

}


