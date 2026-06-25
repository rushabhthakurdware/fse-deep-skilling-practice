package com.example.agent.services;

public class CalculatorService {
    public static int add(int a , int b){
        return a+b;
    }
    public static int product(int a , int b){
        return a*b;
    }
    public static double divide(int a , int b){
        return a/b;
    }
    public static int anyNo(int ... numbers){
        int s = 0;
        for(int n : numbers){
            s+=n;
        }
        return s;
    }
}
