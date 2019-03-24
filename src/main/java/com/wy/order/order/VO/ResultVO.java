package com.wy.order.order.VO;

import lombok.Data;

/**
 * 作者：王宇
 * 创建时间：2019/3/23 0023 20:06
 * 描述：
 */
@Data
public class ResultVO<T> {

    /**错误码*/
    private Integer code;
    /**提示信息*/
    private String msg;
    /**自定义类型的data*/
    private T data;

}
