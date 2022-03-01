package com.teksystem;
import java.lang.Math;

class MyCalculator {
    String power(int n, int p) {
        String r = "";
        long x = 0;
        // Check if either n or p is less than 0(negative)
        if(n < 0 || p < 0){
            try {
                // throw an exception if either case happens.
                throw new Exception("java.lang.Exception: n or p should not be negative.");
            }
            // catch said exception by saving the exception message to r
            catch(Exception e) {
                r = "java.lang.Exception: n or p should not be negative.";
            }
        }
        // Check if both n = 0 and p = 0
        else if(n == 0 && p == 0) {
            try {
                // throw an exception if such case happens
                throw new Exception("java.lang.Exception: n and p should not be zero.");
            }
            // catch said exception by saving the exception message to r
            catch(Exception e) {
                r = "java.lang.Exception: n and p should not be zero.";
            }

        }
        // If no exception happens, proceed to the pow calculation
        else {
            // cast `Math.pow(n,p)` to long type because they both are int type
            x = (long)Math.pow(n,p);
            // convert long type x to String type r
            r = String.valueOf(x);
        }
        // return r - whatever it maybe
        return r;
    }
}

