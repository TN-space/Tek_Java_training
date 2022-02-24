package com.teksystem;

import java.util.Arrays;
import java.util.Random;

import static java.lang.Math.round;

public class Main {

    public static void main(String[] args) {
	    // 1
        int[] arr1 = new int[3];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        for (int x:arr1) {
            System.out.println(x);
        }
        System.out.println("==========");

        // 2
        int[] arr2 = {13, 5, 7, 68, 2};
        int midIndex = round((arr2.length)/2);
        System.out.println(arr2[midIndex]);
        System.out.println("==========");

        // 3
        String[] arr3 = {"red", "green", "blue", "yellow"};
        System.out.println(arr3.length);
        String[] arrClone = arr3.clone();
        System.out.println(Arrays.toString(arrClone));
        System.out.println("==========");

        // 4
        Random r = new Random();
        int[] arr4 = new int[5];
        for (int i = 0; i < arr4.length; i++) {
            arr4[i] = r.nextInt();
        }
        System.out.println(arr4[0]);
        System.out.println(arr4.length-1);
        System.out.println("==========");
        // 5
        int[] arr5 = new int[5];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = i;
        }

        // 6
        int[] arr6 = new int[5];
        for (int i = 0; i < arr6.length; i++) {
            arr6[i] = 2 * i;
        }

        // 7
        int[] arr7 = new int[5];
        for (int i = 0; i < arr7.length; i++) {
            arr7[i] = r.nextInt();
        }
        for (int i = 0; i < arr7.length; i++) {
            int mid = round(arr7.length/2);
            if (i != mid) System.out.println(arr7[i]);;
        }
        System.out.println("==========");

        // 8
        String[] arr8 = new String[5];
        for (int i = 0; i < arr8.length; i++) {
            arr8[i] = Integer.toString(r.nextInt());
        }
        System.out.println(Arrays.deepToString(arr8));
        int midPoint = round(arr8.length/2);
        String temp = arr8[0];
        arr8[0] = arr8[midPoint];
        arr8[midPoint] = temp;
        System.out.println(Arrays.deepToString(arr8));
        System.out.println("==========");

        // 9
        int[] arr9 = {4, 2, 9, 13, 1, 0};
        int min, tempNum;
        for (int a = 0; a < arr9.length; a++) {
            min = arr9[a];
            for (int i = a + 1; i < arr9.length; i++) {
                if (min > arr9[i]) {
                    tempNum = min;
                    min = arr9[i];
                    arr9[i] = tempNum;
                }
            }
            arr9[a] = min;
        }
        System.out.println(Arrays.toString(arr9));

        // 10.Create an array that includes an integer, 3 strings, and 1 double. Print the array.

    }
}
