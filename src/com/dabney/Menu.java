package com.dabney;

class Menu {

    private int menuChoice;
    private UserInput input;

    Menu() {
        input = new UserInput();
    }

    public void welcomeMessage() {
        printBars(2);
        System.out.println("ROCK || PAPER || SCISSORS");
        printBars(2);
        printNewLine(1);
    }

    public void displayMainMenu() {
        System.out.println("MAIN MENU");
        printBars(1);
        System.out.println("1) play one-on-one fast match vs ai");
        System.out.println("2) play one-on-one fast match vs player");
        System.out.println("3) exit program");
        printBars(1);
    }

    public void setMenuChoice() {
        menuChoice = input.getInt(1, 3);
    }

    public int getMenuChoice() {
        return menuChoice;
    }


    public void navigateMenu() {
        switch (menuChoice) {
            case 1:
                printNewLine(2);
                printBars(2);
                System.out.println("OK, lets play 1v1 vs AI.");
                printBars(2);
                printNewLine(1);
                break;
            case 2:
                printNewLine(2);
                printBars(2);
                System.out.println("OK, lets play 1v1 vs a Player");
                printBars(2);
                printNewLine(1);
                break;
            case 3:
                printNewLine(2);
                printBars(2);
                System.out.println("Goodbye.");
                printBars(2);
                printNewLine(1);
                break;
            default:
                System.out.println("Something went wrong...");
                break;
        }
    }

    public void displayCurrentScore(Player player1, Player player2) {
        printNewLine(1);
        System.out.println("Current Score:");
        printBars(1);
        System.out.println("Player 1 score: " + player1.getWins() +"\nPlayer 2 score: " + player2.getWins());
        printBars(1);
    }

    public void displayMatchWinner(Player player1, Player player2) {
        System.out.println("The winner of this match is");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        if(player1.getWins() > player2.getWins()) {
            System.out.println("PLAYER 1 !!!");
        } else {
            System.out.println("PLAYER 2 !!!");
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
