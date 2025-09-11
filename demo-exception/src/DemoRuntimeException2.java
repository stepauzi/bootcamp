public class DemoRuntimeException2 {
  public static void main(String[] args) {
    double average = 0;
    try {
      int count = 0;
      int total = 100;
      average = total / count;
      System.out.println(average);
    } catch (ArithmeticException e) {
      average = -1;
    }

    int count2 = 0;
    int total2 = 100;
    double average2 = 0;
    if (count2 != 0) {
      average2 = total2 / count2;
    } else {
      average2 = -1;
    }
    System.out.println(average2);
  }
}
