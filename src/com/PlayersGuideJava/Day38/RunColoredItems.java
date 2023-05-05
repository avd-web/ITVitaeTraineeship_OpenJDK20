package com.PlayersGuideJava.Day38;

public class RunColoredItems {

    public static void main(String[] args) {
        ColoredItem<Sword> sword = new ColoredItem<>(new Sword(), ConsoleColors.GREEN);
        sword.display();

//        ColoredItem<Sword> sword = new ColoredItem<>("green");
//        sword.display();

//        ColoredItem<Axe> axe = new ColoredItem<>("blue", "axe");




    }

    /*
    Day 38 Challenge : Colored Items 100 XP

You have a sword, a bow, and an axe in front of you, defined like this:
public class Sword { }
public class Bow { }
public class Axe { }
You want to associate a color with these items (or any item type). You could make ColoredSword derived from Sword that adds a
Color property, but doing this for all three item types will be painstaking. Instead, you define a new generic ColoredItem class that
does this for any item.

ObjectivesObjectives:
Put the three class definitions above into a new package.
Define a generic class to represent a colored item. It must have properties for the item itself (generic in type) and a
ConsoleColor associated with it.
Add a void display() method to your colored item type that changes the console’s foreground color to the item’s color and
displays the item in that color.
In your main method, create a new colored item containing a blue sword, a red bow, and a green axe. Display all three
items to see each item displayed in its color

// Regular ConsoleColors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   ///WHITE
     */
}
