package com.teksystem;

import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.floor;

public class Main {

    public static void main(String[] args) {
        // 1.Write a Java program to convert seconds to hour, minute and seconds from total seconds.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter seconds: ");
        long inp = input.nextLong();
        int temp,s ,m , h;
        s = (int) inp % 60;
        temp = (int) (inp - s);
        h = (int) floor((temp/3600));
        m = (temp/60) - (h * 60);
        System.out.printf("There are %d hours %d minutes %d seconds in %d seconds.", h, m, s, inp);

        // 2.Write a program that converts a Fahrenheit degree to Celsius using the formula
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter Fahrenheit degree: ");
        double f = input2.nextDouble();
        double c = ((double) 5/9) * (f - 32);
//        System.out.printf("f is: " + f + "   |||    c is: " + c);
//        DecimalFormat df = new DecimalFormat("#.##");
//        double temp = df.format(c);
        System.out.printf("%.1f Fahrenheit degree can be converted to %.2f Celsius degree.", f, c);

    }
}
