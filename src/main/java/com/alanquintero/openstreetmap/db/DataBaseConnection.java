/*******************************************************
 * Copyright (C) 2017 Alan Quintero <alan_q_b@hotmail.com>
 * 
 * This file is part of My Personal Project: "OpenLayers (with OpenStreetMap)".
 * 
 * "OpenLayers (with OpenStreetMap)" can not be copied and/or distributed without the express
 * permission of Alan Quintero.
 *******************************************************/

package com.alanquintero.openstreetmap.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:db.properties")
public class DataBaseConnection {

	private static final Logger LOGGER = Logger.getLogger(DataBaseConnection.class);

	@Value("${db_driver}")
	private String dbDriver;

	@Value("${db_url}")
	private String dbUrl;

	@Value("${db_user}")
	private String dbUser;

	@Value("${db_pass}")
	private String dbPass;

	private Connection conn;

	public Connection createConnection() {
		try {
			Class.forName(dbDriver);
			LOGGER.info("Connecting to database...");
			conn = (Connection) DriverManager.getConnection(dbUrl, dbUser, dbPass);
		} catch (SQLException e) {
			LOGGER.error(e.getMessage(), e);
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		return conn;
	}

	public void closeConnection() {
		try {
			if (conn != null) {
				conn.close();
				LOGGER.info("Database connection is closed");
			}
		} catch (SQLException e) {
			LOGGER.error(e.getMessage(), e);
		}
	}

}
