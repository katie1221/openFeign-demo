package com.example.servicedemo.service.impl;

import com.example.servicedemo.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @author qzz
 */
@Service
public class DemoServiceImpl implements DemoService {


    @Override
    public String demo() {
        return "demo";
    }
}
