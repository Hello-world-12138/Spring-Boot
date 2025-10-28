package com.amk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 阿明楷
 * @Date 2025/10/28:14:21
 * @See:
 */
@RestController
@RequestMapping("hello")
public class HelloController {
    @GetMapping("boot")
    public String Hello(){
        return "Hello springboot3!!";
    }

}
