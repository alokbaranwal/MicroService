package com.project.SpringbootMicroService;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limit-service")
public class Configuration {
private int minimum;

public int getMinimum() {
	return minimum;
}

public void setMinimum(int minimum) {
	this.minimum = minimum;
}

}
