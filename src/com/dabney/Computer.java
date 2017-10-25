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
                choice = GameChoices.ROCK;
                break;
            case 1:
                choice = GameChoices.PAPER;
                break;
            case 2:
                choice = GameChoices.SCISSORS;
                break;
            default:
                choice = null;
                break;
        }
    }
}
