package com.netcr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HW {
    @GetMapping("/")
    public String firstPage() {
        return "index";
    }
}
