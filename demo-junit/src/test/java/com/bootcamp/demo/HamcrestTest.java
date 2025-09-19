package com.bootcamp.demo;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


// ! TestFile = Test Environment
public class HamcrestTest {
  // ! Test List
  @Test
  void testCalculator(){
    String actualResult = "hello";
    // ! Junit 5
    assertEquals("hello", actualResult);
    // ! Hamcrest
    assertThat(actualResult, is(equalTo("hello")));

    Calculator c1 = new Calculator();
    assertThat(c1.sum(10, 4), is(equalTo(14)));
  }
}
