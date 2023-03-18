package Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) { 

                Cat cat1 = new Cat("Мурзик");

                List<Animal> animals = new ArrayList<>();
                animals.add(cat1);
                animals.add(new Dog("Вольт"));
                animals.add(new Duck("Дональд"));
                animals.add(new Whale("Моби Дик"));
                animals.add(new Eagle("Рекар"));
                animals.add(new Dolphin("Флиппер"));

                for (Animal a: animals) {
                        a.toGo();
                        System.out.println();
                }

                for (Animal a: animals) {
                        a.swim();
                        System.out.println();
                }

                for (Animal a: animals) {
                        a.fly();
                        System.out.println();
                }
                
        }

}

