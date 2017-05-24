/*******************************************************
 * Copyright (C) 2017 Alan Quintero <alan_q_b@hotmail.com>
 * 
 * This file is part of My Personal Project: "OpenLayers (with OpenStreetMap)".
 * 
 * "OpenLayers (with OpenStreetMap)" can not be copied and/or distributed without the express
 * permission of Alan Quintero.
 *******************************************************/

package com.alanquintero.openstreetmap.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alanquintero.openstreetmap.dao.StateDAO;
import com.alanquintero.openstreetmap.service.StateService;

@Service
public class StateServiceImpl implements StateService {

	@Autowired
	private StateDAO stateDAO;

	@Override
	public void getStates() {
		stateDAO.getStates();
	}

}
