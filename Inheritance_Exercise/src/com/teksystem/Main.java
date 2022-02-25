package com.teksystem;

public class Main {

    public static void main(String[] args) {
	    Manager m1 = new Manager(126534, "Peter", "Chennai India", 237844L, 65000);
        System.out.println(m1.calculateSalary());
        System.out.println(m1.calculateTransportAllowance());

        Trainee t1 = new Trainee(29846, "Jack", "Mumbai India", 442085L, 45000);
        System.out.println(t1.calculateSalary());
        System.out.println(t1.calculateTransportAllowance());

    }
}
