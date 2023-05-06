package com.CompletedBackups.Day38;

public class ColoredItem<T> {
    public ConsoleColors color;
    public T item;
    private final String name;
    private final String colorName;

    public void display() {
        System.out.println(color.getANSI());
        System.out.print(colorName + " ");
        System.out.print(name);
        System.out.print(ConsoleColors.RESET.getANSI());
    }

    public ColoredItem(T item, String name, ConsoleColors color) {
        this.colorName = color.name().toLowerCase();
        this.item = item;
        this.name = name;
        this.color = color;
    }
}




