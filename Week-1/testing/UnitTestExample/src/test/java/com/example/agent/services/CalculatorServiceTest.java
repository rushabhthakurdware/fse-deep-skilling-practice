package com.example.agent.services;


import org.junit.*;

import java.util.Date;

public class CalculatorServiceTest {



    @BeforeClass
    public static void init(){
        System.out.println("hello before all test cases "+ new Date());

    }
    static int counter =0;
    @Before
    public  void beforeEachtest(){
        System.out.println("before each test case");
//        counter = 0;
    }

    @Test
    public void addTest(){
        for(int i=1;i<=10;i++){
            counter+=1;
        }
        System.out.println(counter);
        System.out.println("test case for addition of 2 no.");
        int result = CalculatorService.add(12,45);
        int ex = 57;
    Assert.assertEquals(ex,result );
    }

    @Test
    public void anyNoTest(){
        for(int i=1;i<=10;i++){
            counter++;
        }
        System.out.println(counter);
        System.out.println("test case for addition of n no.");

        int res = CalculatorService.anyNo(12,31,21,34,21,43);
        int ex = 162;
        Assert.assertEquals(ex,res);
    }

    @AfterClass
    public static void cleanup(){
        System.out.println("end");
    }

}
