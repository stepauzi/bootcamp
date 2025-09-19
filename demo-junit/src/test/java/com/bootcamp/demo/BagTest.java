package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import com.bootcamp.demo.Bag.Ball;

public class BagTest {
  
  @Test
  void testBagCreation(){
    Bag b1 = new Bag();
    assertEquals(0, b1.getBalls().size());
  }

  @Test
  void testAdd(){
    Bag b1 = new Bag();
    b1.add(Ball.ofBlue());
    b1.add(Ball.ofYellow());
    assertEquals(2, b1.getBalls().size());

    //! Hamcrest
    assertThat(b1.getBalls(), not(hasItem(Ball.ofRed())));
    assertThat(b1.getBalls(),hasSize(2));

    //! Contains (with Order)
    assertThat(b1.getBalls() , not(contains(Ball.ofYellow(), Ball.ofBlue())));


  }
}
