/*******************************************************
 * Copyright (C) 2017 Alan Quintero <alan_q_b@hotmail.com>
 * 
 * This file is part of My Personal Project: "OpenLayers (with OpenStreetMap)".
 * 
 * "OpenLayers (with OpenStreetMap)" can not be copied and/or distributed without the express
 * permission of Alan Quintero.
 *******************************************************/

package com.alanquintero.openstreetmap.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.alanquintero.openstreetmap")
public class WebConfig extends WebMvcConfigurerAdapter {

}
