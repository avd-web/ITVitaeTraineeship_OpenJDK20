package com.PlayersGuideJava.Day39till43;

public class EmptyRoom extends Room {

    @Override
    public void action() {
        System.out.println("\033[0mYou entered an empty room, nothing to do here.");
    }

}