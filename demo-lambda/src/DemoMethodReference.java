import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class DemoMethodReference {
  public static void main(String[] args) {
    // Java 8
    // ! Example 1
    List<String> names = new ArrayList<>();
    names.add("John");
    names.add("Alex");
    names.add("Sally");
    names.forEach(e -> System.out.println(e)); // ! lambda

    // Consumer by lambda
    // e -> System.out.println(e)

    // Consumer by method reference
    names.forEach(System.out::println);

    // ! Example 2
    String name = "John";
    Supplier<Integer> nameLength = () -> name.length();
    Supplier<Integer> nameLength2 = name::length;
    System.out.println(nameLength.get());
    System.out.println(nameLength2.get());

    Supplier<Bird> birdSupplier = () -> new Bird();
    Supplier<Bird> birdSupplier2 = Bird::new;
    Bird bird1 = birdSupplier.get();
    Bird bird2 = birdSupplier2.get();

    // ! Example 3
    Comparator<Integer> sortByDesc = (i1, i2) -> i2.compareTo(i1);
    // ! For this case, method reference can handle ascending ordering logic ONLY.
    Comparator<Integer> sortByAsc = Integer::compareTo; //

    List<Integer> integers = Arrays.asList(9, -2, 100, -50);
    Collections.sort(integers, sortByDesc);
    System.out.println(integers); // [100, 9, -2, -50]
    Collections.sort(integers, sortByAsc);
    System.out.println(integers); // [-50, -2, 9, 100]

    // ! Example 4 (Static method)
    Function<String, Integer> converisonHelper = s -> Integer.valueOf(s);
    System.out.println(converisonHelper.apply("123")); // 123

    Function<String, Integer> converisonHelper2 = Integer::valueOf;
    System.out.println(converisonHelper2.apply("123")); // 123


  }
}
