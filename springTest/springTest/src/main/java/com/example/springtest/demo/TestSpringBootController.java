package com.example.springtest.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ouyangwu
 * @date 2022/8/10 9:05 下午
 */
@RestController
@RequestMapping("/test")
public class TestSpringBootController {

    @RequestMapping("/spring")
    public String hello(){
        return "SpringBoot SUCCESS!";
    }
}

