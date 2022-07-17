package com.epam.jmp.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.config.DynamicPropertyFactory;
import com.netflix.config.DynamicStringProperty;

@RestController
@RequestMapping("/common")
public class CommonController {
	private DynamicStringProperty propertyOne = DynamicPropertyFactory.getInstance().getStringProperty("property.test", "text1");
	private DynamicStringProperty propertyTwo = DynamicPropertyFactory.getInstance().getStringProperty("property.second.test", "text2");

	@GetMapping("/one")
	public String getFirstProperty() {
		return propertyOne.getName() + ": " +propertyOne.getValue();
	}

	@GetMapping("/two")
	public String getSecondProperty() {
		return propertyTwo.getName() + ": " +propertyTwo.getValue();
	}
}
