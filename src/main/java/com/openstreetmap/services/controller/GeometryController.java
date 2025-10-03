/**
 * Copyright 2025 Alan Quintero
 * Source: https://github.com/alanquintero/openstreetmap_services
 */
package com.openstreetmap.services.controller;

import com.openstreetmap.services.model.Geometry;
import com.openstreetmap.services.service.GeometryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST controller exposing endpoints to access Geometry data.
 * Provides JSON responses for all geometries stored in the database.
 *
 * @author Alan Quintero
 */
@RestController
@RequestMapping("/api/v1")
public class GeometryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(GeometryController.class);

    private final GeometryService geometryService;

    /**
     * Constructs the controller with the given service.
     *
     * @param geometryService Service for accessing Geometry entities.
     */
    public GeometryController(GeometryService geometryService) {
        this.geometryService = geometryService;
    }

    /**
     * Retrieves all geometries.
     * Endpoint: GET /api/v1/geometries
     *
     * @return List of Geometry objects as JSON.
     */
    @GetMapping("/geometries")
    public List<Geometry> getGeometries() {
        final List<Geometry> geometries = geometryService.getAllGeometries();
        LOGGER.info("GEOMETRIES: {}", geometries);
        return geometries;
    }

}
