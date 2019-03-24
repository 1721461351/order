package com.wy.order.order.myclient;

import com.wy.order.order.VO.ResultVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作者：王宇
 * 创建时间：2019/3/24 0024 11:01
 * 描述：
 */
@Component
@FeignClient(name = "product")
public interface ProductClient {

    //msg要和服务器端的访问路径一致，注意这里要写getmapping
    @GetMapping("/msg")
    String msg();


}
