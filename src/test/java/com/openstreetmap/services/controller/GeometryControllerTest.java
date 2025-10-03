/**
 * Copyright 2025 Alan Quintero
 * Source: https://github.com/alanquintero/openstreetmap_services
 */
package com.openstreetmap.services.controller;

import com.openstreetmap.services.model.Geometry;
import com.openstreetmap.services.service.GeometryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(GeometryController.class)
public class GeometryControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private GeometryService service;

    @Test
    void getGeometries() throws Exception {
        // Given
        final Geometry geometry = new Geometry("Polygon", "Test Region", "12345", "TX", "[[0,1]]", 1);
        when(service.getAllGeometries()).thenReturn(List.of(geometry));

        // When & Then
        mockMvc.perform(get("/api/v1/geometries"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].regionName").value("Test Region"))
                .andExpect(jsonPath("$[0].geometryType").value("Polygon"));
    }
}
