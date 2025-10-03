/**
 * Copyright 2025 Alan Quintero
 * Source: https://github.com/alanquintero/openstreetmap_services
 */
package com.openstreetmap.services.repository;

import com.openstreetmap.services.model.Geometry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for accessing Geometry entities.
 * Provides CRUD operations and Spring Data JPA query capabilities.
 *
 * @author Alan Quintero
 */
@Repository
public interface GeometryRepository extends JpaRepository<Geometry, Long> {
}
