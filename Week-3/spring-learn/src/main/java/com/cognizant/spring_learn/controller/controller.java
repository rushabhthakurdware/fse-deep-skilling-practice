package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.model.CountryList;
import com.cognizant.spring_learn.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controller {
    @Autowired
     CountryService countryService;

    @RequestMapping("/countries")
    public List<Country> getAllCountries(){
        return countryService.getAllCountries();
    }
    @GetMapping("/country")
    public Country getCountry(){
        return countryService.getCountry("IN");
    }
    @GetMapping("/country/{code}")
    public Country getCountry(@PathVariable String code){
        return countryService.getCountry(code);
    }
    @GetMapping("/")
    public String hello(){
        return "hello world";
    }
}
