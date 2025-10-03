/**
 * Copyright 2025 Alan Quintero
 * Source: https://github.com/alanquintero/openstreetmap_services
 */
package com.openstreetmap.services.model;

import jakarta.persistence.*;

/**
 * Entity representing a geographic geometry.
 * Stores information about the type of geometry, region, ZIP code, state, and arcs.
 *
 * @author Alan Quintero
 */
@Entity
@Table(name = "geometry")
public class Geometry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String geometryType;
    private String regionName;
    private String zipCode;
    private String stateCode;

    @Column(columnDefinition = "VARCHAR(1000)")
    private String arcs;

    private int stateId;

    public Geometry() {
    }

    public Geometry(final String geometryType, final String regionName, final String zipCode, final String stateCode, final String arcs, final int stateId) {
        this.geometryType = geometryType;
        this.regionName = regionName;
        this.zipCode = zipCode;
        this.stateCode = stateCode;
        this.arcs = arcs;
        this.stateId = stateId;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGeometryType() {
        return geometryType;
    }

    public void setGeometryType(String geometryType) {
        this.geometryType = geometryType;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    public String getArcs() {
        return arcs;
    }

    public void setArcs(String arcs) {
        this.arcs = arcs;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(final int stateId) {
        this.stateId = stateId;
    }

}
