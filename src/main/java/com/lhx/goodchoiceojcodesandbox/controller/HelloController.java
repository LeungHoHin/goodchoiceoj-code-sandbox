package com.lhx.goodchoiceojcodesandbox.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class HelloController {


    @GetMapping("/world")
    public String hello() {
        return "Hello world!";
    }
}
