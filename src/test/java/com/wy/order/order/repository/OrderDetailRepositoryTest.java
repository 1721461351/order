package com.wy.order.order.repository;

import com.wy.order.order.domain.OrderDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * 作者：王宇
 * 创建时间：2019/3/23 0023 18:56
 * 描述：
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    /***
     * 测试成功
     */
    @Test
    public void save(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrderId("9999");
        orderDetail.setDetailId("2");
        orderDetail.setProductId("1234");
        orderDetail.setProdcutName("大波波鱼");
        orderDetail.setProductPrice(new BigDecimal(8.8));
        orderDetail.setProductQuantity(100);
        orderDetail.setProductIcon("http:xxx.jpg");

        orderDetailRepository.save(orderDetail);
    }

}