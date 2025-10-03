/**
 * Copyright 2025 Alan Quintero
 * Source: https://github.com/alanquintero/openstreetmap_services
 */
package com.openstreetmap.services.service;

import com.openstreetmap.services.model.Geometry;
import com.openstreetmap.services.repository.GeometryRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

public class GeometryServiceTest {

    private GeometryRepository repository;
    private GeometryService service;

    @BeforeEach
    void setup() {
        repository = Mockito.mock(GeometryRepository.class);
        service = new GeometryService(repository);
    }

    @Test
    void getAllGeometries() {
        // Given
        final Geometry geometry = new Geometry("Polygon", "Test Region", "12345", "TX", "[[0,1]]", 1);
        when(repository.findAll()).thenReturn(List.of(geometry));

        // When
        final List<Geometry> result = service.getAllGeometries();

        // Then
        assertThat(result).hasSize(1);
        assertThat(result.get(0).getRegionName()).isEqualTo("Test Region");
    }
}
