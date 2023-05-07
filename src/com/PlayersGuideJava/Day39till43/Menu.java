package com.PlayersGuideJava.Day39till43;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    enum possibleInputs {
        MOVE_NORTH,
        MOVE_SOUTH,
        MOVE_EAST,
        MOVE_WEST,
        ACTIVATE;

        public static boolean loopOverValues(String userInput){
            for (possibleInputs e : possibleInputs.values()){
                if (userInput.equalsIgnoreCase(e.toString().replaceAll("_", " "))){
                    return true;
                }
            }
            return false;
        }

    }
    public static String menu(){
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("What do you want to do? ");
            System.out.println(Arrays.toString(possibleInputs.values()).toLowerCase().replaceAll("_", " "));
            String userInput = scanner.nextLine();
            if (possibleInputs.loopOverValues(userInput)){
                return userInput;
            }
            else {
                System.out.println("That is not an option, try again: ");
                scanner.nextLine();
            }
        } while (true);
    }
}
