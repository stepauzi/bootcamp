import java.util.LinkedList;

public class Person {
  private String name;
  private Person person;

  // constructor
  public Person(String name, Person person) {
    this.name = name;
    this.person = person;
  }

  // get
  public Person getPerson() {
    return this.person;
  }

  public String getName() {
    return this.name;
  }
}
