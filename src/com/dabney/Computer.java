package com.dabney;

class Computer extends Player {


    private int rollRandomNumber() {
        return (int) (Math.round( Math.random() * 2 ));
    }

    @Override
    public void setChoice() {

        int computerChoice = rollRandomNumber();
        switch(computerChoice) {
            case 0:
                choice = choice.ROCK;
                break;
            case 1:
                choice = choice.PAPER;
                break;
            case 2:
                choice = choice.SCISSORS;
                break;
            default:
                choice = null;
                break;
        }
    }
}
