package kr.co.songjava.examplespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "kr.co.songjava")
public class ExampleSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleSpringApplication.class, args);
	}

}
