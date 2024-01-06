package com.xipengyuan.demo.mybatisplus.dal.enumeration;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

@Getter
public enum Grade {

    PRIMARY(0, "小学"),
    SECONDARY(1, "初中"),
    HIGH(2, "高中");

    @EnumValue
    private final int code;

    private final String desc;

    Grade(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
