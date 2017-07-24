package com.dabney;

import java.util.Scanner;


public class UserInput {
    private Scanner input;

    UserInput() {
        input = new Scanner(System.in);
    }

    public int getInt() {
        int userInput;
        do {
            System.out.print("Please enter a number above 0: ");
            userInput = input.nextInt();
        } while(userInput <= 0);
        return userInput;
    }

    public String getString() {
        return "";
    }
}
