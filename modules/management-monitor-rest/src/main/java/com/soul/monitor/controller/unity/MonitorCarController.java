package com.soul.monitor.controller.unity;


import com.egova.model.PageResult;
import com.egova.model.QueryModel;
import com.egova.web.annotation.Api;
import com.soul.monitor.entity.MonitorCar;
import com.soul.monitor.entity.MonitorEquipment;
import com.soul.monitor.entity.MonitorEquipmentStatus;
import com.soul.monitor.entity.MonitorLauncher;
import com.soul.monitor.enums.StatusType;
import com.soul.monitor.model.MonitorAlert;
import com.soul.monitor.model.MonitorCombat;
import com.soul.monitor.model.MonitorMobileModel;
import com.soul.monitor.service.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/unity/monitor/car")
@RequiredArgsConstructor
public class MonitorCarController {

    private final MonitorCarService monitorCarService;

    private final MonitorLauncherService monitorLauncherService;

    private final MonitorEquipmentService monitorEquipmentService;

    private final MonitorEquipmentStatusService monitorEquipmentStatusService;

    private final MonitorMobileService monitorMobileService;


    /**
     * 获取发射车总览状态接口
     */
    @Api
    @GetMapping("/combat/{carId}")
    public List<MonitorCombat> getCombat(@PathVariable String carId){
        List<MonitorCombat> responseList = new ArrayList();
        MonitorCombat monitorCombat1 = new MonitorCombat();
        monitorCombat1.setValue(StatusType.Alert.getValue());
        monitorCombat1.setText("机动能力");
        monitorCombat1.setName("Maneuverability");
        MonitorCombat monitorCombat2 = new MonitorCombat();
        monitorCombat2.setValue(StatusType.Normal.getValue());
        monitorCombat2.setText("发射能力");
        monitorCombat2.setName("LaunchCapability");
        MonitorCombat monitorCombat3 = new MonitorCombat();
        monitorCombat3.setValue(StatusType.Normal.getValue());
        monitorCombat3.setText("通联能力");
        monitorCombat3.setName("CommunicationCapability");
        responseList.add(monitorCombat1);
        responseList.add(monitorCombat2);
        responseList.add(monitorCombat3);
        return responseList;
    }

    /**
     * 获取发射车基本状态
     */
    @Api
    @GetMapping("/basic")
    public List<MonitorEquipment> getBasic(@RequestParam(name = "carId") String carId , @RequestParam(name = "carType") String carType){
        return monitorEquipmentService.getBasic(carId,carType);
    }

    /**
     * 获取发射车列表
     */
    @Api
    @GetMapping("/all")
    public List<MonitorCar> getCarAll(){
        return monitorCarService.getAll();
    }

    /**
     * 获取发射车车发射架列表
     */
    @Api
    @GetMapping("/launcher/{carId}")
    public List<MonitorLauncher> getLauncherByCarId(@PathVariable String carId){
        return monitorLauncherService.getLauncherByCarId(carId);
    }

    /**
     * 获取告警数据
     */
    @Api
    @GetMapping("/alert/{carId}")
    public MonitorAlert getAlert(@PathVariable String carId){
        return monitorEquipmentStatusService.getAlert(carId);
    }

    /**
     * 分页获取告警数据
     */
    @Api
    @PostMapping("/page/alert")
    public PageResult<MonitorEquipmentStatus> getPageAlert(@RequestBody QueryModel<MonitorEquipmentStatus> queryModel){
        return monitorEquipmentStatusService.getPageAlert(queryModel);
    }

    /**
     * 获取发射车任务状态的机动列表
     */
    @Api
    @GetMapping("/mobile/{carId}")
    public MonitorMobileModel getMobile(@PathVariable String carId){
        return monitorMobileService.getByCarId(carId);
    }

}
