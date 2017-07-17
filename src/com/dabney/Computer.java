package com.dabney;


class Computer extends Player {

    private int rollRandomNumber() {
        return (int) (Math.round( Math.random() * 2 ));
    }

    @Override
    public void setChoice() {
        switch(rollRandomNumber()) {
            case 0:
                choice = "Rock";
            case 1:
                choice = "Paper";
            case 2:
                choice = "Scissors";
            default:
                choice = null;
        }
    }


}
