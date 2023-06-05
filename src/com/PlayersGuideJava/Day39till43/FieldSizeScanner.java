package com.PlayersGuideJava.Day39till43;

import java.util.Scanner;

public class FieldSizeScanner {
    public static int fieldSize;

    public static int ScanFieldSize() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Input field size: ");

            while (!scanner.hasNextInt()) {
            System.out.println("That's not a number!");
            scanner.next(); // this is important!
            }

            fieldSize = scanner.nextInt();

            if (fieldSize < 2 || fieldSize > 9){
            System.out.println("field size too big or small.");
            }

        } while (fieldSize < 2 || fieldSize > 8);
        return  fieldSize;

    }

}
