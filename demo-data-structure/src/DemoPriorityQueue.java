import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {
  public static void main(String[] args) {
    // Queue
    // Deque<String> names = new PriorityQueue();
    Queue<String> names = new PriorityQueue<>();
    names.add("John");
    names.add("Steven");
    names.add("Lucas");
    names.add("Vincent");
    names.add("Cathy");

    // ! the ordering algorithm does not happen in add() method.
    System.out.println(names); // [Cathy, John, Lucas, Vincent, Steven]

    // ! Priority Queue poll elements in given ordering.
    // ! By default natural ordering (compareTo())
    System.out.println(names.poll()); // Cathy
    System.out.println(names.poll()); // John

    names.add("Alex");
    System.out.println(names.poll()); // Alex
    System.out.println(names.poll()); // Lucas

    // add() or poll() -> ordering?
    // ordering -> nlogn

    // PQ -> Integer
    // 100, -80, 800, 799, 20
    Queue<Integer> integers = new PriorityQueue<>();
    integers.add(100);
    integers.add(-80);
    integers.add(800);
    integers.add(799);
    integers.add(20);

    System.out.println(integers); // [-80, 20, 800, 799, 100]
    
    while (!integers.isEmpty()) {
      System.out.println(integers.poll());
    }
  }
}
