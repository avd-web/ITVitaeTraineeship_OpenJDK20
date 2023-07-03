package com.playersguidejava.OLDday39till43.rooms;

import com.playersguidejava.OLDday39till43.ChangeString;

public class FountainRoom extends Room {

    @Override
    public void action() {
        System.out.println(ChangeString.color.BLUE.toString(
                "You hear water dripping in this room. The Fountain of Objects is here!"));
    }

}

