package com.PlayersGuideJava.Day36;

public class RunRoomCoordinates {
    public static void main(String[] args) {
        Coordinate coordinateNr1 = new Coordinate(0, 0);
//        Coordinate coordinateExtra = new Coordinate(0,2);
        Coordinate coordinateNr2 = new Coordinate(0, 2);
        Coordinate coordinateNr3 = new Coordinate(1, 0);
        Coordinate coordinateNr4 = new Coordinate(1, 2);
//        System.out.println(coordinateNr1.row());
//        System.out.println(coordinateNr2.equals(coordinateExtra));

        System.out.println(Check.coordinatesConnected(coordinateNr1, coordinateNr2)); //output: false;
        System.out.println(Check.coordinatesConnected(coordinateNr2, coordinateNr3)); //output: false;
        System.out.println(Check.coordinatesConnected(coordinateNr1, coordinateNr3)); //output: true;
        System.out.println(Check.coordinatesConnected(coordinateNr4, coordinateNr2)); //output: true;
    }

    /*
    Day 36 Challenge: Room Coordinates 50 XP

The time to enter the Fountain of Objects draws closer. While you don’t know what to expect, you have found some scrolls that
describe the area in ancient times. It seems to be structured as a set of rooms in a grid-like arrangement. Locations of the room
may be represented as a row and column, and you take it upon yourself to try to capture this concept with a new record
definition.

ObjectivesObjectives:
Create a Coordinate record that can represent a room coordinate with a row and column.
Ensure Coordinate is immutable.
Make a method to determine if one coordinate is adjacent to another (differing only by a single row or column).
Write a main method that creates a few coordinates and determines if they are adjacent to each other to prove that it is
working correctly.

     */
}
