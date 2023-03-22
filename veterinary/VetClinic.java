package veterinary;

import java.util.ArrayList;
import java.util.List;
import Task2.*;
import Task2.interfaces.Flyable;
import Task2.interfaces.Runnable;
import Task2.interfaces.Speakable;
import Task2.interfaces.Swimable;

public class VetClinic  {
   private final List<Animal> animals;

   public List<Animal> getAnimals() { return animals; }
   
   public VetClinic addAnimal(Animal animal) {
        this.animals.add(animal);
        return this;
   }

   public VetClinic() { this.animals = new ArrayList<>(); }

   public List<Animal> getAllAnimals() { return this.animals; }

   public List<Runnable> getRunningAnimals() {
      List<Runnable> runningAnimals = new ArrayList<>();

      for (Animal a: this.animals)
         if (a instanceof Runnable) runningAnimals.add((Runnable) a);

      return runningAnimals;
   }

   public List<Swimable> getSwimmingAnimals() {
      List<Swimable> swimmingAnimals = new ArrayList<>();

      for (Animal a: this.animals)
         if (a instanceof Swimable) swimmingAnimals.add((Swimable) a);

      return swimmingAnimals;
   }

    public List<Flyable> getFlyingAnimals() {
      List<Flyable> flyingAnimals = new ArrayList<>();

      for (Animal a: this.animals)
         if (a instanceof Flyable) flyingAnimals.add((Flyable) a);

      return flyingAnimals;
   }

   public List<Speakable> getSpeakingAnimals() {
      List<Speakable> speakingAnimals = new ArrayList<>();

      for (Animal a: this.animals)
         if (a instanceof Speakable) speakingAnimals.add((Speakable) a);

      return speakingAnimals;
   }
}
