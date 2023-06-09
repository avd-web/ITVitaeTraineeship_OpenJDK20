package com.completedbackups.Day38;

public enum ConsoleColors {

    BLACK("\033[0;30m"),
    RED("\033[0;31m"),
    GREEN("\033[0;32m"),
    YELLOW("\033[0;33m"),
    BLUE("\033[0;34m"),
    PURPLE("\033[0;35m"),
    CYAN("\033[0;36m"),
    WHITE("\033[0;37m"),
    RESET("\033[0m");

    private final String ANSI_Console_Color_CODE;

    public String getANSI() {
        return ANSI_Console_Color_CODE;
    }

    ConsoleColors(String color) {
        this.ANSI_Console_Color_CODE = color;
    }
}

