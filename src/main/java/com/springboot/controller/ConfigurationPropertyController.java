package com.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.property.ComplexProperty;
import com.springboot.property.Property;

@RestController
@RequestMapping("/confProperty")
public class ConfigurationPropertyController {
	
	@Autowired
	//private Property property;
	private ComplexProperty complexProperty;
	
	@GetMapping
	/*public List<String> fetchConfigurationProperties() {
		List<String> propertyValues = new ArrayList<>();
		propertyValues.add(String.valueOf(property.getNoOfStudents()));
		propertyValues.add(property.getSchoolName());
		return propertyValues;
	}*/
	public List<Property> fetchConfigurationProperties() {
		return complexProperty.getProperty();
	}
}
