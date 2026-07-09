package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.config.CountryConfig;
import com.cognizant.spring_learn.model.Country;
import com.cognizant.spring_learn.model.CountryList;
import com.cognizant.spring_learn.service.exception.CountryNotFoundexception;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    public List<Country> getAllCountries(){
        CountryList countryList =
                (CountryList) CountryConfig.getBean("countryList");
        return countryList.getCountries();
    }

    public Country getCountry(String code){
        List<Country>countries = getAllCountries();

        return countries.stream().filter(c->c.getCode().
                equalsIgnoreCase(code)).findFirst().orElseThrow(CountryNotFoundexception::new);
    }
}
