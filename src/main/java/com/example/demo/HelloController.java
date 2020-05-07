package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
    public String getHelloWorld() {

        return "HelloWorld!";
    }


}
