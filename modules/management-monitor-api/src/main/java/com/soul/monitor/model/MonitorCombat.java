package com.soul.monitor.model;


import lombok.Data;

import java.io.Serializable;

@Data
public class MonitorCombat implements Serializable {
    /**
     * 中文名称
     */
    private String name;
    /**
     * 英文名称
     */
    private String text;
    /**
     * 状态
     */
    private String value;
}
