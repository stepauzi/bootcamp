import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
  public static void main(String[] args) {
    String[] names = new String[] {"Alex", "Jessie", "Jennie"};
    for (String name : names) {
      System.out.println(name);
    }

    // ! Disadvantage of array
    // 1. We need to re-create a new array, when additional element is required.
    // 2. Modify element: search element one by one, and then replace it.

    // Solution: ArrayList
    ArrayList<String> emails = new ArrayList<String>();
    // emails = new ArrayList<Integer>();
    // ! ArrayList of String has no relationship with ArrayList of Integer
    // ! ArrayList of Long has no relationship with ArrayList of Integer
    // Long l1 = new Integer(3);
    // ArrayList<Long> numbers = new ArrayList<Integer>();

    // In conclude, the reference type of arraylist must be same as the object type of arraylist.
    // So, after Java5+, Java allows implicitly align reference type and object type for arraylist.
    ArrayList<String> bookNames = new ArrayList<>();
    bookNames.add("ABC");
    bookNames.add("DEF");
    bookNames.add("IJK");
    for (String bookName : bookNames) {
      System.out.println(bookName);
    }
    bookNames.remove(1);
    System.out.println(bookNames); // [ABC, IJK], ArrayList.class -> method: toString()

    // count the number of bookNames starting with "A"
    int count = 0;
    for (String bookName : bookNames) {
      if (bookName.startsWith("A"))
        count++;
    }
    System.out.println(count);

    // ! ArrayList is in order, because the underlying data structure is an array.
    bookNames.add("MNO"); // MNO will be the last element.
    System.out.println(bookNames); // [ABC, IJK, MNO]
    bookNames.addFirst("OPQ"); // OPQ will be the first element.
    System.out.println(bookNames); // [OPQ, ABC, IJK, MNO]
    bookNames.addLast("JJJ"); // same as add()
    System.out.println(bookNames); // [OPQ, ABC, IJK, MNO, JJJ]

    System.out.println(bookNames.contains("JJJ"));
    System.out.println(bookNames.isEmpty()); // true
    // bookNames = null; // Null Pointer, not same as Empty
    System.out.println(bookNames.size()); // same as array length
    bookNames.set(1, "BCD");
    System.out.println(bookNames); // [OPQ, BCD, IJK, MNO, JJJ]
    System.out.println(bookNames.get(2)); // IJK, get the third item

    bookNames.clear();
    System.out.println(bookNames.size()); // 0
    System.out.println(bookNames); // []

    // ! Basic ArrayList methods: add, remove, isEmpty, size, contains, get, set
    
    // ! We cannot put primitive into ArrayList.
    // ArrayList<int>
    ArrayList<Integer> integers = new ArrayList<>(); // That's why we need Wrapper Class

    // ArrayList<Cat>
    // loop cat.getName()
    ArrayList<Cat> cats = new ArrayList<>();
    Cat c1 = new Cat("John");
    cats.add(c1);
    c1.setName("Peter");
    cats.add(new Cat("Leo"));

    for (Cat cat : cats) {
      System.out.println(cat.getName()); // Peter and Leo
    }

    // ! Interface: List
    // ! Polymorphism: List is an interface of ArrayList, List<X> is also the interface of ArrayList<X>
    // ArrayList<Long> has no relationship with ArrayList<Integer>
    List<String> names2 = new ArrayList<>();
    names2.add("John");
    names2.add("Sue");
    
  }
}
