package com.dabney;
import java.util.Scanner;

class Human extends Player {

    private static Scanner input = new Scanner(System.in);

    @Override
    public void setChoice() {
        System.out.println("Please input your choice?");
        System.out.print("Rock, Paper, or Scissors: ");
        choice = input.nextLine();
    }
}
