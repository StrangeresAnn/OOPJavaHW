package Task2;

import Task2.impl.*;
import Task2.interfaces.Flyable;
import Task2.interfaces.Runnable;
import Task2.interfaces.Speakable;
import Task2.interfaces.Swimable;
import veterinary.Doctor;
import veterinary.VetClinic;

public class Main {
        public static void main(String[] args) { 
                VetClinic vetClinic = new VetClinic();
                vetClinic
                        .addAnimal(new Cat("Мурзик"))
                        .addAnimal(new Dog("Бобик"))
                        .addAnimal(new Duck("Дональд"))
                        .addAnimal(new Dolphin("Флиппер"))
                        .addAnimal(new Eagle("Чиль"))
                        .addAnimal(new Whale("Моби Дик"))
                        .addAnimal(new Doctor("Иван"));
                
                        System.out.println("All animals:");
                        for (Animal a: vetClinic.getAllAnimals()) {
                            System.out.println(a);
                        }
                
                        System.out.println("\nRunning animals:");
                        for (Runnable r: vetClinic.getRunningAnimals()) {
                            System.out.println(r + "\n" + r.getRunSpeed());
                        }
                
                        System.out.println("\nSwimming animals:");
                        for (Swimable s: vetClinic.getSwimmingAnimals()) {
                            System.out.println(s + "\n" + s.getSwimSpeed());
                        }
                
                        System.out.println("\nFlying animals:");
                        for (Flyable f: vetClinic.getFlyingAnimals()) {
                            System.out.println(f + "\n" + f.getFlyghtSpeed());
                        }
                
                        System.out.println("\nSpeaking animals:");
                        for (Speakable sp: vetClinic.getSpeakingAnimals()) {
                            System.out.println(sp);
                            sp.speak();
                        }
        }
}

        




