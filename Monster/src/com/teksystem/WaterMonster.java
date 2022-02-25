package com.teksystem;

public class WaterMonster extends Monster{

    public WaterMonster(String name) {
        super(name);
    }

    @Override
    String attack() {
        return "water gun";
    }
}
