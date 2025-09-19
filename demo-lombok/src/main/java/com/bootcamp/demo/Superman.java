package com.bootcamp.demo;


public class Superman implements Flyable {
  // ! You have to override fly() method.
  @Override
  public void fly() {
    System.out.println("Superman is flying ...");
  }

  // ! Optional to override swim() method, because swim() is a default method.
  @Override
  public void swim() {
    System.out.println("Superman is swimming");
  }


  public static void main(String[] args) {
    Superman s1 = new Superman();
    s1.swim();
    s1.fly();

    Flyable s2 = new Superman();
    s2.swim(); // ! Flyable -> swim()
    s2.fly(); 
  }
}
