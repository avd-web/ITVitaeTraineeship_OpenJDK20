package com.PlayersGuideJava.Day39till43;

public class Field {

    public static Room[][] createField() {
        int fieldSize = RunTheFountainOfObjects.fieldSize;
        int fountainRow = RunTheFountainOfObjects.fountainRow;
        int fountainColumn = RunTheFountainOfObjects.fountainColumn;

        Room[][] field = new Room[fieldSize][fieldSize];

        for (int i = 0; i <= (fieldSize - 1); i++) {
            for (int j = 0; j <= (fieldSize - 1); j++) {
                if (i == fountainRow && j == fountainColumn) {
                    field[i][j] = new FountainRoom();
                }
                else {
                    field[i][j] = new EmptyRoom();
                }
            }
        }
        return field;
    }

}


    //Create a field of "Rooms" with size as an int input.
    //A 2D for loop is used to create a square-grid.
    //All rooms are placed into Arraylist "field" during creation.
//    public ArrayList<Room> createField(int fieldSize, int fountainRow, int fountainColumn) {
//        int roomNumber = 1;
//        ArrayList<Room> field = new ArrayList<>();
//
//        for (int i = 0; i <= fieldSize; i++) {
//            for (int j = 0; j <= fieldSize; j++) {
//
//                if (i == fountainRow && j == fountainColumn) {
//                    field.add(new FountainRoom(i, j, roomNumber));
//                    roomNumber++;
//                }
//
//                field.add(new EmptyRoom(i, j, roomNumber));
//                roomNumber++;
//            }
//        }
//        System.out.println("You find yourself in a pitch black room, what do you do? ");
//        return field;
//    }


//    public void movePlayer(int row, int column, String direction){
//
//    }


