package com.dabney;

class Human extends Player {

    private UserInput input;

    Human() {
        input = new UserInput();
    }

    @Override
    public void setChoice() {
        int numChoice;
        System.out.println("Please input your choice:");
        System.out.println("1) Rock\n2) Paper\n3) Scissors ");
        numChoice = input.getInt(1, 3);
        switch (numChoice) {
            case 1:
                choice = "rock";
                break;
            case 2:
                choice = "paper";
                break;
            case 3:
                choice = "scissor";
                break;
            default:
                choice = null;
        }
    }
}
