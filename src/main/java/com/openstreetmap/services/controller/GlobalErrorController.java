/**
 * Copyright 2025 Alan Quintero
 * Source: https://github.com/alanquintero/openstreetmap_services
 */
package com.openstreetmap.services.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GlobalErrorController implements ErrorController {

    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalErrorController.class);

    @RequestMapping("/error")
    public String handleError() {
        LOGGER.info("/error redirect to home");
        // Redirect all invalid URLs to the home page
        return "redirect:/";
    }
}
