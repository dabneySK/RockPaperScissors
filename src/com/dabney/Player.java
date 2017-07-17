package com.dabney;

class Player {
    protected String choice;
    private int wins;

    public String getChoice() {
        return choice;
    }

    public int getWins() {
        return wins;
    }

    public void setChoice() {
        choice = "Null!!!";
    }

    public void setWins(int wins) {
        this.wins = wins;
    }
}
