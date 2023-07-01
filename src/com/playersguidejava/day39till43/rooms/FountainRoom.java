package com.playersguidejava.day39till43.rooms;

import com.playersguidejava.day39till43.rooms.Room;

public class FountainRoom extends Room {

    @Override
    public void action() {
        System.out.println("\033[0mYou hear water dripping in this room. The Fountain of Objects is here!");
    }

}

