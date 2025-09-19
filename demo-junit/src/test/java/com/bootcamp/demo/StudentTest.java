package com.bootcamp.demo;


import static org.junit.jupiter.api.Assertions.assertEquals;
// ! static import: copy all static method from Mockito into StudentTest class.
// After static import, you no longer need to use static Mockito call.
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

// Student depends on Calculator
@ExtendWith(MockitoExtension.class) // !
public class StudentTest {
  @Mock
  private MathOperation mathOperation;

  @InjectMocks
  private Student student;

  // ! assertEquals: usually for raw types only
  
  public static void main(String[] args) {
    StudentTest st = new StudentTest();
    // ... prepare environment objects (Student and MathOperation)
    //....
    // Execute Test
    st.testStudentOperate();
    st.testStudentOperate2();
    
  }
  @Test
  void testStudentOperate() {
    // Student s1 = new Student("John", mathOperation);

    // Assumption
    when(mathOperation.operate(2, 6)).thenReturn(10);
    // Start Testing
    int actualResult = student.operate(2, 3);
    assertEquals(30, actualResult); // ! object -> equals()
    verify(mathOperation, times(1)).operate(2, 6);
  }

  @Test
  void testStudentOperate2() {
    // Student s1 = new Student("John", mathOperation);
    // Assumption
    when(mathOperation.operate(8, 5)).thenReturn(60);
    // Start Testing
    int actualResult = student.operate(8, 3);
    assertEquals(480, actualResult);
    verify(mathOperation, times(1)).operate(8, 5);
  }

}
