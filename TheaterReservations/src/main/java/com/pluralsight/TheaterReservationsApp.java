package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservationsApp {

    public static void main(String[] args) {

        //fire up scanner, allows user input
        Scanner movieScanner = new Scanner(System.in);

        //welcome user to app
        System.out.println("Welcome to Scary Movie Theaters!");
        System.out.println("------------------------------------------");

        //ask user for name
        System.out.print("Please enter your name: ");
        String fullName = movieScanner.nextLine().trim(); //trims extra characters

        //breaks string into two pieces (array/list)
        String[] name = fullName.split(" ");

        //ask user for reservation date
        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String resDate = movieScanner.nextLine().trim(); //trims extra characters
        DateTimeFormatter newDateForm = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        //convert string to date
        LocalDate resi = LocalDate.parse(resDate, newDateForm);

        //ask user for # of tickets
        System.out.print("How many tickets would you like? ");
        int ticketAmt = movieScanner.nextInt(); //trims extra characters

        //if/else conditional statement for # of tickets
//        if(ticketAmt > 1) {
//            ticketAmt = Integer.parseInt((ticketAmt + " tickets"));
//        } else {
//            ticketAmt = Integer.parseInt((ticketAmt + " ticket"));
//        }

        //if/else conditional statement for name formatting (last, first)
        String nameForm;
        if (name.length >= 2) {
            nameForm = name[1] + ", " + name[0];
        } else {
            nameForm = fullName;
        }

        //display # of ticket(s) reserved for (date)under name in (last name, first name) format
        System.out.println("------------------------------------------");
        System.out.println(ticketAmt + " ticket(s) reserved for " + resi + " under " + nameForm);
    }
}
