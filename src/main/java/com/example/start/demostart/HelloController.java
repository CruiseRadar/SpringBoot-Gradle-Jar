package com.example.start.demostart;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    /** 
     * 화면에 문자열 표현 
     */
    @RequestMapping("/")
    public String Hello() {
        return "hello world. 스프링부트 처음 - " + LocalDateTime.now();
    }
}
