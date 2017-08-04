package com.dabney;

class GameStructure {
    Player player1;
    Player player2;
    GameLogic gameLogic;
    Menu gameMenu;


    GameStructure() {
        player1 = new Human();
        gameMenu = new Menu();
        gameLogic = new GameLogic();
    }


    private void displayTitleScreen() {
        gameMenu.welcomeMessage();
    }

    private void displayMenuAndGetChoice() {
        gameMenu.displayMainMenu();
        gameMenu.setMenuChoice();
    }


    private void setSecondPlayer() {
        int menuChoice = gameMenu.getMenuChoice();
        switch(menuChoice) {
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

    public void startGame() {
        displayTitleScreen();
        displayMenuAndGetChoice();
        setSecondPlayer();
        gameMenu.navigateMenu();
        player1.setChoice();
        System.out.println();
        player2.setChoice();
        System.out.println();
        gameLogic.findWinner(player1.getChoice(), player2.getChoice());
        gameLogic.incrementScore(gameLogic.getWinner(), player1, player2);
        gameMenu.displayCurrentScore(player1, player2);
    }


}
