package com.soul.test.controller.free;

import com.egova.datasource.annotation.SwitchDataSource;
import com.egova.web.annotation.Api;
import com.soul.test.entity.ForcesModel;
import com.soul.test.services.ForcesModelService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Description:
 * @Author: nemo
 * @Date: 2022/3/22
 */
@Slf4j
@RestController
@RequestMapping("/free/forces-model")
@RequiredArgsConstructor
public class ForceModelController {

    private final ForcesModelService forcesModelService;

    /**
     * 主键获取
     *
     * @param id 主键
     * @return MapSetting
     */
    @Api
    @GetMapping(value = "/{id}")
    @SwitchDataSource("mysql2")
    //@Transactional(rollbackFor = Exception.class,propagation = Propagation.REQUIRES_NEW)
    public ForcesModel getById(@PathVariable String id) {
        return forcesModelService.getById(id);
    }
}
