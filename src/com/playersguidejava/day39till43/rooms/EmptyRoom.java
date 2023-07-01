package com.playersguidejava.day39till43.rooms;

import com.playersguidejava.day39till43.rooms.Room;

public class EmptyRoom extends Room {

    @Override
    public void action() {
        System.out.println("You entered an empty room, nothing to do here.");
    }

}