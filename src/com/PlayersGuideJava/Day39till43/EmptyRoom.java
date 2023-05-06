package com.PlayersGuideJava.Day39till43;

public class EmptyRoom extends Room {

    @Override
    public void action() {
        System.out.println("empty room");
    }

}
//    public boolean isEmpty() {
//        return true;
//    }
//
//    public EmptyRoom(int row, int column, int roomNumber) {
//        super(row, column, roomNumber);
//    }
//
//
////    public boolean isEmpty() {
////        return isEmpty;
////    }
////
////    public EmptyRoom(int row, int column, int roomNumber){
////        super(roomNumber);
////
////        this.setRow(row);
////        this.setColumn(column);
////    }
//}
