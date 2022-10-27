package com.soul.test.services;

import com.egova.datasource.annotation.SwitchDataSource;
import com.soul.test.entity.ForcesModel;
import com.soul.test.facade.ForcesModelFacade;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Description:
 * @Author: nemo
 * @Date: 2022/5/23
 */
public interface ForcesModelService extends ForcesModelFacade {


    /**
     * 主键查询
     *
     * @param id 主键
     * @return ForcesModel
     */
    ForcesModel getById(String id);

    /**
     * 新增
     *
     * @param entity 兵力模型参数
     * @return 主键
     */
    String insert(ForcesModel entity);

    /**
     * 批量新增
     * @param entity
     */
    void insertList(List<ForcesModel> entity);

    /**
     * 更新
     *
     * @param entity 兵力模型参数
     */

    void update(ForcesModel entity);

    /**
     * 主键删除
     *
     * @param id 主键
     * @return 影响记录行数
     */

    int deleteById(String id);

    /**
     * 主键批量删除
     *
     * @param ids 主键
     * @return 影响记录行数
     */
    int deleteByIds(List<String> ids);
}
