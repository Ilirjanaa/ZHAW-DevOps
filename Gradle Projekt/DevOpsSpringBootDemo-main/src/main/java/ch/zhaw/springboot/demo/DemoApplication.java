package ch.zhaw.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
public class PersonController {

	@GetMapping("/test") 
	public String test () {
		return "Hello World app is up and running!";
	}

}
