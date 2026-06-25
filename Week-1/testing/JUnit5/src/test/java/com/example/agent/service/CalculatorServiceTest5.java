package com.example.agent.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest5 {
    CalculatorService1 calc = new CalculatorService1();
    @Test()
    public  void  add2No(){

        int i = calc.add2no(12,32);
        int exp = 43;
        Assertions.assertEquals(exp,i,"test failed");

    }
    @Test
    public  void addAny(){
        int sum =CalculatorService1.addNno( 23,23,13,32,43);
        int exp = 103;
        Assertions.assertEquals(exp,sum , "failed");
    }
}
