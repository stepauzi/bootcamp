// public class Person {
public record Person(int age, String name) {
  public static final int x = 24;

  public static int getX() {
    return x + 10;
  }
  // private int age;
  // private String name;

  // ! With
  // all args constructor
  // getter
  // toString
  // equals
  // hashCode

  // ! Without
  // setter
  // empty constructor

  public static void main(String[] args) {
    Person p1 = new Person(3, "John"); // all aurgement constructor
    System.out.println(p1); // toString
    System.out.println(p1.age()); // getter
    System.out.println(p1.name()); // getter
    // ! No Setter in record

    Person p2 = new Person(3, "John"); 
    System.out.println(p1.equals(p2)); // true, equals()
    System.out.println(p1.hashCode()); // 2314632
    System.out.println(p2.hashCode()); // 2314632

    System.out.println(Person.getX()); // 34
  }
}
