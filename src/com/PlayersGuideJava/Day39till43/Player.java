package com.PlayersGuideJava.Day39till43;

public class Player {
    private int rowPosition;
    private int columnPosition;

    public Player(){
        this.rowPosition = 0;
        this.columnPosition = 0;
    }

    public int getRowPosition() {
        return rowPosition;
    }

    public void setRowPosition(int rowPosition) {
        this.rowPosition = rowPosition;
    }

    public int getColumnPosition() {
        return columnPosition;
    }

    public void setColumnPosition(int columnPosition) {
        this.columnPosition = columnPosition;
    }

}
