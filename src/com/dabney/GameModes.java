package com.dabney;

class GameModes {
    Player player1;
    Player player2;
    Menu gameMenu;

    boolean computerPlayer;

    GameModes() {
        player1 = new Human();
        gameMenu = new Menu();
    }

    public void displayTitleScreen() {
        gameMenu.welcomeMessage();
    }

    public void setSecondPlayer() {
        gameMenu.displayMainMenu();
        gameMenu.setMenuChoice();

        switch (gameMenu.getMenuChoice()) {
            case 1:
                player2 = new Computer();
                break;
            case 2:
                player2 = new Human();
                break;
        }

    }

    // establish a 3 round match
}
