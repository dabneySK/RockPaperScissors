package com.dabney;

class GameLogic {
    private int winner;

    private void setWinner(int winner) {
        this.winner = winner;
    }

    public int getWinner() {

        return winner;
    }

    public int findWinner(String player1, String player2) {

        // if player 1 wins, return 1, if player2 wins, return 2
        // returns -1 if it was a tie

        if(player1.equalsIgnoreCase(player2)) {
            return -1;
        } else if(player1.equalsIgnoreCase("Rock")) {
            if(player2.equalsIgnoreCase("Paper")) {
                return 2;
            } else if (player2.equalsIgnoreCase("Scissor")) {
                return 1;
            }
        } else if(player1.equalsIgnoreCase("Paper")) {
            if(player2.equalsIgnoreCase("Rock")) {
                return 1;
            } else if (player2.equalsIgnoreCase("Scissor")) {
                return 2;
            }
        } else if(player1.equalsIgnoreCase("Scissor")) {
            if(player2.equalsIgnoreCase("Rock")) {
                return 2;
            } else if (player2.equalsIgnoreCase("Paper")) {
                return 1;
            }
        }


        return 0;
    }


}
