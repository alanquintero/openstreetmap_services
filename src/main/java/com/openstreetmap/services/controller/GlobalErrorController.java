/**
 * Copyright 2025 Alan Quintero
 * Source: https://github.com/alanquintero/openstreetmap_services
 */
package com.openstreetmap.services.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GlobalErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        // Redirect all invalid URLs to the home page
        return "redirect:/";
    }
}
