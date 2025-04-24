package com.pluralsight;

import java.util.Scanner;

public class LibraryApp {

    static Book[] theBooks = {
            new Book(1, "01111", "La casa de Bernarda Alba"),
            new Book(2, "22222", "Don Quijote"),
            new Book(3, "33333", "Cien años de soledad"),
            new Book(4, "44444", "Chac Mool"),
            new Book(5, "55555", "Volverán las oscuras golondrinas"),
            new Book(6, "66666", "Mi caballo mago"),
            new Book(7, "77777", "El Sur"),
            new Book(8, "88888", "y no se lo tragó la tierra"),
            new Book(9, "99999", "La noche buena"),
            new Book(10, "10101", "No oyes ladrar los perros"),
            new Book(11, "11111", "El hijo"),
            new Book(12, "12121", "Las medias rojas"),
            new Book(13, "13131", "La siesta del martes"),
            new Book(14, "14141", "Hombres necios que acusáis"),
            new Book(15, "15151", "La noche boca arriba"),
            new Book(16, "16161", "Dos palabras"),
            new Book(17, "17171", "El ahogado más hermoso del mundo"),
            new Book(18, "18181", "Borges y yo"),
            new Book(19, "19191", "El burlador de Sevilla y convidado de piedra"),
            new Book(20, "20202", "A Julia de Burgos")
    };

    static Scanner bookScanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean appRunning = true;

        while (appRunning) {

            //ask the user what they want to do at the library (main menu)
            int userMainMenuChoice = mainMenu();

            switch (userMainMenuChoice) {

                case 1:
                    //call the view available book method to show the books

                    //store the selection in userBookChoice
                    int userBookChoice = viewAvailableBooks();

                    //eat the newline
                    bookScanner.nextLine();

                    //the user wanted to check out a book
                    if (userBookChoice != -1) {
                        //ask them their name
                        System.out.println("What is your name? ");
                        String usersName = bookScanner.nextLine();

                        //check out the book
                        theBooks[userBookChoice].checkOut(usersName);
                    }
                    break;
                case 2:

                    int bookReturn = viewCheckedOutBooks();

                    if (bookReturn == -1) {
                        continue;
                    }

                    if (bookReturn < theBooks.length) {

                        bookScanner.nextLine();

                        theBooks[bookReturn].checkIn("no one");

                        System.out.println(theBooks[bookReturn].getTitle());
                    } else {
                        System.out.println("That book is not available for checkout!");
                        continue;
                    }
                    break;
                case 3:
                    System.out.println("The user wants to exit the library");
                    appRunning = false;
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }

    static int mainMenu() {

        //welcome user to library app
        System.out.println("Welcome to the library:");
        System.out.println("----------------------------------------------------");

        //ask user what they would like to do and display options
        System.out.println("What would you like to do?");
        System.out.println("1: Show Available Books");
        System.out.println("2: Show Checked Out Books");
        System.out.println("3: Exit");

        return bookScanner.nextInt();
    }

    static int viewAvailableBooks() {

        //displays above available books
        System.out.println("----------These are the available books!----------");

        //loop over the books and work with each book
        for (int i = 0; i < theBooks.length; i++) {

            //set the current book to a variable so we don't have to deal with "i" anymore
            Book currentBook = theBooks[i];

            //if statement 
            if (!currentBook.isCheckedOut()) {
                System.out.println(i + ": " + currentBook.getTitle() + " - " + currentBook.getIsbn());
            }
        }

        //eat the random line
        bookScanner.nextLine();

        System.out.println("----------------------------------------------------");
        System.out.println("Would you like you like to checkout a book? (y/n) ");
        String userSelection = bookScanner.nextLine();

        if (userSelection.equalsIgnoreCase("y")) {
            System.out.println("Please enter the id of the book you would want to check out");
            return bookScanner.nextInt();
        }

        return -1;
    }

    static int viewCheckedOutBooks() {

        //displays above available books
        System.out.println("----------These books are currently checked out!----------");

        //loop over the books and work with each book
        for (int i = 0; i < theBooks.length; i++) {

            //set the current book to a variable so we don't have to deal with "i" anymore
            Book currentBook = theBooks[i];

            //if statement
            if (currentBook.isCheckedOut()) {
                System.out.println(i + ": " + currentBook.getTitle() + " - " + currentBook.getIsbn() + " - " + currentBook.getCheckedOutTo());
            }
        }

        //eat the random line
        bookScanner.nextLine();

        System.out.println("----------------------------------------------------");
        System.out.println("C: Check in a book");
        System.out.println("X: Return to main menu");
        String choice = bookScanner.nextLine();

        if (choice.equalsIgnoreCase("C")) {
            System.out.println("Enter the ID of the book you want to check in: ");
            int bookId = Integer.parseInt(bookScanner.nextLine());
            return bookId;
        }
        return -1;
    }
}
