package com.teksystem;

public class InputErrorExceptionHandling extends Exception {
    public InputErrorExceptionHandling(String message) {
        super(message);
//        System.out.println("Please input a valid book type.");
    }
}
