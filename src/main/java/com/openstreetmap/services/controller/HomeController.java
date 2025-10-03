/**
 * Copyright 2025 Alan Quintero
 * Source: https://github.com/alanquintero/openstreetmap_services
 */
package com.openstreetmap.services.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Default controller providing basic information about available endpoints.
 *
 * @author Alan Quintero
 */
@RestController
public class HomeController {

    /**
     * Default endpoint showing all available URLs in the API.
     *
     * @return list of available API endpoints as JSON
     */
    @GetMapping("/")
    public List<String> home() {
        return List.of(
                "/api/v1/geometries - GET all geometry records"
        );
    }
}
