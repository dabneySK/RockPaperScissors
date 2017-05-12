package com.dabney;
import java.util.Scanner;

class Menu {

    Scanner input = new Scanner(System.in);

    public void welcomeMessage() {
        System.out.println("===================================");
        System.out.println("===================================");
        System.out.println("ROCK || PAPER || SCISSORS");
        System.out.println("===================================");
        System.out.println("===================================");
    }

    public void displayMainMenu() {
        System.out.println("MAIN MENU");
        System.out.println("----------------------------------");
        System.out.println("1) play one-on-one fast match vs ai");
        System.out.println("2) play one-on-one fast match vs player");
        System.out.println("3) exit program");
        System.out.println("----------------------------------");
        System.out.println("WHAT WOULD YOU LIKE TO DO:");
        navigateMenu(getMenuChoice());

    }

    private void displayError() {
        System.out.println("You typed something you were not supposed to...");
    }

    public int getMenuChoice() {
        int menuChoice = input.nextInt();
        return menuChoice;
    }

    public void navigateMenu(int choice) {
        switch(choice) {
            case 0:
                //one v one vs ai
                break;
            case 1:
                // one v one vs player
                break;
            case 2:
                break;
            default:
                System.out.println("Incorrect menu choice.");
        }

    }
}
