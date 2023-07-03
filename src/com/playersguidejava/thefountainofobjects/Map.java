package com.playersguidejava.thefountainofobjects;

import com.playersguidejava.thefountainofobjects.fields.EmptyField;
import com.playersguidejava.thefountainofobjects.fields.Field;
import com.playersguidejava.thefountainofobjects.fields.FountainField;

import java.util.Scanner;

public class Map {

    private final Field[][] MAP;
    final int MAP_SIZE = askMapSize();
    final int FOUNTAIN_ROW = (MAP_SIZE /2);
    final int FOUNTAIN_COLUMN = (MAP_SIZE /3);

    public void enterField(int column, int row) {
        Field currentField = getField(column, row);
        currentField.enterField();
        scanForPits(column, row);
    }

    public void scanForPits(int column, int row) {
        for (int i = 1; i >= -1; i--) {
            for (int j = 1; i >= -1; j--) {
                Field surroundings;
                try {
                    surroundings = getField((column + i), (row + j));
                }catch(Exception e){
                    break;
                }
                if (surroundings instanceof FountainField) {
                    System.out.println("I hear something big rumbling in a room nearby.");
                    return;
                }
            }
        }
    }

    private static int askMapSize() {
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

    public Field[][] fillMap() {
        Field[][] map = new Field[MAP_SIZE][MAP_SIZE];
        for (int i = 0; i <= (MAP_SIZE - 1); i++) {
            for (int j = 0; j <= (MAP_SIZE - 1); j++) {
                if (i == FOUNTAIN_ROW && j == FOUNTAIN_COLUMN) {
                    map[i][j] = new FountainField();
                }
                else {
                    map[i][j] = new EmptyField();
                }
            }
        }
        return map;
    }

    public Map() {
        this.MAP = fillMap();
    }

    public int getMAP_SIZE() {
        return MAP_SIZE;
    }

    public int getFOUNTAIN_ROW() {
        return FOUNTAIN_ROW;
    }

    public int getFOUNTAIN_COLUMN() {
        return FOUNTAIN_COLUMN;
    }

    public Field getField(int column, int row) {
        return MAP[row][column];
    }
}