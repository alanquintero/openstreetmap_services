/*******************************************************
 * Copyright (C) 2017 Alan Quintero <alan_q_b@hotmail.com>
 * 
 * This file is part of My Personal Project: "OpenLayers (with OpenStreetMap)".
 * 
 * "OpenLayers (with OpenStreetMap)" can not be copied and/or distributed without the express
 * permission of Alan Quintero.
 *******************************************************/

package com.alanquintero.openstreetmap.model;

public class State {

	private int idState;

	private int stateNumber;

	private String stateName;

	private String geometryType;

	private String coordinates;

	public State() {
	}

	public State(int stateNumber, String stateName, String geometryType, String coordinates) {
		super();
		this.stateNumber = stateNumber;
		this.stateName = stateName;
		this.geometryType = geometryType;
		this.coordinates = coordinates;
	}

	public State(int idState, int stateNumber, String stateName, String geometryType, String coordinates) {
		super();
		this.idState = idState;
		this.stateNumber = stateNumber;
		this.stateName = stateName;
		this.geometryType = geometryType;
		this.coordinates = coordinates;
	}

	public int getIdState() {
		return idState;
	}

	public void setIdState(int idState) {
		this.idState = idState;
	}

	public int getStateNumber() {
		return stateNumber;
	}

	public void setStateNumber(int stateNumber) {
		this.stateNumber = stateNumber;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getGeometryType() {
		return geometryType;
	}

	public void setGeometryType(String geometryType) {
		this.geometryType = geometryType;
	}

	public String getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}

}
