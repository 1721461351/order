package com.wy.order.order.repository;

import com.wy.order.order.domain.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 作者：王宇
 * 创建时间：2019/3/23 0023 18:55
 * 描述：
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

}
