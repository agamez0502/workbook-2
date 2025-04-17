package com.pluralsight;

import java.util.Scanner;

public class AddressBuilderApp {

    public static void main(String[] args) {

        //fire up scanner, allows user input
        Scanner addyScanner = new Scanner(System.in);

        //give user instructions
        System.out.println("Please provide the following information:");
        System.out.println("------------------------------------------");

        //ask user for full name
        System.out.print("Full name: ");
        String fullName = addyScanner.nextLine().trim(); //trims extra characters

        //ask user for billing street
        System.out.print("\nBilling Street: ");
        String billStreet = addyScanner.nextLine().trim(); //trims extra characters

        //ask user for billing city
        System.out.print("Billing City: ");
        String billCity = addyScanner.nextLine().trim(); //trims extra characters

        //ask user for billing state
        System.out.print("Billing State: ");
        String billState = addyScanner.nextLine().trim(); //trims extra characters

        //ask user for billing zip
        System.out.print("Billing Zip: ");
        String billZip = addyScanner.nextLine().trim(); //trims extra characters

        //ask user for shipping street
        System.out.print("\nShipping Street: ");
        String shipStreet = addyScanner.nextLine().trim(); //trims extra characters

        //ask user for shipping city
        System.out.print("Shipping City: ");
        String shipCity = addyScanner.nextLine().trim(); //trims extra characters

        //ask user for shipping state
        System.out.print("Shipping State: ");
        String shipState = addyScanner.nextLine().trim(); //trims extra characters

        //ask user for shipping zip
        System.out.print("Shipping Zip: ");
        String shipZip = addyScanner.nextLine().trim(); //trims extra characters

        //create a StringBuilder object
        StringBuilder addyBuilder = new StringBuilder();

        //append strings to the StringBuilder object
        addyBuilder.append(fullName);
        addyBuilder.append("\n");
        addyBuilder.append("\nBilling Address:\n");
        addyBuilder.append(billStreet);
        addyBuilder.append("\n");
        addyBuilder.append(billCity);
        addyBuilder.append(", ");
        addyBuilder.append(billState);
        addyBuilder.append(" ");
        addyBuilder.append(billZip);
        addyBuilder.append("\n");
        addyBuilder.append("\nShipping Address:\n");
        addyBuilder.append(shipStreet);
        addyBuilder.append("\n");
        addyBuilder.append(shipCity);
        addyBuilder.append(", ");
        addyBuilder.append(shipState);
        addyBuilder.append(" ");
        addyBuilder.append(shipZip);

        //display input from above
        System.out.println("------------------------------------------");
        System.out.println(addyBuilder.toString());
    }
}
