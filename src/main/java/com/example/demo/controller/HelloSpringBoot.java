package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 殷涛文
 */
@Controller
public class HelloSpringBoot {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

}
