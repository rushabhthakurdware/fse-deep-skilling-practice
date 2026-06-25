package com.example.agent;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {

        calculator = new Calculator();

        System.out.println("Setup Executed");
    }

    @Test
    public void testAdd() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calculator.add(a, b);

        // Assert
        Assert.assertEquals(result,a+b);
    }

    @After
    public void tearDown() {

        System.out.println("Cleanup Executed");
    }
}
