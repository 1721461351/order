package com.wy.order.order.repository;

import com.wy.order.order.domain.OrderMaster;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * 作者：王宇
 * 创建时间：2019/3/23 0023 18:44
 * 描述：
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderMasterRepositoryTest {
    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Test
    public void save(){
        OrderMaster orderMaster = new OrderMaster();

        orderMaster.setOrderId("88888");
        orderMaster.setBuyerName("吕小布");
        orderMaster.setBuyerIphone("1256318931");
        orderMaster.setBuyerAddress("王者峡谷");
        orderMaster.setBuyerOpenid("777");
        orderMaster.setOrderAmount(new BigDecimal(9.9));
        OrderMaster save = orderMasterRepository.save(orderMaster);

        Assert.assertNotNull(save);
    }

}