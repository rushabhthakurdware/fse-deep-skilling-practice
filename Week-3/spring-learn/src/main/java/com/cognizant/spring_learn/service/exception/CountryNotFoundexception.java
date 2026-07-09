package com.cognizant.spring_learn.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "com.cognizant.spring_learn.Country not found")
public class CountryNotFoundexception extends RuntimeException{

}
