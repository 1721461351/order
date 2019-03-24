package com.wy.order.order.DTO;

import com.wy.order.order.domain.OrderDetail;
import com.wy.order.order.enums.OrderStatusEnum;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 作者：王宇
 * 创建时间：2019/3/23 0023 19:14
 * 描述：
 */
@Data
public class OrderDTO {

    private String orderId;

    private String buyerName;

    private String buyerIphone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmount;
    /**支付状态，默认新订单*/
    private Integer orderStatus= OrderStatusEnum.NEW.getCode();

    /**支付状态，默认未支付*/
    private Integer payStayus;

    private Date createTime;

    private Date updateTime;

    /**订单详情的list，一个订单可以多个订单详情*/
    private List<OrderDetail> orderDetailList;

}
