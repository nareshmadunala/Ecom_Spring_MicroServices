package com.madunala.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nareshmadunala
 */

@RestController
@RequestMapping("/api/v1/")
public class OrderController {

    @GetMapping("/sayhi")
    public String sayHi(){
        return "Hello !!";
    }
}
