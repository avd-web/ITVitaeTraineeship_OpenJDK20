package com.playersguidejava.thefountainofobjects;

public class ChangeText {

    public enum color {
        PURPLE("\033[0;35m"),
        WHITE("\033[0;37m"),
        GREEN("\033[0;32m"),
        YELLOW("\033[0;33m"),
        BLUE("\033[0;34m");

        private final String ansiCode;
        private final String exitCode = "\033[0m";
        color(String code){
            this.ansiCode = code;
        }

        @Override
        public String toString(){
            return null;
        }

        public String toString(String input){
            return this.ansiCode + input + this.exitCode;
        }

    }

}
