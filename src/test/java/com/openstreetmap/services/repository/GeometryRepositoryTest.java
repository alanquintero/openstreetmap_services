/**
 * Copyright 2025 Alan Quintero
 * Source: https://github.com/alanquintero/openstreetmap_services
 */
package com.openstreetmap.services.repository;

import com.openstreetmap.services.model.Geometry;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class GeometryRepositoryTest {

    @Autowired
    private GeometryRepository repository;

    @Test
    void findAll_checkPreloadedRecords() {
        // Given & When
        final List<Geometry> geometries = repository.findAll();

        // Then
        assertThat(geometries).isNotEmpty();
        assertThat(geometries.get(0).getGeometryType()).isEqualTo("Polygon");
        assertThat(geometries.get(1).getRegionName()).isEqualTo("WEST PIMA COUNTY");
        assertThat(geometries.get(3).getZipCode()).isEqualTo("00016");
        assertThat(geometries.get(4).getStateCode()).isEqualTo("CA");
        assertThat(geometries.get(5).getArcs()).isEqualTo("[[30, 31, 32, 33, 34, 35, 36, 37]]");
        assertThat(geometries.get(6).getStateId()).isEqualTo(5);
    }

    @Test
    void findAll_saveNewRecord() {
        // Given
        final Geometry geometry = new Geometry("Polygon", "Test Region", "12345", "TX", "[[0,1]]", 1);
        repository.save(geometry);

        // When
        final List<Geometry> geometries = repository.findAll();

        // Then
        assertThat(geometries).isNotEmpty();
        assertThat(geometries.get(geometries.size() - 1).getRegionName()).isEqualTo("Test Region");
    }
}
