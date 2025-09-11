package com.bootcamp.demo;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");

    Person p1 = new Person("John", 13);
    System.out.println(p1.getAge());
    System.out.println(p1.getName());
    System.out.println(p1);
    p1.setName("Mary");
    System.out.println(p1);

    Person p2 = new Person("Mary", 15);
    System.out.println(p1.equals(p2));
    System.out.println(p1.hashCode() == p2.hashCode());

    Cat cat1 = new Cat("Lily", 1, false, LocalDate.of(2025, 1, 1));
    System.out.println(cat1);
  }
}
