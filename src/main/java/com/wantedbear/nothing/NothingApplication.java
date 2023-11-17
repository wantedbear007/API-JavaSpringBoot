package com.wantedbear.nothing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;


//this @SprintBootApplication is a Java annotation that is used to tell compiler what this class is about
@SpringBootApplication
@RestController
public class NothingApplication {

	public static void main(String[] args) {
		SpringApplication.run(NothingApplication.class, args);
	}

//	Writing the endpoints

	@GetMapping("/")
	public String root() {
		return "Server active haii";
	}
	@GetMapping("/root")
	public Dictionary<Integer, String> apiRoute() {
		Dictionary<Integer, String> dict = new Hashtable<>();

		dict.put(1, "Bhanupratap");
		dict.put(2, "Abhijeet");
		return dict;
	}


}
