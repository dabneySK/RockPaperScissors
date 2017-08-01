package com.dabney;

class GameStructure {
    Player player1;
    Player player2;
    Menu gameMenu;

    GameStructure() {
        player1 = new Human();
        gameMenu = new Menu();
    }

    public void displayTitleScreen() {
        gameMenu.welcomeMessage();
    }


    public void setSecondPlayer() {
        switch(gameMenu.getMenuChoice()) {
            case 1: // is AI player
                player2 = new Computer();
                break;
            case 2: // is Human player
                player2 = new Human();
                break;
            default:
                break;
        }
    }

    public void setMenuChoice() {
        gameMenu.displayMainMenu();
        gameMenu.setMenuChoice();
    }
}
