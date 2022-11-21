package com.example.servicedemo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.servicedemo.entity.User;
import com.example.servicedemo.service.DemoService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author qzz
 */
@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    /**
     * 无参请求
     * @return
     */
    @RequestMapping("/demo")
    public String demo(){
        return demoService.demo();
    }

    /**
     * 有参请求---简单数据类型参数
     * @return
     */
    @RequestMapping("/demo2")
    public String demo2(@RequestParam("name")String name,@RequestParam("age")Integer age){
        return "name:"+name+",age:"+age;
    }

    /**
     * 请求体传参
     * @param user
     * @return
     */
    @PostMapping("/demo3")
    String demo3(@RequestBody User user){
        return "接收的请求体参数为："+ JSONObject.toJSONString(user);
    }

    /**
     * 有参请求---数组类型
     * @return
     */
    @RequestMapping("/demo4")
    public String demo4(@RequestParam("ids") String [] ids){
        return "ids数组:"+JSONObject.toJSONString(ids);
    }

    /**
     * 有参请求---请求体数据、普通表单数据
     * @return
     */
    @PostMapping("/demo5")
    public String demo5(@RequestBody User user,String address){
        return "id:"+user.getId()+",name:"+user.getName()+",age:"+user.getAge()+",address:"+address;
    }
}
