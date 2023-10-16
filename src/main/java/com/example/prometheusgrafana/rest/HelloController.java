package com.example.prometheusgrafana.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public String sayHello() {
        return "Hello";
    }
}
