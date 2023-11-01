package example.springframework.springdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = { "example.springframework.bootstrap",
//		"example.springframework.repositories", "example.springframework.domain" })
public class SpringdatajpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaApplication.class, args);
	}

}
