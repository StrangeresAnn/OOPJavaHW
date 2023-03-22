package Task2.impl;

import Task2.Animal;
import Task2.interfaces.Hunting;
import Task2.interfaces.Runnable;
import Task2.interfaces.Speakable;
import Task2.interfaces.Swimable;

public class Dog extends Animal implements Runnable, Swimable, Hunting, Speakable {

    public Dog(String name, String color) {
        super(name, color, 4);
    }
    
    public Dog(String name) {
        this(name, null);
    }

    private void wakeUp() {
        System.out.println("Dog woke up...");
    }

    private void findFood() {
        System.out.println("Dog found food...");
    }

    private void eat() {
        System.out.println("Dog ate...");
    }

    public void toPlay() {
        System.out.println("Dog played...");
    }
    
    public void goToSleep() {
        System.out.println("Already asleep...");
    }

    @Override
    public void getProcessHunt() {
        wakeUp();
        findFood();
        eat();
    }

    @Override
    public void speak() {
        System.out.println("Woof!");
    }

    @Override
    public int getRunSpeed() {
        return 15;
    }

    @Override
    public int getSwimSpeed() {
        return 5;
    }
}
