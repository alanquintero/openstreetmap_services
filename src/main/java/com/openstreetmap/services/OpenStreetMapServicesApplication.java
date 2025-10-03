/**
 * Copyright 2025 Alan Quintero
 * Source: https://github.com/alanquintero/openstreetmap_services
 */
package com.openstreetmap.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main entry point for the OpenStreetMap Services application.
 * <p>
 * This class bootstraps the Spring Boot application, initializing the
 * application context, loading all Spring components, and starting the embedded server.
 * </p>
 * <p>
 * Once started, the REST controllers, services, and repositories defined
 * in the application become available for handling HTTP requests.
 * </p>
 *
 * @author Alan Quintero
 */
@SpringBootApplication
public class OpenStreetMapServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenStreetMapServicesApplication.class, args);
    }
}
