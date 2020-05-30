package com.calculator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumController {

    @RequestMapping("sum")
    public double sum(@RequestParam("x") double x, @RequestParam("y") double y) {
        return x + y;
    }

}
