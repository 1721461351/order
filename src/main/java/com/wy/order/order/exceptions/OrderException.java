package com.wy.order.order.exceptions;

import lombok.Data;

/**
 * 作者：王宇
 * 创建时间：2019/3/23 0023 20:15
 * 描述：
 */
@Data
public class OrderException extends RuntimeException{
    private int code;

    public OrderException(int code,String message){
        super(message);
        this.code = code;
    }
}
