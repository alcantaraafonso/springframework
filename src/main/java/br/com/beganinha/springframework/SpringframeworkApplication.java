package br.com.beganinha.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("br.com.beganinha.springframework.repository")
public class SpringframeworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringframeworkApplication.class, args);
	}

}
