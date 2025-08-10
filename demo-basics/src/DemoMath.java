public class DemoMath {
  public static void main(String[] args) {
    int x = 5;
    int y = 9;

    System.out.println(x + y); // 14 (int) -> "14"

    int z = x + y;
    System.out.println(z); // 14
    System.out.println("z=" + z); // z=14

    double a = 0.2;
    double b = 0.4;

    double c = a - b;
    System.out.println(c); // -0.2

    int h = 40;
    int u = 3;

    int result = h * u;
    System.out.println(result); // 120

    // 9 / 3
    result = 9 / 3;
    System.out.println(result); // 3

    // 9 / 2 -> int variable
    result = 9 / 2;
    // Step 1: 9 / 2 (int value / int value -> int value) -> 4
    // Step 2: put 4 (int value) into int type variable
    System.out.println(result); // 4

    // 9 / 2 -> double variable
    double d1 = 9 / 2;
    // Step 1: 9 / 2 (int value / int value -> int value) -> 4
    // Step 2: put 4 (int value) into double type variable -> 4.0
    System.out.println(d1); // 4.0

    // 4.5
    // Approach 1:
    double d2 = 9.0 / 2;
    // Step 1: 9.0 / 2 (double value / int value -> double value) -> 4.5
    // Step 2: put 4.5 (double value) into double type variable -> 4.5
    System.out.println(d2); // 4.5

    double d3 = 9 / 2.0;
    System.out.println(d3); // 4.5
    double d4 = 9.0 / 2.0;
    System.out.println(d4); // 4.5

    // 9.0 / 2.0 -> int variable
    // ! Java: double type is higher than int type
    // ! we cannot assign a higher level type value into a lower level type of variable
    // int i1 = 9.0 / 2.0;

    double d5 = 2; // 2 -> int value, so we can assign int value into double variable
    // auto-convert (auto-upgrade from int to double for the value)
    System.out.println(d5); // 2.0

    // ! Not allow divide zero for all programming languages
    // double d6 = 9 / 0;

    // remainder
    int i2 = 10 / 3;
    System.out.println(i2); // 3

    int i3 = 10 % 3;
    System.out.println(i3); // 1, because 1 is the remainder of 10 / 3

    int i4 = 6 + 8 * 3;
    System.out.println(i4); // 30

    int i5 = (6 + 8) * 3;
    System.out.println(i5); // 42
    
    int i6 = (9 + 7) * ((8 - 3) * 9 - 3);
    System.out.println(i6); // 672
  }
}
