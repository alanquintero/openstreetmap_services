CREATE SCHEMA IF NOT EXISTS map;

CREATE TABLE geometry
(
    id            BIGINT AUTO_INCREMENT PRIMARY KEY,
    geometry_type VARCHAR(255),
    region_name   VARCHAR(255),
    zip_code      VARCHAR(10),
    state_code    VARCHAR(10),
    arcs          VARCHAR(1000),
    state_id     INT
);