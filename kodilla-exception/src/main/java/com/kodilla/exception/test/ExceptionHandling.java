package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();
        try{
            System.out.println(secondChallenge.probablyIWillThrowException(2.0, 1.0));
        } catch(Exception e) {
            System.out.println("lipa!" + e);
        } finally {
            System.out.println("result");
        }
    }
}
