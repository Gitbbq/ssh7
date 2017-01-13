package com.asksay.springmvc.handlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by asksa on 2017/1/13 0013.
 */
@Controller
public class HelloWorld {

    @RequestMapping("/helloworld")
    public String hello(){
        System.out.println("hello world");
        return "success";
    }

    @RequestMapping("/home")
    public String backHome(){
        System.out.println("返回主页");
        return "../../index";
    }
}
