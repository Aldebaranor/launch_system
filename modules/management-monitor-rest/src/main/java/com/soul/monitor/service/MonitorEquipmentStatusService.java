package com.soul.monitor.service;


import com.egova.model.PageResult;
import com.egova.model.QueryModel;
import com.soul.monitor.entity.MonitorEquipment;
import com.soul.monitor.entity.MonitorEquipmentStatus;
import com.soul.monitor.facade.MonitorEquipmentFacade;
import com.soul.monitor.facade.MonitorEquipmentStatusFacade;
import com.soul.monitor.model.MonitorAlert;
import org.springframework.cache.annotation.CacheConfig;

import java.util.List;

@CacheConfig(cacheNames = MonitorEquipmentStatus.NAME)
public interface MonitorEquipmentStatusService extends MonitorEquipmentStatusFacade {
    MonitorAlert getAlert(String carId);

    PageResult<MonitorEquipmentStatus> getPageAlert(QueryModel<MonitorEquipmentStatus> queryModel);
}
