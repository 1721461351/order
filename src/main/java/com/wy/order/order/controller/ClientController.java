package com.wy.order.order.controller;

import com.wy.order.order.myclient.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 作者：王宇
 * 创建时间：2019/3/24 0024 9:18
 * 描述：
 */
@RestController
public class ClientController {

    @Autowired
    private ProductClient productClient;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/getmsg")
    public String getMsg() {

//        //1.直接方式
//        RestTemplate template = new RestTemplate();
//        //第二个参数为返回值
//        String msg = template.getForObject("http://localhost:8080/msg", String.class);

        //第二种方式，通过loadBalancerClient获得ip地址，端口号等信息。
//        RestTemplate template = new RestTemplate();
//        ServiceInstance product = loadBalancerClient.choose("PRODUCT");
//        String url = String.format("http://%s:%s/msg",product.getHost(),product.getPort());
//        String msg = template.getForObject(url, String.class);

        //第三种方式，通过配置文件的方式
//        String msg = restTemplate.getForObject("http://PRODUCT/msg", String.class);

        String msg = productClient.msg();
        return msg;
    }


}
