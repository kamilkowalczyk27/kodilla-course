package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void addTest() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addResult = calculator.add(2,3);
        //Then
        Assert.assertEquals(5, addResult, 0.01);

    }
    @Test
    public  void subTest() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double subResult = calculator.sub(2,1);
        //Then
        Assert.assertEquals(1, subResult, 0.01);
    }
    @Test
    public void mulTest() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double mulResult = calculator.mul(2,1);
        //Then
        Assert.assertEquals(2, mulResult, 0.01);
    }
    @Test
    public void divTest() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double divResult = calculator.div(2,1);
        //Then
        Assert.assertEquals(2, divResult, 0.01);
    }
}
