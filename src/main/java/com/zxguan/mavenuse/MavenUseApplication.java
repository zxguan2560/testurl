package com.zxguan.mavenuse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MavenUseApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenUseApplication.class, args);
	}

	@GetMapping(value = {"", "/", "/test"})
	public Object test() {
		return "test maven use";
	}

}
