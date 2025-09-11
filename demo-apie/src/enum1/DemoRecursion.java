package enum1;

public class DemoRecursion {
  public static void main(String[] args) {
    sum(5, 10);

    // 1 + 2 + 3 + 4 ... 20
    System.out.println(sum(20)); // 210
  }

  public static int sum(int value) { // 10 + 9 + 8 ...
    // ! exit criteria
    if (value == 1)
      return 1;
    // ! call self with pattern
    return value + sum(value - 1);
    // 10 + sum(9)
    // 9 + sum(8)
    // ...
    // 2 + sum(1)
  }

  public static int sum(int x, int y) {
    return x + y;
  }

  // n = 10
  // 10 * 8 * 6 * 4 * 2
  public static int product(int x) {
    if (x < 2)
      return 0;
    return x % 2 == 1 ? product2(x - 1) : product2(x);
  }

  public static int product2(int x) {
    if (x <= 2)
      return 2;
    return x * product2(x - 2);
  }
}
