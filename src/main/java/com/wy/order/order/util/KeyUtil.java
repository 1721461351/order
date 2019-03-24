package com.wy.order.order.util;

import java.util.Random;

/**
 * 作者：王宇
 * 创建时间：2019/3/23 0023 19:21
 * 描述：
 */
public class KeyUtil {
    /**
     * 生成随机数
     * 格式：日期+随机数
     * @return
     */
    public static synchronized String getUniqueKey(){
        Random random=new Random();
//        随机生成一个五位数
        Integer a= random.nextInt(90000)+10000;
        return String.valueOf(System.currentTimeMillis()+a);
    }
}
