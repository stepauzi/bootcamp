import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    double result = 0.1 + 0.2;
    System.out.println(result); // 0.30000000000000004
    if (result == 3.0) {
      System.out.println("Result=3.0");
    } else {
      System.out.println("Result!=3.0");
    }

    // Solution: BigDecimal
    BigDecimal bd1 = new BigDecimal("0.1");
    BigDecimal bd2 = new BigDecimal("0.2");
    BigDecimal bd3 = bd1.add(bd2);
    System.out.println(bd3.doubleValue()); // 0.3

    BigDecimal bd4 = BigDecimal.valueOf(0.1);
    BigDecimal bd5 = BigDecimal.valueOf(0.2);
    BigDecimal bd6 = bd4.add(bd5);
    System.out.println(bd6.doubleValue()); // 0.3

    // + add()
    // - subtract()
    System.out.println(0.3 - 0.1); // 0.19999999999999998
    System.out.println(BigDecimal.valueOf(0.3).subtract(BigDecimal.valueOf(0.1))
        .doubleValue()); // 0.2

    // * multiply()
    System.out.println(0.1 * 0.2); // 0.020000000000000004
    System.out.println(bd4.multiply(bd5).doubleValue()); // 0.02

    // / divide(), non-terminating decimal, rounding
    System.out.println(0.3 / 0.1); // 2.9999999999999996
    System.out.println(BigDecimal.valueOf(0.3).divide(BigDecimal.valueOf(0.1))); // 3

    // 10 / 3
    // HALF_UP -> 0.5 or above, round up
    // HALF_DOWN -> 0.5 or below, round down
    System.out.println(BigDecimal.valueOf(10).divide(BigDecimal.valueOf(3), 2,
        RoundingMode.HALF_UP)); // 3.33

  }
}
