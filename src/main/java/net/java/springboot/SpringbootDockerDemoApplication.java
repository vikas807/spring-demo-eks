package net.java.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.undo.AbstractUndoableEdit;

@SpringBootApplication
@RestController
public class SpringbootDockerDemoApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "Spring Docker Vikas App";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerDemoApplication.class, args);
	}

}
