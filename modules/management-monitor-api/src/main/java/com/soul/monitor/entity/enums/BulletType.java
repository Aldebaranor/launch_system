package com.soul.monitor.entity.enums;


import com.egova.associative.Associative;
import com.egova.associative.CodeTypeProvider;
import com.egova.model.PropertyDescriptor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
@Associative(
        name = "#{name}Dict",
        providerClass = CodeTypeProvider.class
)
public enum BulletType implements PropertyDescriptor {

    /**
     * 爆破弹
     */
    BlastBomb("0","爆破弹"),
    /**
     * 干扰弹
     */
    JammingBomb("1","干扰弹"),

    ;

    private final String value;
    private final String text;
}