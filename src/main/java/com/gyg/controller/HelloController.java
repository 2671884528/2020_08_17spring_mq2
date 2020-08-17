package com.gyg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @auther 郭永钢
 * @data 2020/8/17 19:27
 * @desc:
 */
@Controller
@RequestMapping("/home")
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
