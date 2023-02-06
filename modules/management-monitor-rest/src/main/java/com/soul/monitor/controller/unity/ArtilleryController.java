package com.soul.monitor.controller.unity;

import com.egova.model.PageResult;
import com.egova.model.QueryModel;
import com.egova.web.annotation.Api;
import com.soul.monitor.condition.ArtilleryCondition;
import com.soul.monitor.entity.Artillery;
import com.soul.monitor.service.ArtilleryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Song
 * @Date 2023/2/6 10:43
 */
@Slf4j
@RestController
@RequestMapping("/unity/artillery")
@RequiredArgsConstructor
public class ArtilleryController {

    @Autowired
    private ArtilleryService monitorArtilleryService;

    @Api
    @PostMapping("/page")
    public PageResult<Artillery> getPageArtillery(@RequestBody QueryModel<ArtilleryCondition> queryModel){
        return monitorArtilleryService.getPage(queryModel);
    }

    @Api
    @GetMapping("/{id}")
    public List<Artillery> getArtilleryById(@PathVariable String id){
        return monitorArtilleryService.getArtilleryById(id);
    }

    @Api
    @PostMapping
    public String insert(@RequestBody Artillery entity){
        return monitorArtilleryService.insert(entity);
    }

    @Api
    @PutMapping
    public void update(@RequestBody Artillery entity){
        monitorArtilleryService.update(entity);
    }

    @Api
    @DeleteMapping("/{id}")
    public int deleteById(@PathVariable String id){
        return monitorArtilleryService.deleteById(id);
    }

}
