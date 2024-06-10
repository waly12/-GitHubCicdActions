package com.axsaconsulting.learn.github.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitHubCicdActionsApplication {
	
	@GetMapping("/welcome")
	public String welcome() {;
		return ("Welcome Axsa  Consulting first GitHub CI/CD Project..");
	}

	public static void main(String[] args) {
		SpringApplication.run(GitHubCicdActionsApplication.class, args);
	}

}
