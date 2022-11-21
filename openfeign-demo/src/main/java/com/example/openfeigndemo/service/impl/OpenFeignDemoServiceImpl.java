package com.example.openfeigndemo.service.impl;

import com.example.openfeigndemo.entity.User;
import com.example.openfeigndemo.feign.ServiceDemoFeign;
import com.example.openfeigndemo.service.OpenFeignDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author qzz
 */
@Service
public class OpenFeignDemoServiceImpl implements OpenFeignDemoService {

    /**
     * 注入service-demo服务接口（在要使用的地方注入ServiceDemoFeign）
     */
    @Autowired
    private ServiceDemoFeign serviceDemoFeign;

    @Override
    public String demo() {
        return serviceDemoFeign.suiyi();
    }

    @Override
    public String demo2(String name,Integer age) {
        return serviceDemoFeign.demo2(name,age);
    }

    /**
     * 请求体传参
     * @param user
     * @return
     */
    @Override
    public String demo3(User user) {
        return serviceDemoFeign.demo3(user);
    }

    /**
     * 数组类型传参
     * @param ids
     * @return
     */
    @Override
    public String demo4(String[] ids) {
        return serviceDemoFeign.demo4(ids);
    }

    /**
     * 有参请求---请求体数据、普通表单数据
     * @return
     */
    @Override
    public String demo5(User user, String address) {
        return serviceDemoFeign.demo5(user,address);
    }
}
