package com.offical.website.srv;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class OfficialWebsiteSrvApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		System.setProperty("spring.devtools.restart.enabled", "true");
		new OfficialWebsiteSrvApplication()
		.configure(new SpringApplicationBuilder(OfficialWebsiteSrvApplication.class))
        .run(args);
	}
}
