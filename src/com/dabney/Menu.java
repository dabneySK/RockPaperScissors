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

    public void displayReplayMenu() {
        System.out.println("What would you like to do?");
        System.out.println("1) Replay this match\n2) Pick a new game mode\n3) Exit Program");
    }

    public void setMenuChoice(int min, int max) {
        menuChoice = input.getInt(min, max);
    }

    public int getMenuChoice() {
        return menuChoice;
    }


    public void displayCurrentScore(Player player1, Player player2) {
        printNewLine(1);
        System.out.println("Current Score:");
        printBars(1);
        System.out.println("Player 1 score: " + player1.getWins());

        if(player2 instanceof Computer)
            System.out.printf("Computer");
        else
            System.out.printf("Player 2");

        System.out.printf(" score: " + player2.getWins() + "\n");
        printBars(1);
    }

    public void displayRoundWinner(int round, int winner, Player player1, Player player2) {
        System.out.printf("ROUND " + round + " WINNER: ");
        switch(winner) {
            case -1:
                System.out.printf("It was a tie...\n");
                break;

            case 1:
                System.out.printf("Player 1 wins with " + player1.getChoice() + "\n");
                break;

            case 2:
                if(player2 instanceof  Computer)
                    System.out.printf("Computer");
                else
                    System.out.printf("Player 2");
                System.out.printf(" wins with: " + player2.getChoice() + "\n");
                break;

            default:
                break;
        }
    }

    public void displayMatchWinner(Player player1, Player player2) {
        System.out.println("The winner of this match is");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        if(player1.getWins() > player2.getWins()) {
            System.out.println("PLAYER 1 !!!");
        } else {
            if(player2 instanceof Computer) {
                System.out.println("THE COMPUTER!!");
            } else {
                System.out.println("PLAYER 2 !!!");
            }
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
