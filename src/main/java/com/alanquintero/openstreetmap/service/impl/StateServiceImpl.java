/*******************************************************
 * Copyright (C) 2017 Alan Quintero <alan_q_b@hotmail.com>
 * 
 * This file is part of My Personal Project: "OpenLayers (with OpenStreetMap)".
 * 
 * "OpenLayers (with OpenStreetMap)" can not be copied and/or distributed without the express
 * permission of Alan Quintero.
 *******************************************************/

package com.alanquintero.openstreetmap.service.impl;

import static com.alanquintero.openstreetmap.util.Constant.PATTERN_OPEN_SQUARE_BRAKET;
import static com.alanquintero.openstreetmap.util.Constant.PATTERN_CLOSE_SQUARE_BRAKET;
import static com.alanquintero.openstreetmap.util.Constant.OPEN_SQUARE_BRAKET;
import static com.alanquintero.openstreetmap.util.Constant.CLOSE_SQUARE_BRAKET;
import static com.alanquintero.openstreetmap.util.Constant.FEATURE_COLLECTION;
import static com.alanquintero.openstreetmap.util.Constant.FEATURE;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alanquintero.openstreetmap.dao.StateDAO;
import com.alanquintero.openstreetmap.json.StateFeature;
import com.alanquintero.openstreetmap.json.StateGeometry;
import com.alanquintero.openstreetmap.json.StateJson;
import com.alanquintero.openstreetmap.json.StateProperty;
import com.alanquintero.openstreetmap.model.State;
import com.alanquintero.openstreetmap.service.StateService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class StateServiceImpl implements StateService {

	private static final Logger LOGGER = Logger.getLogger(StateServiceImpl.class);

	@Autowired
	private StateDAO stateDAO;

	@Override
	public String getStates() {
		String jsonStr = null;
		List<State> states = stateDAO.getStates();
		List<StateFeature> features = null;
		if (states != null) {
			StateJson stateJson = new StateJson();
			stateJson.setType(FEATURE_COLLECTION);
			features = new ArrayList<>();
			for (State state : states) {
				StateFeature feacture = new StateFeature();
				StateProperty properties = new StateProperty();
				StateGeometry geometry = new StateGeometry();
				geometry.setCoordinates(state.getCoordinates());
				geometry.setType(state.getGeometryType());
				feacture.setGeometry(geometry);
				properties.setName(state.getStateName());
				feacture.setProperties(properties);
				feacture.setType(FEATURE);
				if (state.getStateNumber() < 10) {
					feacture.setId("0" + Integer.toString(state.getStateNumber()));
				} else {
					feacture.setId(Integer.toString(state.getStateNumber()));
				}
				features.add(feacture);
				feacture = null;
				properties = null;
				geometry = null;
			}
			stateJson.setFeatures(features);
			ObjectMapper mapperObj = new ObjectMapper();
			try {
				jsonStr = mapperObj.writeValueAsString(stateJson);
				jsonStr = jsonStr.toString().replace(PATTERN_OPEN_SQUARE_BRAKET, OPEN_SQUARE_BRAKET);
				jsonStr = jsonStr.toString().replace(PATTERN_CLOSE_SQUARE_BRAKET, CLOSE_SQUARE_BRAKET);
			} catch (IOException e) {
				LOGGER.error(e.getMessage(), e);
			}
		}
		return jsonStr;
	}

}
