package Task1;

public class Dog extends Animal {
    public Dog(String name, String color) {
        super(name, color, 4);
    }
    
    public Dog(String name) {
        this(name, null);
    }

    public void wakeUp() {
        System.out.println("Dog woke up...");
    }

    public void findFood() {
        System.out.println("Dog found food...");
    }

    public void eat() {
        System.out.println("Dog ate...");
    }

    public void toPlay() {
        System.out.println("Dog played...");
    }
    
    public void goToSleep() {
        System.out.println("Already asleep...");
    }

    @Override
    public void  fly() {}

    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}
