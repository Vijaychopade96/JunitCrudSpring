package com.Numerty.JunitCrudSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class JunitCrudSpringApplication implements CommandLineRunner {
	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(JunitCrudSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		if(employeeRepository.count()==0){
			employeeRepository.saveAll(Arrays.asList(
					new Employee(5,"vijay","chopade","vijay@gmail.com"),
				    new Employee(6,"pardip","chopade","pardip@gmail.com")

			));
		}


	}
}
