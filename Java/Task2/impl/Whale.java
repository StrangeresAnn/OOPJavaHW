package Task2.impl;

import Task2.Animal;
import Task2.interfaces.Hunting;
import Task2.interfaces.Swimable;

public class Whale extends Animal implements Swimable, Hunting {

    public Whale(String name, String color) {
        super(name, color, 4);
    }
    
    public Whale(String name) {
        this(name, null);
    }

    @Override
    public void getProcessHunt() {}

    @Override
    public int  getSwimSpeed() {
        return 60;
    }
}
