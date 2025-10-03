/**
 * Copyright 2025 Alan Quintero
 * Source: https://github.com/alanquintero/openstreetmap_services
 */
package com.openstreetmap.services.service;

import com.openstreetmap.services.model.Geometry;
import com.openstreetmap.services.repository.GeometryRepository;
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

    private final GeometryRepository repository;

    public GeometryService(GeometryRepository repository) {
        this.repository = repository;
    }

    public List<Geometry> getAllGeometries() {
        return repository.findAll();
    }
}
