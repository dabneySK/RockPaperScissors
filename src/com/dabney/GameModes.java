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

        if(gameMenu.getIsHumanPlayer()) {
            player2 = new Human();
        } else {
            player2 = new Computer();
        }
    }

    // establish a 3 round match
}
