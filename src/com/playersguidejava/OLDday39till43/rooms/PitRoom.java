package com.playersguidejava.OLDday39till43.rooms;

import com.playersguidejava.OLDday39till43.ChangeString;

public class PitRoom extends Room {

    @Override
    public void action() {
        System.out.println(ChangeString.color.PURPLE.toString(
                "You entered a PIT ROOM"));
    }
}
