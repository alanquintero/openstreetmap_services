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
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

import com.alanquintero.openstreetmap.dao.StateDAO;
import com.alanquintero.openstreetmap.db.DataBaseConnection;
import com.alanquintero.openstreetmap.mapper.StateMapper;
import com.alanquintero.openstreetmap.model.State;

@Repository
@PropertySource("classpath:query.properties")
public class StateDAOImpl implements StateDAO {

	@Autowired
	private DataBaseConnection dbConnection;

	@Value("${states}")
	private String stateQuery;

	@Override
	public List<State> getStates() {
		List<State> states = null;
		Statement stmt = null;
		try {
			stmt = dbConnection.createConnection().createStatement();
			ResultSet rs = stmt.executeQuery(stateQuery);
			states = new StateMapper().mapRow(rs, 0);
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
		return states;
	}

}
