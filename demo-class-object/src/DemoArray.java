import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {
    String[] arr = new String[] {"John", "Peter", "Lucas"};
    String[] newArr = Arrays.copyOf(arr, arr.length);
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(newArr));

    arr[1] = "Vincent";
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(newArr));

    // Sorting
    int[] ages = new int[] {65, 40, 18, 35, 70};
    Arrays.sort(ages);
    System.out.println(Arrays.toString(ages)); // [18, 35, 40, 65, 70]

    "hello".length();

    // Types: 8 Primitives + String + 8 Wrapper Class

    sum(1, 2); // auto-convert to sum(1.0, 2.0)
    int max = Integer1.MAX_VALUE;
    System.out.println(max); // 2147483647
    System.out.println(Week.NO_OF_DAYS); // 7
  }

  public static double sum(double x, double y) {
    return x + y; // BigDecimal
  }
}
