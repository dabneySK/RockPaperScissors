package com.dabney;


/*
//-----------------------------------------------------------------
// ADD NEXT
//-----------------------------------------------------------------



//-----------------------------------------------------------------
// TO DO
//-----------------------------------------------------------------
----------------------------------
	MANDATORY TO DOS
----------------------------------


	classes: player (wins, choice), computer (extends player), menu, gamemode

	Player
	int wins
	String p1Choice, p2Choice
	const ROCK = "rock" PAPER = "paper" SCISSORS = "scissors"
	getChoice();
	getTotalWins()

	Computer
	rollRandomChoice();

	Menu
	displayError()
	displayMenu()
	getMenuChoice()
	navigateMenu()
	replayMenu()

	GameMode
	calculateWinner()
    compareChoice()
	1v1vsai()
        player1.getChoice();
        computer.getChoice();
        compareChoices()
        calculateWinner()
	1v1vsplayer()
        player1.getChoice();
        player2.getChoice();
        compareChoice()
        calculateWinner()



	    display menu for modes
	        1) play one-on-one fast match vs ai
            2) play one-on-one fast match vs player
            3) exit program

	    get input from user(s) and exit or play mode

	    generate random hand for ai if necessary

	    compare hands
	        winner++

	    check if win condition has been met:
	        if one player has 2 wins
	            display x wins message
	        else
	        	display current score (x is winning, y is winning, it is a tie!)
	            keep playing


        ask to replay
            1) this match
            2) pick a new mode
            3) exit program


----------------------------------
	NICE TO DOS
----------------------------------
	TOURNAMENT ROUND VS AI
	TOURNAMENT ROUND VS PLAYER(s) AND AI?
	    storyline?

 */
public class RockPaperScissors {

    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.welcomeMessage();
        menu.displayMainMenu();
        menu.navigateMenu(menu.getMenuChoice());

    }
}