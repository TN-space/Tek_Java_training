package com.teksystem;

public class AdultUser extends User implements LibraryUser{
    // Default constructor
    public AdultUser(){};

    // Overloaded constructor
    public AdultUser(int age, String bookType){
        this.age = age;
        this.bookType = bookType;
    };

    @Override
    public void registerAccount() {
        String x = (age > 12)
                ? "You have successfully registered under an Adult Account"
                : "Sorry, Age must be greater than 12 to register as an adult";
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
            String y = (bookType.toLowerCase()).equals("fiction")
                    ? "Book issued successfully, please return the book within 7 days"
                    : "Oops, you are allowed to take only adult Fiction books";
            System.out.println(y);
        }
    }
}
