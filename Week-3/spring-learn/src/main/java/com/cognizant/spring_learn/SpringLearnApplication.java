package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.image.SampleModel;
import java.text.DateFormat;

@SpringBootApplication
public class SpringLearnApplication {
	private static final Logger logger = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args)
	{
//		displayCountry();
		SpringApplication.run(SpringLearnApplication.class, args);
	}

//	Exercise 1 of week-3
//	public static void displayCountry(){
//		ApplicationContext context =
//				new ClassPathXmlApplicationContext("country.xml");
//
//		Country country = context.getBean("country", Country.class);
//		logger.info(country.toString());
//	}
	

}
