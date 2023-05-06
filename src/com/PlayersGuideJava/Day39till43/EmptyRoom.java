package com.PlayersGuideJava.Day39till43;

public class EmptyRoom extends Room {
    private final boolean isEmpty = true;

    public boolean isEmpty() {
        return isEmpty;
    }

    public EmptyRoom(int row, int column, int roomNumber){
        super(roomNumber);
        this.setRow(row);
        this.setColumn(column);
    }
}
