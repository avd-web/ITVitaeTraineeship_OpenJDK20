package com.playersguidejava.thefountainofobjects;

import com.playersguidejava.thefountainofobjects.fields.Field;

public class Player {

    private int column;
    private int row;
    private boolean objectivesCompleted;

    //Constructor
    public Player(int column, int row){
        this.column = column;
        this.row = row;
    }

    public void move() {
        String userInput = Menu.menu();
        System.out.println(ChangeText.color.GREEN.toString("Your choice: " + userInput));

        switch (userInput.toLowerCase().trim()) {
            case "move north" -> setColumn((column + 1));
            case "move south" -> setColumn((column - 1));
            case "move east" -> setRow((row + 1));
            case "move west" -> setRow((row - 1));

        }
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public boolean isObjectivesCompleted() {
        return objectivesCompleted;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }
}
