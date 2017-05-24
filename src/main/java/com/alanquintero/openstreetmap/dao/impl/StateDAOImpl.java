/*******************************************************
 * Copyright (C) 2017 Alan Quintero <alan_q_b@hotmail.com>
 * 
 * This file is part of My Personal Project: "OpenLayers (with OpenStreetMap)".
 * 
 * "OpenLayers (with OpenStreetMap)" can not be copied and/or distributed without the express
 * permission of Alan Quintero.
 *******************************************************/

package com.alanquintero.openstreetmap.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.alanquintero.openstreetmap.dao.StateDAO;
import com.alanquintero.openstreetmap.db.DataBaseConnection;

@Repository
public class StateDAOImpl implements StateDAO {

	private static final Logger LOGGER = Logger.getLogger(StateDAOImpl.class);

	@Autowired
	private DataBaseConnection dbConnection;

	@Override
	public void getStates() {
		Statement stmt = null;
		try {
			stmt = dbConnection.createConnection().createStatement();
			String sql = "SELECT * from state where idState = 1";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				LOGGER.info("State Name: " + rs.getString("stateName"));
			}
		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException se2) {
			}
			dbConnection.closeConnection();
		}
	}

}
