package method;
// ! Java: Object Oriented Programming (OOP), C++, C#, etc.

// Blueprint
// 我地要描述既世界既Person，佢地淨係得Name和Age

// ! (Wrong Concept in Java) 因為Person特徵太少(Age and Name ONLY)，呢個世界既Person好易重覆Name and Age
// ! (Correct) 因為我覺得/我想形容既世界既Person，Name and age 係唔會重覆，我先會咁design個class。

import java.math.BigDecimal;

public class Person {
  // Attribute ()
  private int age;
  private String name;

  // Setter
  // ! p1.setAge(17), put 17 into "this" Object (p1)
  public void setAge(int age) {
    this.age = age;
  }

  // Getter
  public int getAge() {
    return this.age;
  }

  public boolean isElderly() {
    return this.age > 65;
  }

  public static boolean isElderly(Person person) {
    return person.getAge() > 65;
  }

  public static void main(String[] args) {
    // "new" -> create object
    // "Person" -> class name
    // "()" -> constructor
    // ! "p1" -> this is a name for you to call the object in memory
    Person p1 = new Person();
    BigDecimal bd1 = new BigDecimal("3.4");
    // Person p2 = new BigDecimal(7.3);

    new Person(); // create an person object in memory, but without a name for later use.

    Person p3 = new Person();
    p1.setAge(17);
    System.out.println(p1.getAge()); // 17

  }
}
