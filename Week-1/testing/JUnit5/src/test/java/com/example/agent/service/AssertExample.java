package com.example.agent.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertExample {
    @Test
    public void test(){
        System.out.println("lets test some assertion method");
        int act=12;
        int exp=12;
        String name = ("Rushabh");
        String ename = ("Rushabh");
        Assertions.assertEquals(name,ename);
    }
}
