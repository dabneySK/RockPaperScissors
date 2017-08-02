package com.dabney;

class Computer extends Player {


    private int rollRandomNumber() {
        return (int) (Math.round( Math.random() * 2 ));
    }

    @Override
    public void setChoice() {

        int computerChoice = rollRandomNumber();
        System.out.println("GOT THIS FAR, computer random rolled is " + computerChoice);
        switch(computerChoice) {
            case 0:
                choice = "Rock";
            case 1:
                choice = "Paper";
            case 2:
                choice = "Scissor";
            default:
                choice = null;
        }
    }
}
