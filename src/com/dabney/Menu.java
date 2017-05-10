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

    }

    private void displayError() {
        System.out.println("You typed something you were not supposed to...");
    }
}
