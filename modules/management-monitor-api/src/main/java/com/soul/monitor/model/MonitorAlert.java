package com.soul.monitor.model;

import com.soul.monitor.entity.MonitorEquipmentStatus;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class MonitorAlert implements Serializable {

    private Integer AlertNum;
    private Integer ExceptionNum;
    private List<MonitorEquipmentStatus> monitorEquipmentStatuses;
}
