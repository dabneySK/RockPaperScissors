package com.dabney;
import java.util.Scanner;

class UserInput {
    private static Scanner input;

    static {
        input = new Scanner(System.in);
    }

    public int getInt() {
        int userInput;
            System.out.print("Please enter a number: ");
            userInput = input.nextInt();
        return userInput;
    }

    public int getInt(int min, int max) {
        int userInput;
        do {
            System.out.print("Please enter a between " + min + " and " + max + " : ");
            userInput = input.nextInt();
        } while(userInput < min || userInput > max );
        return userInput;
    }

}
