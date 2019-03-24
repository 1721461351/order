package com.wy.order.order.service.impl;

import com.wy.order.order.DTO.OrderDTO;
import com.wy.order.order.domain.OrderMaster;
import com.wy.order.order.myclient.ProductClient;
import com.wy.order.order.repository.OrderDetailRepository;
import com.wy.order.order.repository.OrderMasterRepository;
import com.wy.order.order.service.OrderService;
import com.wy.order.order.util.KeyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * 作者：王宇
 * 创建时间：2019/3/23 0023 19:16
 * 描述：
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Autowired
    private ProductClient productClient;
    @Override
    public OrderDTO create(OrderDTO orderDTO) {
        //todo 查询商品信息
        productClient.productList();
        //todo 计算总价
        // todo 扣库存
//         订单入库
        OrderMaster orderMaster = new OrderMaster();
        orderDTO.setOrderId(KeyUtil.getUniqueKey());
        BeanUtils.copyProperties(orderDTO, orderMaster);
        orderMaster.setOrderAmount(new BigDecimal(5));
        orderMaster.setOrderStatus(1);
        orderMaster.setPayStayus(1);
        orderMasterRepository.save(orderMaster);
        return orderDTO;
    }
}
