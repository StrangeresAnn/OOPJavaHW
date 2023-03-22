package Task2.impl;

import Task2.Animal;
import Task2.interfaces.Hunting;
import Task2.interfaces.Illable;
import Task2.interfaces.Runnable;
import Task2.interfaces.Speakable;

public class Cat extends Animal implements Illable, Runnable, Hunting, Speakable {

    public Cat(String name, String color) {
        super(name, color, 4);
    }
    
    public Cat(String name) {
        this(name, null);
    }

    private void wakeUp() {
        System.out.println("Cat woke up...");
    }

    private void findFood() {
        System.out.println("Cat found food...");
    }

    private void eat() {
        System.out.println("Cat ate...");
    }

    public void toPlay() {
        System.out.println("Cat played...");
    }
    
    public void goToSleep() {
        System.out.println("Cat already asleep...");
    }

    @Override
    public void speak() {
        System.out.println("Meow!");
    }

    @Override
    public void getIll() {
        System.out.printf("%s заболел", this.getName());
    }

    @Override
    public int getRunSpeed() {
        return 15;
    }

    @Override
    public void getProcessHunt() {
        wakeUp();
        findFood();
        eat();
    }
}