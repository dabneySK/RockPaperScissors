package com.dabney;

class Menu {

    private int menuChoice;
    private UserInput input;
    private boolean isHumanPlayer;

    Menu() {
        input = new UserInput();
    }

    public void welcomeMessage() {
        printBars(2);
        System.out.println("ROCK || PAPER || SCISSORS");
        printBars(2);
        printNewLine(2);
    }

    public void displayMainMenu() {
        System.out.println("MAIN MENU");
        printBars(1);
        System.out.println("1) play one-on-one fast match vs ai");
        System.out.println("2) play one-on-one fast match vs player");
        System.out.println("3) exit program");
        printBars(1);
    }

    private void displayError() {
        printNewLine(2);
        printBars(1);
        System.out.println("That was not a valid choice.");
        printBars(1);
        printNewLine(2);
    }

    public void setMenuChoice() {
        displayMainMenu();
        menuChoice = input.getInt(1, 3);
    }

    public int getMenuChoice() {
        return menuChoice;
    }


    public void navigateMenu() {
        switch (menuChoice) {
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
                break;
        }
    }


    private void printBars(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.println("----------------------------------");
        }
    }

    private void printNewLine(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.println();
        }
    }
}
