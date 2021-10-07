package guru.springframework.jokesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.jokesapp.controllers.JokesController;

@SpringBootApplication
public class RkJokesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(RkJokesAppApplication.class, args);
	}

}
