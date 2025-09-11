public class DemoException {
  public static void main(String[] args) {
    // int result = methodA("Lucas Chan", "Steven Wong");

    // ! Try to call methodA
    try {
      int result = methodA("Lucas", "Steven Wong"); // You (Method user), 
      System.out.println("result=" + result);
    } catch (RuntimeException e) {
      // ! 1. handle 死因報告, e is the exception object
      // ! 2. Recovery
      System.out.println("The returned exception is well received.");
      System.out.println("The root cause is " + e.getMessage());
    }
    // Happy flow: line 7,8
    // Exception flow: line 7,9,12,13
    System.out.println("The end of program.");
  }

  // ! Method Author need to handle all exception cases (bug)
  // ! Method -> either return or throw
  // ! For "throw", it is throwing an exception object
  public static int methodA(String s1, String s2) { // another author
    if (s1 == null || s2 == null) {
      throw new RuntimeException("s1 and s2 should be not null."); // ! 死因
    }
    // business logic (happy flow)
    if (s1.length() > s2.length()) {
      return methodB(s1);
    } else {
      return methodB(s2);
    }
  }

  public static int methodB(String x) {
    if (x.length() > 3) {
      return "hello".length();
    } else {
      return "goodbye".length();
    }
  }
}
