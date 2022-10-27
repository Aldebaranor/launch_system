package com.soul.test.entity;

import com.egova.model.BaseEntity;
import com.egova.model.annotation.Display;
import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.*;

/**
 * @Description:
 * @Author: nemo
 * @Date: 2022/3/22
 */
@Data
@Entity
@Table(name = "meta_forces_model")
@Display("想定中兵力的模型参数")
@EqualsAndHashCode(callSuper = true)
public class ForcesModel extends BaseEntity {

    public static final String NAME = "meta:forces-model";

    @Id
    @Display("主键")
    @Column(name = "id")
    private String id;

    @Display("兵力ID")
    @Column(name = "forcesId")
    private String forcesId;

    @Display("试验ID")
    @Column(name = "experimentId")
    private String experimentId;

    @Display("模型属性")
    @Column(name = "apiInfo")
    private String apiInfo;
}
