package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {

    public static void main(String[] args) {

        //fire up scanner, allows user input
        Scanner creepyScanner = new Scanner(System.in);

        //welcome user to app
        System.out.println("Welcome!");
        System.out.println("------------------------------------------");

        //ask user for name
        System.out.print("Please enter your name: ");
        String name = creepyScanner.nextLine().trim(); //trims extra characters

        //splitting the input by putting it into an array
        String[] nameBits = name.split(" ");

        //variables
        String firstName = "";
        String middleName = "";
        String lastName = "";

        //if/else conditional statements for bits of the name
        if (nameBits.length == 2) {
            firstName = nameBits[0];
            lastName = nameBits[1];
        } else if (nameBits.length == 3) {
            firstName = nameBits[0];
            middleName = nameBits[1];
            lastName = nameBits[2];
        } else {
            System.out.println("Error, fix name format 'First Middle Last'. Thanks!");
        }

        //display bits of the name
        System.out.println("------------------------------------------");
        System.out.println("First name : " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name  : " + lastName);
    }
}
