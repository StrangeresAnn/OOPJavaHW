package Task2.impl;

import Task2.Animal;
import Task2.interfaces.Flyable;
import Task2.interfaces.Hunting;
import Task2.interfaces.Illable;

public class Eagle extends Animal implements Flyable, Illable, Hunting {
    
    public Eagle(String name) {
        super(null);
    }

    @Override
    public void getProcessHunt() {}

    @Override
    public int getFlyghtSpeed() {
        return 100;
    }

    @Override
    public void getIll() {}
}

