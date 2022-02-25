package com.teksystem;

public class StoneMonster extends Monster{
    public StoneMonster(String name) {
        super(name);
    }

    @Override
    String attack() {
        return "Rock Throw";
    }
}
