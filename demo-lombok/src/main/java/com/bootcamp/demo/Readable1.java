package com.bootcamp.demo;

public interface Readable1 {
  void read();

  // ! Design Approach
  // Java 8
  default void teach() {
    System.out.println("By deault teach() method.");
  }

  // Java 8
  static int sum(int x, int y) {
    return x + y;
  }
}
