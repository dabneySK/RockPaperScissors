package com.dabney;

import java.util.Scanner;

class Menu {

    Scanner input = new Scanner(System.in);
    GameModes gameMode = new GameModes();

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
    }

    private void displayError() {
        System.out.println();
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("That was not a valid choice.");
        System.out.println("----------------------------------");
        System.out.println();
        System.out.println();
    }

    public int getMenuChoice() {
        int menuChoice = input.nextInt();
        return menuChoice;
    }

    public void navigateMenu(int choice) {
        switch (choice) {
            case 1:
                System.out.println("OK, lets play 1v1 vs AI.");
                break;
            case 2:
                System.out.println("OK, lets play 1v1 vs a Player");
                break;
            case 3:
                System.out.println("Goodbye.");
                break;
            default:
                displayError();
                displayMainMenu();
                navigateMenu(getMenuChoice());
        }

    }
}
