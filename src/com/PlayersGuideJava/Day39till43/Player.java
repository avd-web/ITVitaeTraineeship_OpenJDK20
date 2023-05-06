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
        if (currentRoom instanceof FountainRoom){
            objectivesCompleted = true;
        }
        this.currentRoom.action();
    }

    public int getRowPosition(){
        return this.row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumnPosition(){
        return this.column;
    }

    public void setColumn(int column) {
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

//    private int rowPosition;
//    private int columnPosition;
//
//    private Room currentRoom;
//
//    public Player(){
//        this.rowPosition = 0;
//        this.columnPosition = 0;
//    }
//
//    public int getRowPosition() {
//        return rowPosition;
//    }
//
//    public void setRowPosition(int rowPosition) {
//        this.rowPosition = rowPosition;
//    }
//
//    public int getColumnPosition() {
//        return columnPosition;
//    }
//
//    public void setColumnPosition(int columnPosition) {
//        this.columnPosition = columnPosition;
//    }
//
//    public void setCurrentRoom(Room currentRoom) {
//        this.currentRoom = currentRoom;
//    }
//}
