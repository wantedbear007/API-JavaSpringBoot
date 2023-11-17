package com.wantedbear.nothing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//this @SprintBootApplication is a Java annotation that is used to tell compiler what this class is about
@SpringBootApplication
@RestController
public class NothingApplication {

	public static void main(String[] args) {
		SpringApplication.run(NothingApplication.class, args);
	}

//	Writing the endpoints
//	@GetMapping("/phones")
//	public String apiRoute() {
//		return "Hello from Spring Framework";
//	}


}
