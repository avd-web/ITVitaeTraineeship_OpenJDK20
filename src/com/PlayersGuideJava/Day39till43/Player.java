package com.PlayersGuideJava.Day39till43;

public class Player {

    private int row;
    private int column;
    private boolean objectivesCompleted;
    private Room currentRoom;

    //Constructor
    public Player(){
        this.row = 0;
        this.column = 0;
        this.objectivesCompleted = false;
    }

    public void runRoomAction(){
        this.currentRoom.action();
    }

    public int getRowPosition(){
        return this.row;
    }

    public void setRow(int row) {
        if (row >= RunTheFountainOfObjects.fieldSize || row < 0){
            System.out.println("I can't move in that direction");
            return;
        }
        this.row = row;
    }

    public int getColumnPosition(){
        return this.column;
    }

    public void setColumn(int column) {
        if (column >= RunTheFountainOfObjects.fieldSize  || column < 0){
            System.out.println("I can't move in that direction");
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

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }
}