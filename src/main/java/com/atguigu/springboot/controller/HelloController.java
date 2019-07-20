package com.atguigu.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//这个类的所有方法返回的数据直接写给浏览器
//@ResponseBody
//@Controller
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello world quick!";
    }


}