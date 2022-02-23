package com.teksystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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

    }
}
