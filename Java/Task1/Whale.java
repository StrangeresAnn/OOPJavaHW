package Task1;

public class Whale extends Animal {
    public Whale(String name, String color) {
        super(name, color, 4);
    }
    
    public Whale(String name) {
        this(name, null);
    }

    @Override
    public void speak() {
        System.out.println("Wooo!");
    }

    @Override
    public void  fly() {}

    @Override
    public void  toGo() {}
}
