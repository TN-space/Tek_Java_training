package com.teksystem;

public class KidUsers extends User implements LibraryUser{
    // Default constructor
    public KidUsers() {};

    // Overloaded constructor
    public KidUsers(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }



    @Override
    public void registerAccount() {
        String x = (age < 12)
                ? "You have successfully registered under a Kids Account"
                : "Sorry, Age must be less than 12 to register as a kid";
        System.out.println(x);
    }


    @Override
    public void requestBook() {
        // Check if first character of `bookType` is a digit
        if (Character.isDigit(this.bookType.charAt(0))) {
            try {
                // throw InputErrorExceptionHandling if it is a digit
                throw new InputErrorExceptionHandling("First character must be a letter");
            }
            // catch the error
            catch (InputErrorExceptionHandling e) {
                // print out the error message if it is a digit
                e.printStackTrace();
            }
        } else {
            // else check if `bookType` is equal to "kids"
            String y = (bookType.toLowerCase()).equals("kids".toLowerCase())
                    ? "Book issued successfully, please return the book within 10 days"
                    : "Oops, you are allowed to take only kids books";
            System.out.println(y);
        }
    }
}
