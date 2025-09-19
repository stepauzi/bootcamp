package com.bootcamp.demo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

// @AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class Student { // Calculation skill
  private String name;
  // private Calculator calculator;
  private MathOperation mathOperation;

  // ! Dependecny Injection (DI)
  public Student(String name, MathOperation mathOperation) {
    if (mathOperation == null)
      throw new IllegalArgumentException("mathOperation cannot be null.");
    this.mathOperation = mathOperation;
    this.name = name;
  }

  // public Student(String name) {
  // this.name = name;
  // this.calculator = new Calculator();
  // }

  // public int sum(int x, int y) {
  // return this.calculator.sum(x, y);
  // }

  // ! Method A: Student.operate() calls Method B: MathOperation.operate()
  // ! For Junit Test (Student.class), to test operate(), the test cases only cover the value add part.
  // ! Junit Framework provides Mock test functions, so that we can assume the result of internal method call.
  public int operate(int x, int y) {
    if (x > y) {
      // ! Day 1
      // return this.mathOperation.operate(x, y) * x;
      // ! Day 2
      return this.mathOperation.operate(x, y + 2) * x;
    } else {
      // ! Day 1
      // return this.mathOperation.operate(x, y) * y;
      // ! Day 2
      return this.mathOperation.operate(x, y + 3) * y;
    }
  }

  // sum, subtract, multiply, divide
  // public int sum(int x, int y) {
  // return x + y;
  // }

  public static void main(String[] args) {
    Student s1 = new Student("John", (x, y) -> x + y);
  }
}
