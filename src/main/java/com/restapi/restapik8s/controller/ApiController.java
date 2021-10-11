package com.restapi.restapik8s.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ApiController {

    Logger logger = LoggerFactory.getLogger(ApiController.class);

    @GetMapping("/status")
    public Map<String, String> status() {
        logger.info("Entered Controller status method");
        Map<String, String> responseMap = new HashMap<>();
        responseMap.put("status", "200");
        logger.info("Exit Controller status method");
        return responseMap;
    }
}
