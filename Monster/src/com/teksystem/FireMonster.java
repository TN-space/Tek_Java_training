package com.teksystem;

public class FireMonster extends Monster{

    public FireMonster(String name) {
        super(name);
    }

    @Override
    String attack() {
        return "flamethrower";
    }
}
