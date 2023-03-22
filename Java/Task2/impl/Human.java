package Task2.impl;


import Task2.Animal;
import Task2.interfaces.Speakable;


public abstract class Human extends Animal implements Speakable {
    public Human(String name) {
        super(name,null,2);
    }

    @Override
    public void speak(){
        System.out.printf("Hello!");
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.getType(), this.getName());
    }
}
