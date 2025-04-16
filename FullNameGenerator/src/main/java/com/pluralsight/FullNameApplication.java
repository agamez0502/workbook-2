package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {

    public static void main(String[] args) {

        //fire up scanner to allow user input
        Scanner coolScanner = new Scanner(System.in);

        //welcome user to app
        System.out.println("Welcome! Please Enter your name down below.");
        System.out.println("------------------------------------------");

        //ask user to enter first name
        System.out.print("First name : ");
        String firstName = coolScanner.nextLine().trim(); //trims extra characters

        //ask user to enter middle name
        System.out.print("Middle name: ");
        String middleName = coolScanner.nextLine().trim(); //trims extra characters

        //ask user to enter last name
        System.out.print("Last name  : ");
        String lastName = coolScanner.nextLine().trim(); //trims extra characters

        //ask user to enter suffix
        System.out.print("Suffix     : ");
        String suffix = coolScanner.nextLine().trim(); //trims extra characters

        //if/else conditional statement for suffix
        String fullName = firstName + " " + middleName + " " + lastName;
        if (!suffix.trim().isEmpty()) { //checks if it is NOT empty and trims extra characters
            fullName += ", " + suffix;
        }

        //display users full name
        System.out.println("------------------------------------------");
        System.out.println("Full name: " + fullName.trim()); //trims extra characters
    }
}

