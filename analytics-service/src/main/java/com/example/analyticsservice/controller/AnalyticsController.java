package com.example.analyticsservice.controller;

import com.example.analyticsservice.service.ProductStreamProcessor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping
public class AnalyticsController {

    @GetMapping
    public Map<Integer, Integer> getTotalPrice() {
        return ProductStreamProcessor.products;
    }
}
