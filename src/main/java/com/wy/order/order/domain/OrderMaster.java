package com.wy.order.order.domain;

import com.wy.order.order.enums.OrderStatusEnum;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 作者：王宇
 * 创建时间：2019/3/23 0023 18:39
 * 描述：订单表
 */
@Data
@Entity
public class OrderMaster {
    @Id
    private String orderId;

    private String buyerName;

    private String buyerIphone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmount;
    /**支付状态，默认新订单*/
    private Integer orderStatus= OrderStatusEnum.NEW.getCode();

    /**支付状态，默认未支付*/
    private Integer payStayus= 0;

    private Date createTime;

    private Date updateTime;
}
