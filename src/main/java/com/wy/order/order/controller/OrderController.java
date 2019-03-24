package com.wy.order.order.controller;

import com.wy.order.order.DTO.OrderDTO;
import com.wy.order.order.VO.ResultVO;
import com.wy.order.order.conver.OrderFormToOrderDTO;
import com.wy.order.order.exceptions.OrderException;
import com.wy.order.order.form.OrderForm;
import com.wy.order.order.service.OrderService;
import com.wy.order.order.service.impl.OrderServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.xml.ws.RespectBinding;
import java.util.HashMap;
import java.util.Map;

/**
 * 作者：王宇
 * 创建时间：2019/3/23 0023 20:02
 * 描述：
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
    @Autowired
    private OrderServiceImpl orderService;

    @RequestMapping(method = RequestMethod.POST,value = "/creat")
    public ResultVO creat(@Valid OrderForm orderForm,
                          BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            logger.error("创建订单出错");
            //抛出的是form中自己写的内容
            throw new OrderException(1, bindingResult.getFieldError().getDefaultMessage());
        }

        OrderDTO orderDTO = OrderFormToOrderDTO.orderformconver(orderForm);
        if (orderDTO.getOrderDetailList().size()==0){
            throw new OrderException(2,"购物车不能为空");
        }
        //创建订单
        OrderDTO order = orderService.create(orderDTO);
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(1);
        resultVO.setMsg("成功");
        Map map = new HashMap<String,String>();
        //因为定义的只有一个字段，所以不定义对象了。
        map.put("orderid",order.getOrderId());
        resultVO.setData(map);
        return resultVO;
    }
}
