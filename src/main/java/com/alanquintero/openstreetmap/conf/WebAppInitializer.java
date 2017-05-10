/*******************************************************
 * Copyright (C) 2017 Alan Quintero <alan_q_b@hotmail.com>
 * 
 * This file is part of My Personal Project: "OpenLayers (with OpenStreetMap)".
 * 
 * "OpenLayers (with OpenStreetMap)" can not be copied and/or distributed without the express
 * permission of Alan Quintero.
 *******************************************************/

package com.alanquintero.openstreetmap.conf;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { WebConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}
