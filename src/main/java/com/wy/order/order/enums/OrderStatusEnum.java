package com.wy.order.order.enums;

import lombok.Getter;

/**
 * 作者：王宇
 * 创建时间：2019/3/23 0023 18:40
 * 描述：
 */
@Getter
public enum OrderStatusEnum {
    NEW(1,"新下单"),
    WAIT(2,"等待下单")
    ;

    private Integer code;
    private String msg;

    OrderStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
