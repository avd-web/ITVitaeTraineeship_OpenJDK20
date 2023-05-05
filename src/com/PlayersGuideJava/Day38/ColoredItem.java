package com.PlayersGuideJava.Day38;

public class ColoredItem<T> {
    public ConsoleColors color;
    public T item;

    public void display(){
        System.out.println(color.getANSI());
        System.out.println(item.getClass().getName());
    }

    public ColoredItem(T item, ConsoleColors color){
        this.item = item;
        this.color = color;
    }
}




