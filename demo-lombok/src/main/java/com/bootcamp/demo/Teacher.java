package com.bootcamp.demo;

// ! Day 2
// Design Approach 1: include teach() method into Readable1 interface
// Design Approach 2: create a new interface Teachable(), let teacher to implement
public class Teacher implements Readable1 {
  @Override
  public void read() {
    System.out.println("Teacher is reading ...");
  }
}
