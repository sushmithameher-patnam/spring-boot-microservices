package io.sushmitha.movieinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class  MovieInfoServiceApplication {
	@RequestMapping("/")
	String home(){
		return "Welcome to springboot microservices project";
	}
	public static void main(String[] args) {
		SpringApplication.run(MovieInfoServiceApplication.class, args);
	}

}
