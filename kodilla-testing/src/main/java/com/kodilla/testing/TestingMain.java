package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")) {
            System.out.println("test OK");
        }else{
            System.out.println("Error");
        }

        Calculator calculator = new Calculator();

        int resultOfAdd = calculator.addAToB(6, 4);

        if(resultOfAdd == 6 + 4){
            System.out.println("Test is ok.");
        }else{
            System.out.println("Error");
        }

        int resultOfSubtract = calculator.subtractAFromB(6, 4);

        if(resultOfSubtract == 6 - 4) {
            System.out.println("Test is ok.");
        }else{
            System.out.println("Error");
        }
    }
}
