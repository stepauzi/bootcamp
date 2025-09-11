import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class DemoLambdaExample {
  public static void main(String[] args) {
    // 1. for loop
    List<String> names = new ArrayList<>();
    names.add("Peter");
    names.add("Leo");
    names.add("Mary");
    for (String name : names) {
      System.out.println(name);
    }

    names.forEach(n -> System.out.println(n));

    names.forEach(n -> {
      if (n.length() > 4) {
        System.out.println(n);
      }
    });

    // Comparator
    // int compare(T o1, T o2);
    Comparator<Person> sortByAgeDesc =
        (p1, p2) -> p1.getAge() > p2.getAge() ? -1 : 1;
    List<Person> persons = new ArrayList<>();
    persons.add(new Person(54));
    persons.add(new Person(100));
    persons.add(new Person(45));
    Collections.sort(persons, sortByAgeDesc);
    System.out.println(persons);

    Collections.sort(persons, (p1, p2) -> p1.getAge() < p2.getAge() ? -1 : 1);
    System.out.println(persons);

    

  }

  public static class Person {
    private int age;

    public Person(int age) {
      this.age = age;
    }

    public int getAge() {
      return this.age;
    }

    public String toString() {
      return "Person(" //
          + "age=" + this.age //
          + ")";
    }
  }
}
