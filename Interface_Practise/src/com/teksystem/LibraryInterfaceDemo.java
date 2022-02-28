package com.teksystem;

public class LibraryInterfaceDemo {

    public static void main(String[] args) {
	    KidUsers kid = new KidUsers(10, "kids");
        kid.registerAccount();
        kid.requestBook();

        AdultUser adult = new AdultUser(5, "fictions");
        adult.registerAccount();
        adult.requestBook();
    }
}
