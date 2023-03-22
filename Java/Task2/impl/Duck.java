package Task2.impl;

import Task2.Animal;
import Task2.interfaces.Flyable;
import Task2.interfaces.Hunting;
import Task2.interfaces.Illable;
import Task2.interfaces.Runnable;
import Task2.interfaces.Speakable;
import Task2.interfaces.Swimable;

public class Duck extends Animal implements Flyable, Swimable, Runnable, Illable, Hunting, Speakable {
    public Duck(String name) {
        this(name, null);
    }

    public Duck(String name, String color) {
        super(name, color, 2);
    }


    @Override
    public void speak() {
        System.out.println("Quack-quack!");
    }

    @Override
    public void getProcessHunt() {}

    @Override
    public int getFlyghtSpeed() {
        return 10;
    }

    @Override
    public int getSwimSpeed() {
        return 10;    
    }

    @Override
    public int getRunSpeed() {
        return 5;
    }
    @Override
    public void getIll() {}
}
