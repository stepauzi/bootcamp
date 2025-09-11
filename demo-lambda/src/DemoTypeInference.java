import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class DemoTypeInference {
  // ! Can't DO
  // private var age;

  // ! Can't DO
  // public static var getLength(String x) {
  // return x.length();
  // }

  // ! Can't DO
  // public static int getLength(var x) {
  // return x.length();
  // }

  public static void main(String[] args) {
    // ! Java 10
    int x = 3;
    var y = 4;
    // Java is Strong & Static
    // ! Static -> compile time -> confirm variable type.

    // y = "hello";

    Map<String, Integer> map = new HashMap<>();
    map.put("John", 18);
    map.put("Mary", 23);
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + "," + entry.getValue());
    }

    for (var entry : map.entrySet()) {
      System.out.println(entry.getKey() + "," + entry.getValue());
    }

    var bird = new Bird();
    var arr = new int[] {1, 2, 3};
    // ! Can't DO
    // var n;
    // var n = null;

    // Lambda -> confirm which Interface
    // var sortByDesc = (i1, i2) -> i1 > i2 ? -1 : 1;
    Comparator<Integer> sortByDesc = (i1, i2) -> i1 > i2 ? -1 : 1;
  }
}
