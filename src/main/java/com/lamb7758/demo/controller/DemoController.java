package com.lamb7758.demo.controller;

import com.lamb7758.demo.aop.annotation.RequestLimit;
import com.lamb7758.demo.aop.annotation.SystemControllerLog;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    final  int a =0;

    @RequestMapping("/iplimit")
    @RequestLimit(count = a,time = 3000)
    @SystemControllerLog
    public String ipLimit(){
        System.out.println("...............");
        return "success";
    }
}
