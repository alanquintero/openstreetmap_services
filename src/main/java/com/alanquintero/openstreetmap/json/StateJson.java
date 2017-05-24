/*******************************************************
 * Copyright (C) 2017 Alan Quintero <alan_q_b@hotmail.com>
 * 
 * This file is part of My Personal Project: "OpenLayers (with OpenStreetMap)".
 * 
 * "OpenLayers (with OpenStreetMap)" can not be copied and/or distributed without the express
 * permission of Alan Quintero.
 *******************************************************/

package com.alanquintero.openstreetmap.json;

import java.util.List;

public class StateJson {

	private String type;

	private List<StateFeature> features;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<StateFeature> getFeatures() {
		return features;
	}

	public void setFeatures(List<StateFeature> features) {
		this.features = features;
	}

}
