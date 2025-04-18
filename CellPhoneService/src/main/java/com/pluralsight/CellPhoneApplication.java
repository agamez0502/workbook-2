package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    //fire up the scanner for user input
    static Scanner phoneScanner = new Scanner(System.in);

    public static void main(String[] args) {

        //create cellphone
        CellPhone iPhone = new CellPhone();

        //ask user for cellphone data
        System.out.println("Welcome! Enter your phone information down below.");
        System.out.println("-------------------------------------------------");
        System.out.println("What is the serial number? ");
        String sn = phoneScanner.nextLine();

        System.out.println("What model is the phone? ");
        String model = phoneScanner.nextLine();

        System.out.println("Who is the carrier? ");
        String carrier = phoneScanner.nextLine();

        System.out.println("What is the phone number? ");
        String phoneNumber = phoneScanner.nextLine();

        System.out.println("Who is the owner of this phone? ");
        String owner = phoneScanner.nextLine();

        //set the cellphone data on the object
        iPhone.setSerialNumber(Integer.parseInt(sn));
        iPhone.setModel(model);
        iPhone.setCarrier(carrier);
        iPhone.setPhoneNumber(phoneNumber);
        iPhone.setOwner(owner);

        //user the getters to display this information
        System.out.println("-------------------------------------------------");
        System.out.println("SN: " + iPhone.getSerialNumber());
        System.out.println("Model: " + iPhone.getModel());
        System.out.println("Carrier: " + iPhone.getCarrier());
        System.out.println("Phone Number: " + iPhone.getPhoneNumber());
        System.out.println("Owner: " + iPhone.getOwner());
    }
}
