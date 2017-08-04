package com.dabney;

class GameLogic {
    private int winner;

    private void setWinner(int winner) {
        this.winner = winner;
    }

    public int getWinner() {

        return winner;
    }

    public void findWinner(String player1, String player2) {

        // if player 1 wins, return 1, if player2 wins, return 2
        // returns -1 if it was a tie

        if(player1.equalsIgnoreCase(player2)) {
            setWinner(-1);
        } else if(player1.equalsIgnoreCase("Rock")) {
            if(player2.equalsIgnoreCase("Paper")) {
                setWinner(2);
            } else if (player2.equalsIgnoreCase("Scissor")) {
                setWinner(1);
            }
        } else if(player1.equalsIgnoreCase("Paper")) {
            if(player2.equalsIgnoreCase("Rock")) {
                setWinner(1);
            } else if (player2.equalsIgnoreCase("Scissor")) {
                setWinner(2);
            }
        } else if(player1.equalsIgnoreCase("Scissor")) {
            if(player2.equalsIgnoreCase("Rock")) {
                setWinner(2);
            } else if (player2.equalsIgnoreCase("Paper")) {
                setWinner(1);
            }
        }
    }

    public void incrementScore(int winner, Player player1, Player player2) {
        System.out.printf("ROUND WINNER: ");
        switch(winner) {
            case -1:
                System.out.printf("It was a tie...\n");
                break;
            case 1:
                System.out.printf("Player 1 wins with " + player1.getChoice() + "\n");
                player1.setWins(1);
                break;
            case 2:
                System.out.printf("Player 2 wins with " + player2.getChoice() + "\n");
                player2.setWins(1);
                break;
            default:
                break;


        }
    }




}
