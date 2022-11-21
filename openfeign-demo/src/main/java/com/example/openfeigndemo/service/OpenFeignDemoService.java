package com.example.openfeigndemo.service;

import com.example.openfeigndemo.entity.User;

/**
 * @author qzz
 */
public interface OpenFeignDemoService {

    /**
     * 无参请求方法
     * @return
     */
    String demo();

    /**
     * 简单参数请求方法
     * @return
     */
    String demo2(String name,Integer age);

    /**
     * 请求体传参
     * @param user
     * @return
     */
    String demo3(User user);

    /**
     * 数组类型传参
     * @param ids
     * @return
     */
    String demo4(String[] ids);

    /**
     * 有参请求---请求体数据、普通表单数据
     * @return
     */
    String demo5(User user, String address);
}
