package com.dabney;

class Human extends Player {

    private UserInput input;

    Human() {
        input = new UserInput();
    }


    @Override
    public void setChoice() {
        System.out.println("Please input your choice?");
        System.out.print("Rock, Paper, or Scissors: ");
        choice = input.getString();
    }
}
