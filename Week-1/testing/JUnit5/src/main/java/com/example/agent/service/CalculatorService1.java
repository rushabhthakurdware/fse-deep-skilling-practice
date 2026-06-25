package com.example.agent.service;

public class CalculatorService1{
    public static int add2no(int a, int b){
        return a+b;
    }

    public static int addNno(int ... numbers){
        int s=0;
        for(int n:numbers){
            s+=n;
        }
        return s;
    }
    public int prod2no(int a, int b){
        return a*b;
    }
}
