package com.wy.order.order.service;

import com.wy.order.order.DTO.OrderDTO;

/**
 * 作者：王宇
 * 创建时间：2019/3/23 0023 19:13
 * 描述：
 */
public interface OrderService {

    /***
     * 创建订单
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);
}
