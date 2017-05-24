/*******************************************************
 * Copyright (C) 2017 Alan Quintero <alan_q_b@hotmail.com>
 * 
 * This file is part of My Personal Project: "OpenLayers (with OpenStreetMap)".
 * 
 * "OpenLayers (with OpenStreetMap)" can not be copied and/or distributed without the express
 * permission of Alan Quintero.
 *******************************************************/

package com.alanquintero.openstreetmap.json;

public class StateFeature {

	private String type;

	private String id;

	private StateProperty properties;
	
	private StateGeometry geometry;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public StateProperty getProperties() {
		return properties;
	}

	public void setProperties(StateProperty properties) {
		this.properties = properties;
	}

	public StateGeometry getGeometry() {
		return geometry;
	}

	public void setGeometry(StateGeometry geometry) {
		this.geometry = geometry;
	}

}
