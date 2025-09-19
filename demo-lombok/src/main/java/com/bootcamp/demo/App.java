package com.bootcamp.demo;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!!!!!");

    Person p1 = new Person("John", 13);
    System.out.println(p1.getAge());
    System.out.println(p1.getName());
    System.out.println(p1);
    p1.setAge(15);
    p1.setName("Mary");
    System.out.println(p1);
    
    Person p2 = new Person("Mary", 15);
    System.out.println(p1.equals(p2)); // true
    System.out.println(p1.hashCode() == p2.hashCode());

    
  }
}
