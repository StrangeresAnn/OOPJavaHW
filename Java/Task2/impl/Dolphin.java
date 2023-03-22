package Task2.impl;

import Task2.Animal;
import Task2.interfaces.Hunting;
import Task2.interfaces.Swimable;

public class Dolphin extends Animal implements Swimable, Hunting {
    public Dolphin(String name, String color) {
        super(name, color, 4);
    }
    
    public Dolphin(String name) {
        this(name, null);
    }

    @Override
    public void getProcessHunt() {}

    @Override
    public int getSwimSpeed() {
        return 100;
    }
}
