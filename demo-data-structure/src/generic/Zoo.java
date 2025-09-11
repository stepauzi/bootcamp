package generic;

import java.util.ArrayList;
import java.util.List;

public class Zoo<T extends Animal> {
  private List<T> animals;

  public Zoo() {
    this.animals = new ArrayList<>();
  }

  public boolean add(T animal) {
    return this.animals.add(animal);
  }

  // ! static method generic type has NO relationship with Class generic type.
  public static <T extends Animal> String getAnimalName(T animal) {
    return animal.getName();
  }

  public static void main(String[] args) {
    Zoo<Lion> lionZoo = new Zoo<>();
    lionZoo.add(new Lion("John"));

    Zoo<Animal> animalZoo = new Zoo<>();
    animalZoo.add(new Lion("Lucas"));

    Zoo1 zoo = new Zoo1();
    zoo.add(new Lion("Jennie"));
    zoo.add(new Lion("Steve"));

  }
}
