package com.example.openfeigndemo.controller;

import com.example.openfeigndemo.entity.User;
import com.example.openfeigndemo.service.OpenFeignDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author qzz
 */
@RestController
public class OpenFeignDemoController {

    @Autowired
    private OpenFeignDemoService openFeignDemoService;

    @RequestMapping("/demo1")
    public String demo(){
        return openFeignDemoService.demo();
    }

    @RequestMapping("/demo2")
    public String demo2(){
        return openFeignDemoService.demo2("张三",30);
    }

    @PostMapping("/demo3")
    public String demo3(@RequestBody User user){
        return openFeignDemoService.demo3(user);
    }

    @RequestMapping("/demo4")
    public String demo4(@RequestParam("ids") String [] ids){
        return openFeignDemoService.demo4(ids);
    }

    /**
     * 有参请求---请求体数据、普通表单数据
     * @return
     */
    @PostMapping("/demo5")
    public String demo5(@RequestBody User user,@RequestParam("address") String address){
        return openFeignDemoService.demo5(user, address);
    }
}
