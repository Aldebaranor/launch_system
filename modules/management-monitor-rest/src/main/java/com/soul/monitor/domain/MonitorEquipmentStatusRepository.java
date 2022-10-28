package com.soul.monitor.domain;

import com.egova.data.service.AbstractRepositoryBase;
import com.soul.monitor.entity.MonitorEquipment;
import com.soul.monitor.entity.MonitorEquipmentStatus;
import com.soul.monitor.model.MonitorAlert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.CacheConfig;

import java.util.List;


@CacheConfig(cacheNames = MonitorEquipmentStatus.NAME)
public interface MonitorEquipmentStatusRepository extends AbstractRepositoryBase<MonitorEquipmentStatus, String> {

    @Select("select sum(case selfStatus when '1' then 1 else 0 end) AlertNum,sum(case selfStatus when '2' then 1 else 0 end) ExceptionNum from `monitor_equipment_status` where selfStatus in ('1','2') group by carId HAVING carId = #{carId};")
    MonitorAlert getAlertNum(@Param("carId") String carId);

}
