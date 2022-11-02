package com.soul.monitor.model;

import com.soul.monitor.entity.MonitorMobile;
import lombok.Data;

import java.io.Serializable;
import java.util.List;


@Data
public class MonitorMobileModel implements Serializable {
    private String StartPoint;
    private String Endpoint;
    private Double Progress;
    private List<MonitorMobile> logs;
}
