package com.teksystem;

public class Main {

    public static void main(String[] args) {
        Monster m1 = new FireMonster("fire mon");
        Monster m2 = new WaterMonster("water mon");
        Monster m3 = new StoneMonster("stone mon");
        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());

        m1 = new StoneMonster("fire mon2");
        System.out.println(m1.attack());

        Monster m4 = new Monster("normal mon");
        System.out.println(m4.attack());
    }
}
