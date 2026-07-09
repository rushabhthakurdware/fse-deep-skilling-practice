package com.cognizant.spring_learn.model;

public class Country {
    public String code;
    public String name;

    public Country(){

    }
    public Country(String code,String name){
        this.name = name;
        this.code = code;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getCode(){
        return code;
    }
    public void setCode(String code){
        this.code = code;
    }
}
