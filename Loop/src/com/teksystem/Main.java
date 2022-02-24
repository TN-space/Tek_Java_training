package com.teksystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // =====Conditional Statements=====
        /*
	    int x;
        // 1
        x = 7;
        // or x = 15
        if (x<10) System.out.println("Less than 10");

        // 2
        x = 7;
        // or x = 15
        if (x<10) System.out.println("Less than 10");
        else if (x>10) System.out.println("Greater than 10");

        // 3
        x = 15;
        // or x = 50
        if (x<10) System.out.println("Less than 10");
        else if (x>10 && x<20) System.out.println("Between 10 and 20");
        else if (x>=20) System.out.println("Greater than 20");

        // 4
        x = 15;
        // or x = 5
        if (x<10 || x>20) System.out.println("Out of range");
        else System.out.println("In range");

        // 5
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a grade: ");
        int grade = input.nextInt();
        if (grade>=90) System.out.println("A");
        else if (grade>=80) System.out.println("B");
        else if (grade>=70) System.out.println("C");
        else if (grade>=60) System.out.println("D");
        else if (grade>=0 && grade<60) System.out.println("F");
        else System.out.println("Score out of range");

        // 6
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7: ");
        int day = input2.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Out of range");
        }
*/
        // =====Loops=====
        // 1
        for (int i = 0; i < 10; i++) {
            System.out.println("i is at: " + i);
        }

        // 2
        int a = 0;
        while (a < 100) {
            System.out.println("Currently a is " + a);
            a += 10;
        }

        // 3
        int b = 0;
        do {
            System.out.println("Current b is " + b);
            b++;
        }
        while (b<10);

        // 4
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                if (i>=25 && i<=75) {
                    continue;
                }
                System.out.println(i);
            }
        }

        // 5
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {
                if (i > 50) {
                    break;
                }
                System.out.println(i);
            }
        }

        // 6
        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 6; j++) {
                System.out.printf("Week %d: Day %d\n",i, j);
            }
        }

        // 7.Write a program that returns all the available palindromes within 10 and 200
//        for (int i = 10; i <= 200; i++) {
//
//        }

        // 8.Write a program that prints the Fibonacci Sequence from 0 to 50.
        int sum = 0, num1 = 0, num2 = 1;
        for (int i = 0; i <= 50; i++) {
            System.out.println(num1);
            sum = num1 + num2;
            num1 = num2;
            if (num1 > 50) break;
            num2 = sum;
        }

        // 9
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Inner loop j-%d of outer i-%d\n",j, i);
            }
        }
    }
}
