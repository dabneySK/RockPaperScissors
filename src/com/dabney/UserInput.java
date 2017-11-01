package com.dabney;
import java.util.InputMismatchException;
import java.util.Scanner;

class UserInput {
    private static Scanner input;

    static {
        input = new Scanner(System.in);
    }

    public int getInt(int min, int max) {
        int userInput;


        for(int retries = 0;; retries++) {
            try {
                System.out.print("Enter a number between "
                        + min + " and " + max + " : ");
                userInput = input.nextInt();
                return userInput;
            } catch (InputMismatchException e) {
                input.nextLine();
                if(retries < 3) {
                    System.out.println("You entered the wrong input.");
                    continue;
                } else {
                 throw e;
                }
            }
        }
    }
}
