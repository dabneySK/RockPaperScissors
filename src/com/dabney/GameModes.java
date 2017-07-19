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


}
