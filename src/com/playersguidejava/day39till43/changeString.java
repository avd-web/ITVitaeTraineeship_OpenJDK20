package com.playersguidejava.day39till43;

public class changeString {

    /*
Use different colors to display the different types of text in the console window.
For example, narrative items (intro,ending, etc.) may be magenta,
descriptive text in white,
input from the user in (CHANGED) GREEN,
text describing entrance light in yellow,
messages about the fountain in blue.
 */

    enum color {
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

//    public static String colorPurple(String input) {
//        return "\\e[0;35m" + input + "\\e[0m";
//    }
//
//    public static String colorWhite(String input) {
//        return "\\e[0;35m" + input + "\\e[0m";
//    }
//
//    public static String colorGreen(String input) {
//        return "\\e[0;35m" + input + "\\e[0m";
//    }
//
//    public static String colorYellow(String input) {
//        return "\\e[0;35m" + input + "\\e[0m";
//    }
//
//    public static String colorBlue(String input) {
//        return "\\e[0;35m" + input + "\\e[0m";
//    }
}


