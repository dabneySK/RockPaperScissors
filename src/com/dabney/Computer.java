package com.dabney;


class Computer extends Player {
    
    private int rollRandomNumber() {
        return (int) (Math.round( Math.random() * 2 ));
    }

    @Override
    public String getChoice() {

        switch(rollRandomNumber()) {
            case 0:
                return "Rock";
            case 1:
                return "Paper";
            case 2:
                return "Scissors";
            default:
                return null;
        }
    }

}
