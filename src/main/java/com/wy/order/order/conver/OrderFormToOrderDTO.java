package com.wy.order.order.conver;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wy.order.order.DTO.OrderDTO;
import com.wy.order.order.domain.OrderDetail;
import com.wy.order.order.exceptions.OrderException;
import com.wy.order.order.form.OrderForm;
import org.springframework.beans.BeanUtils;

import java.util.List;

/**
 * 作者：王宇
 * 创建时间：2019/3/23 0023 20:20
 * 描述：
 */
public class OrderFormToOrderDTO {

    public static OrderDTO orderformconver(OrderForm orderForm){
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerIphone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenId());

        try {
            Gson gson = new Gson();

            //购物车
            List<OrderDetail> caddie =gson.fromJson(orderForm.getItems(), new TypeToken<List<OrderDetail>>() {}.getType());
            orderDTO.setOrderDetailList(caddie);
        }
        catch (Exception e){
            throw new OrderException(3,"json转换出错");
        }
              return orderDTO;
    }
}
