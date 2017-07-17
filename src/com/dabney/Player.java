package com.dabney;

abstract class Player {
    protected String choice;
    private int wins;

    Player() {
        wins = 0;
    }

    public String getChoice() {
        return choice;
    }

    public int getWins() {
        return wins;
    }

    public abstract void setChoice();

    public void setWins(int wins) {
        this.wins += wins;
    }
}
