package com.alex.one.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.LinkedList;

@RestController
public class IndexController {

    @GetMapping("/")
    public String hello() {
        return "Hello there!";
    }
}

