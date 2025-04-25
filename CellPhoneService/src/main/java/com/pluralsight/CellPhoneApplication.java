package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    //fire up the scanner for user input
    static Scanner phoneScanner = new Scanner(System.in);

    public static void main(String[] args) {

        //create cellphone
        CellPhone iPhone1 = new CellPhone();

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

        //set the cellphone 1 data on the object
        iPhone1.setSerialNumber(Integer.parseInt(sn));
        iPhone1.setModel(model);
        iPhone1.setCarrier(carrier);
        iPhone1.setPhoneNumber(phoneNumber);
        iPhone1.setOwner(owner);

        //create cellphone 2
        CellPhone iPhone2 = new CellPhone();
        iPhone2.setSerialNumber(222);
        iPhone2.setModel("iPhone XR");
        iPhone2.setCarrier("ATT");
        iPhone2.setPhoneNumber("972-743-2970");
        iPhone2.setOwner("Alondra");

        //create cellphone 3
        CellPhone android = new CellPhone();
        android.setSerialNumber(333);
        android.setModel("Galaxy S");
        android.setCarrier("ATT");
        android.setPhoneNumber("214-470-6318");
        android.setOwner("Claudia");

        //use the display method instead to display cellphone 1
        System.out.println("--------Information for iPhone1--------");
        //use the display method instead
        display(iPhone1);

        //use the display method instead to display cellphone 2
        System.out.println("--------Information for iPhone2--------");
        display(iPhone2);

        //use the display method instead to display cellphone 3
        System.out.println("--------Information for Android--------");
        display(android);

        System.out.println("-----------Who's calling who?-----------");
        //have iPhone1 call iPhone2
        iPhone1.dial(iPhone2.getPhoneNumber());

        //have iPhone2 call iPhone1
        iPhone2.dial(iPhone1.getPhoneNumber());

        //have android call iPhone2
        android.dial("972-743-2970");
    }

    //this method knows how to display the information for a phone
    static void display(CellPhone phone) {
        System.out.println("SN: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }
}
