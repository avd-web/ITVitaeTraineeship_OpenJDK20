package com.playersguidejava.day39till43.rooms;

import com.playersguidejava.day39till43.ChangeString;

public class EmptyRoom extends Room {

    @Override
    public void action() {
        System.out.println(ChangeString.color.PURPLE.toString(
                "You entered an empty room, nothing to do here."));
    }

}