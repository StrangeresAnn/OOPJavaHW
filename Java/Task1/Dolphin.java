package Task1;

public class Dolphin extends Animal {
    public Dolphin(String name, String color) {
        super(name, color, 4);
    }
    
    public Dolphin(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Skree!");
    }

    @Override
    public void  fly() {}

    @Override
    public void  toGo() {}
}
