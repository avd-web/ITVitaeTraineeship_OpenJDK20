package com.PlayersGuideJava.Day39till43;

public class FountainRoom extends Room {

    public boolean hasFountain() {
        return true;
    }

    public FountainRoom(int row, int column, int roomNumber){
        super(roomNumber);
        this.setRow(row);
        this.setColumn(column);
    }
}
