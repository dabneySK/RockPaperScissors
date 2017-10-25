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
        gameMenu.setMenuChoice(1, 3);
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
        if(gameMenu.getMenuChoice() == 3) {
            System.out.println("Goodbye.");
            return;
        } else {
            setSecondPlayer();
            playRounds(2);
            gameLogic.displayMatchWinner(player1, player2);
        }
    }

    private void replayGame() {
        gameMenu.displayReplayMenu();
        gameMenu.setMenuChoice(1, 3);

    }

    private void playRounds(int winningScore) {
        int rounds = 1;
        while(player1.getWins() != winningScore && player2.getWins() != winningScore) {
            player1.setChoice();
            player2.setChoice();

            gameLogic.findWinner(player1.getChoice(), player2.getChoice());
            gameLogic.incrementScore(gameLogic.getWinner(), player1, player2);
            gameLogic.displayRoundWinner(rounds, gameLogic.getWinner(), player1, player2);
            gameLogic.displayCurrentScore(player1, player2);
            rounds++;
        }
    }
}
