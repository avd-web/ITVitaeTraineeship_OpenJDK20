package com.playersguidejava.OLDday39till43;

import com.playersguidejava.OLDday39till43.rooms.FountainRoom;
import com.playersguidejava.OLDday39till43.rooms.Room;

public class Player {

    private int row;
    private int column;
    private boolean objectivesCompleted = false;
    private final Dungeon DUNGEON = new Dungeon();
    private Room currentRoom = DUNGEON.getRoom(row, column);

    public void introduction(){
        //PRINT INTRO
        System.out.println(ChangeString.color.PURPLE.toString("You entered a dark cavern and the door behind you closes, leaving you in complete darkness."));
        System.out.println("column: " + DUNGEON.getFOUNTAIN_COLUMN() + ", row: " + DUNGEON.getFOUNTAIN_ROW());
    }

    public void checkWin(){

        //check win conditions
        do {
            String userInput = Menu.menu();

            //PRINT USER INPUT
            System.out.println(ChangeString.color.GREEN.toString("Your choice: " + userInput));

            switch (userInput.toLowerCase().trim()) {
                case "move north" ->
                    setColumn((column + 1));
                case "move south" ->
                    setColumn((column - 1));
                case "move east" ->
                    setRow((row + 1));
                case "move west" ->
                    setRow((row - 1));
                case "activate" -> {
                    if (this.getCurrentRoom() instanceof FountainRoom){
                        this.setObjectivesCompleted(true);
                        //PRINT DESCRIPTIVE TEXT: FOUNTAIN
                        System.out.println(ChangeString.color.PURPLE.toString(
                                        "You hear the rushing waters from the Fountain of Objects. It has been reactivated"));
                        continue;
                    }
                    else {
                        //PRINT NON-ACTION ROOM
                        System.out.println(ChangeString.color.PURPLE.toString(
                                        "Nothing to activate in this room."));
                    }
                }
            }
            currentRoom = DUNGEON.getRoom(row, column);
            runRoomAction();
        }
        while (!this.isObjectivesCompleted() ||
                (this.getRowPosition() > 0) ||
                (this.getColumnPosition() > 0));

        //PRINT ENDING
        System.out.println(ChangeString.color.YELLOW.toString(
                "You see light in this room coming from outside the cavern. This is the entrance."));
        System.out.println(ChangeString.color.PURPLE.toString(
                "Congratulations you escaped!"));
    }

    //Constructor
    public Player(int column, int row){
        this.column = column;
        this.row = row;
    }

    public void runRoomAction(){
        this.currentRoom.action();
    }

    public int getRowPosition(){
        return this.row;
    }

    public void setRow(int row) {
        if (row >= DUNGEON.getFIELD_SIZE() || row < 0){
            System.out.println(ChangeString.color.GREEN.toString("I can't move in that direction"));
            return;
        }
        this.row = row;
    }

    public int getColumnPosition(){
        return this.column;
    }

    public void setColumn(int column) {
        if (column >= DUNGEON.getFIELD_SIZE()  || column < 0){
            System.out.println(ChangeString.color.GREEN.toString("I can't move in that direction"));
            return;
        }
        this.column = column;
    }

    public boolean isObjectivesCompleted() {
        return objectivesCompleted;
    }

    public void setObjectivesCompleted(boolean objectivesCompleted) {
        this.objectivesCompleted = objectivesCompleted;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }
}