package com.dabney;

public class RockPaperScissors {

    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.welcomeMessage();
        menu.displayMainMenu();
        menu.navigateMenu(menu.getMenuChoice());

    }
}