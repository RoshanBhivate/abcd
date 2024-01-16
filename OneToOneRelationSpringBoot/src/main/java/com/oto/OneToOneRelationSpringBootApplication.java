package com.oto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.oto.entity.CustomerEntity;

@SpringBootApplication
public class OneToOneRelationSpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(OneToOneRelationSpringBootApplication.class, args);
		CustomerEntity customerEntity = context.getBean(CustomerEntity.class);
		customerEntity.setUserName("Roshan");
		
		
	}

}
