package com.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static sun.rmi.transport.TransportConstants.Return;

@RestController
public class DemoController {


    @RequestMapping("/hello")
    public String helloWrold(){
        return "Hello World！！！！";
    }

    @RequestMapping("/test")
    public String testJenkis(){
        return "你好呀，Jenkins!!!!";
    }



}
