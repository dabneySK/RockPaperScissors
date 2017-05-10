package com.dabney;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.welcomeMessage();
        menu.displayMainMenu();

	/*
	ROCK PAPER SCISSORS
	VS AI
	classes: player (wins, choice), computer (extends player), menu

	    display menu for modes
	        1) play one-on-one fast match vs ai
            2) play one-on-one fast match vs player
            3) exit program

	    get input from user

	    generate random hand for ai

	    compare hands
	        winner++

	    check if win condition has been met:
	        if one player has 2 wins
	            display x wins message
	        else if tie
	        	display current score
	            keep playing
	        else keep playing

        ask to replay
            1) this match
            2) pick a new mode
            3) exit program
	VS PLAYER
=========================================
	NICE TO DOS
=========================================
	TOURNAMENT ROUND VS AI
	TOURNAMENT ROUND VS PLAYER(s) AND AI?
	    storyline?
pseudocode: Write down exactly what is being asked of you in steps
pseudocode: Under those steps, break down the major ways you can use to solve that step. FOCUS ON HAPPY CASES
pseudocode:  Break those big chunks down to smaller chunks. FOCUS ON HAPPY CASES
XXXX: start with ONE of the smaller chunks, write it and test the happy case to make sure it works
now add test cases/exceptions (null check, empty strings, negative numbers when expecting positives) to this small chunk
refactor this small chunk
pick next chunk to work at, and repeat from XXXX
    */
    }
}