package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
    public static final Logger LOGGER = LoggerFactory.getLogger(Country.class);

    private String code;
    private String name;

    public Country(){
        LOGGER.info("Inside Country Constructor.");

    }
    public String getCode(){
        return "Inside getCode()";
    }
    public void setCode(String code){
        LOGGER.info("inside setCode()");
        this.code = code;
    }

    public String getName(){
        return "Inside getName()";
    }
    public void setName(String name){
        LOGGER.info("inside setName()");
        this.name = name;
    }
    @Override
    public String toString(){
        return "Country [name = "+name+", code = "+code+"]";
    }
}
