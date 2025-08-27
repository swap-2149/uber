package com.swap.week1.intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication

public class  IntroApplication implements CommandLineRunner {

	@Autowired
	DBService dbservice;
	public static void main(String[] args) {
		SpringApplication.run(IntroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		obj.eatApple();
//		System.out.println(obj.hashCode());

		System.out.println(dbservice.getData());
	}
}
