/**
 * Copyright 2025 Alan Quintero
 * Source: https://github.com/alanquintero/openstreetmap_services
 */
package com.openstreetmap.services.service;

import com.openstreetmap.services.controller.GeometryController;
import com.openstreetmap.services.model.Geometry;
import com.openstreetmap.services.repository.GeometryRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service layer for managing Geometry entities.
 * Encapsulates repository access and provides methods for retrieving geometries.
 *
 * @author Alan Quintero
 */
@Service
public class GeometryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(GeometryService.class);

    private final GeometryRepository repository;

    public GeometryService(GeometryRepository repository) {
        this.repository = repository;
    }

    public List<Geometry> getAllGeometries() {
        LOGGER.info("getAllGeometries");
        return repository.findAll();
    }
}
