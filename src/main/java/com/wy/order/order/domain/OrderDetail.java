package com.wy.order.order.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 作者：王宇
 * 创建时间：2019/3/23 0023 18:54
 * 描述：
 */
@Data
@Entity
public class OrderDetail {
    @Id
    private String detailId;

    private String orderId;

    private String productId;

    private String prodcutName;

    private BigDecimal productPrice;

    private String productIcon;

    private Integer productQuantity;

    private Date createTime;

    private Date updateTime;
}
