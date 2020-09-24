package com.example.demo.controllers;

import java.util.List;

import com.example.demo.services.CoronaVirusDataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.models.LocationStats;

@Controller
public class HomeController {
    
    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/")
    public String home(Model model){
        //model.addAttribute("locationStats", coronaVirusDataService.getAllStats()); 1st variant
        List<LocationStats> allStats = coronaVirusDataService.getAllStats();
        int total = allStats.stream().mapToInt(stat -> stat.getTotal()).sum();
        int newCases = allStats.stream().mapToInt(stat ->stat.getDiff()).sum();
        model.addAttribute("total", total);
        model.addAttribute("locationStats", coronaVirusDataService.getAllStats());
        model.addAttribute("newCases", newCases);
        return "home";
    }
}
