package com.dabney;

public class RockPaperScissors {

    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.welcomeMessage();
        menu.displayMainMenu();
        menu.navigateMenu(menu.getMenuChoice());

	/*

=========================================
	MANDATORY TO DOS
=========================================


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


=========================================
	NICE TO DOS
=========================================
	TOURNAMENT ROUND VS AI
	TOURNAMENT ROUND VS PLAYER(s) AND AI?
	    storyline?




Decide what your classes/constructors/objects/instance variables/getters and setters/methods will be based on those steps, add these to step above.
ex:
Circle                         class name
radius: double                 instance variables
Circle()                       constructor
Circle(newRadius: double)      overloaded constructor
getArea(): double              methods

under each class, decide what stub methods these classes will need to do (displayMenu() calculateInterest() etc), which classes will need to create objects to access these methods? what java libraries do you need to import?

make a GUI/layout wireframe based on specifcations above if you need a gui

create a directory to place project in, create a github repo DO NOT CREATE A README!, pull repo to this new directory you just made

Now in IDE, create temp placeholder for the MANDATORY classes, rename Main.java (where main is) to what your program is, remove all of the publics on every class but mains

fill these classes with your COMMENT stubs from above for all of the mandatory methods and instace variables you are going to need later, just pseudcode ideas of what is going where

commit this skeleton program to github to test if github is working properly

** LOOPHERE **: start with ONE of the smaller MANDATORY chunks from above, write it and test the happy case to make sure it works. focus on getting small ideas to work first. EX: We need an array that is 20x20, lets start writing for one that is 2x2, make sure that works before making the bigger version.

Test to make sure that the small chunk you just added does not break the program (easier to debug).

now add test cases/exceptions (null pointer check, empty strings/arrays, null/empty index in array, user enters the entire bee movie script as a string, user enters string when number was expected, divide by zero, negative numbers when expecting positives, impossible/deviating logic mistakes ex: there cannot be -3 hours in a day, etc) to this small chunk

Test to make sure that the small chunk you just added does not break the program (easier to debug).

refactor this small chunk (decide what should be private, try to find ways to combine statements that makes sense, functions should only do one thing and do it well, eliminated unecessary code, etc)

Test to make sure that the small chunk you just added does not break the program (easier to debug).

commit this (what should have been) SINGLE change to github

pick next MANDATORY chunk to work at, and repeat from ** LOOPHERE **, if you run out of MANDATORY chunks and have time, work on the extra features you labled


    */
    }
}