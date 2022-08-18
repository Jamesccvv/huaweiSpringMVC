package com.huawei.demomvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CaseController {
    @GetMapping(value = "/hello")
    public String hello(){
        return "HELLO JAVA";
    }
}
