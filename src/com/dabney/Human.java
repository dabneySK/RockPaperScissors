package com.dabney;
import java.util.Scanner;

class Human extends Player {

    private static Scanner input = new Scanner(System.in);

    @Override
    public void setChoice() {
        System.out.println("What is your choice?");
        System.out.println("Rock\nPaper\nScissors");
        choice = input.nextLine();
    }
}
