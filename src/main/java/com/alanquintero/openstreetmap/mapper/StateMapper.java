/*******************************************************
 * Copyright (C) 2017 Alan Quintero <alan_q_b@hotmail.com>
 * 
 * This file is part of My Personal Project: "OpenLayers (with OpenStreetMap)".
 * 
 * "OpenLayers (with OpenStreetMap)" can not be copied and/or distributed without the express
 * permission of Alan Quintero.
 *******************************************************/

package com.alanquintero.openstreetmap.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.alanquintero.openstreetmap.model.State;

public class StateMapper implements RowMapper<List<State>> {

	@Override
	public List<State> mapRow(ResultSet rs, int rowNum) throws SQLException {
		List<State> states = new ArrayList<>();
		while (rs.next()) {
			State state = new State(rs.getInt("stateNumber"), rs.getString("stateName"), rs.getString("geometryType"),
					rs.getString("coordinates"));
			states.add(state);
			state = null;
		}
		return states;
	}

}
