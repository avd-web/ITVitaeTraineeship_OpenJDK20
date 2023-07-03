package com.playersguidejava.thefountainofobjects;

public class Run {
    public static void main(String[] args) {
        Map map = new Map();
//        System.out.println(map.getFOUNTAIN_COLUMN());
//        System.out.println(map.getFOUNTAIN_ROW());
        Player player = new Player(0,0);
        do {
            player.move();
            int column = player.getColumn();
            int row = player.getRow();
            map.enterField(column, row);
        } while (!player.isObjectivesCompleted() ||
                (player.getRow() > 0) ||
                (player.getColumn() > 0));
    }
}
