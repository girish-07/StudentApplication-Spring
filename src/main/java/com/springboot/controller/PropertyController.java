package com.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/property")
public class PropertyController {
	
	@Value("${configuration.property.value}")
	private String springProperty;
	
	@GetMapping
	public String getPropertyFromConfiguration() {
		return String.format("Value obtained from application.yml file is -> %s", springProperty);
	}
	
}
