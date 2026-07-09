package com.cognizant.spring_learn.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class CountryConfig {
    public static final ApplicationContext context =
            new ClassPathXmlApplicationContext("country.xml");
    public static Object getBean(String beanName){
        return context.getBean(beanName);
    }
}
