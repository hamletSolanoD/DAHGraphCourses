package com.DAH.graphEducation;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.DAH.graphEducation"})
@EnableJpaRepositories(basePackages="com.DAH.graphEducation.Repositories")
@EnableTransactionManagement
@EntityScan(basePackages="com.DAH.graphEducation.Models")
public class DahCoursesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DahCoursesApplication.class, args);
	}

}
