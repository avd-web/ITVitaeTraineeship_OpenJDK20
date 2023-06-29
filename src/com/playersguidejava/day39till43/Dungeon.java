package com.playersguidejava.day39till43;

import java.util.Scanner;

public class Dungeon {

    private final Room[][] DUNGEON;
    final int FIELD_SIZE = askDungeonSize();
    final int FOUNTAIN_ROW = (FIELD_SIZE/2);
    final int FOUNTAIN_COLUMN = (FIELD_SIZE/3);

    private static int askDungeonSize() {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Input dungeon size: ");

            while (!scanner.hasNextInt()) {
                System.out.println("That's not a number!");
                scanner.next(); // this is important!
            }

            size = scanner.nextInt();

            if (size < 2 || size > 9){
                System.out.println("dungeon size too big or small.");
            }

        } while (size < 2 || size > 8);
        return size;

    }

    public Room[][] fillDungeon() {
        Room[][] dungeon = new Room[FIELD_SIZE][FIELD_SIZE];

        for (int i = 0; i <= (FIELD_SIZE - 1); i++) {
            for (int j = 0; j <= (FIELD_SIZE - 1); j++) {
                if (i == FOUNTAIN_ROW && j == FOUNTAIN_COLUMN) {
                    dungeon[i][j] = new FountainRoom();
                }
                else {
                    dungeon[i][j] = new EmptyRoom();
                }
            }
        }
        return dungeon;
    }

    public Dungeon() {
        this.DUNGEON = fillDungeon();
    }

    public int getFIELD_SIZE() {
        return FIELD_SIZE;
    }

    public int getFOUNTAIN_ROW() {
        return FOUNTAIN_ROW;
    }

    public int getFOUNTAIN_COLUMN() {
        return FOUNTAIN_COLUMN;
    }

    public Room getRoom(int row, int column) {
        return DUNGEON[row][column];
    }
}


