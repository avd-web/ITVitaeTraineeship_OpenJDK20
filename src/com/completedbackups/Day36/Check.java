package com.completedbackups.Day36;

public class Check {
    public static boolean coordinatesConnected(Coordinate coordinate1, Coordinate coordinate2) {
        try {
            if ((coordinate1.row() + 1) == coordinate2.row()) {
                return coordinate1.column() == coordinate2.column();
            } else if ((coordinate1.column() + 1) == coordinate2.column()) {
                return coordinate1.row() == coordinate2.row();
            }
            if ((coordinate2.row() + 1) == coordinate1.row()) {
                return coordinate2.column() == coordinate1.column();
            } else if ((coordinate2.column() + 1) == coordinate1.column()) {
                return coordinate2.row() == coordinate1.row();
            }
            return false;
        } catch (Exception e){
            System.out.println("COMPARISON FAILED");
            return false;
        }
    }
}
