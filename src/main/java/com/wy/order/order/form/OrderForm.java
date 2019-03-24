package com.wy.order.order.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * 作者：王宇
 * 创建时间：2019/3/23 0023 20:03
 * 描述：
 */
@Data
public class OrderForm {
    /**买家姓名*/
    @NotEmpty(message = "姓名不能为空")
    private String name;

    /**买家电话*/
    @NotEmpty(message = "电话不能为空")
    private String phone;

    /**买家地址*/
    @NotEmpty(message = "地址不能为空")
    private String address;

    /**用户微信的openId*/
    @NotEmpty(message = "openid不能为空")
    private String openId;

    /**买家的购物车*/
    @NotEmpty(message = "购物车不能为空")
    private String items;

}
