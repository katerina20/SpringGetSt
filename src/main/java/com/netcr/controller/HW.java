package com.netcr.controller;

import com.netcr.model.Flower;
import com.netcr.service.FlowerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HW {

    @Autowired
    @Qualifier("jdbcFlowerRepo")
    private FlowerRepo flowerRepo;

    @GetMapping("/")
    public String firstPage() {
        return "index";
    }

    @GetMapping("/flowerList")
    public String showFlowerList(Model model) {
        List<Flower> flowers = flowerRepo.getAll();
        model.addAttribute("flowers", flowers);
        return "db_page";
    }
}
