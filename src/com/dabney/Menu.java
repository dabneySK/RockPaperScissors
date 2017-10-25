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

    private void printBars(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.println("----------------------------------");
        }
    }

}
