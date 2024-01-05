package com.song.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.song.config.PatternPropertiesConfig;

@RestController
@RequestMapping("/test")
public class HelloController {

    @Autowired
    private PatternPropertiesConfig patternPropertiesConfig;

    @GetMapping("/now")
    public String now(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(patternPropertiesConfig.getDateformat()));
    }

    @GetMapping("/hello")
    public String sayHello(){
        System.out.println("2023年11月29日");

        return "hello from SB3!";
    }
    
}
