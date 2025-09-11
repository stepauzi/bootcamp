import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemoLinkedList {

  public static void main(String[] args) {
    // Lucas -> Leo -> Sue -> Jennie -> Mary
    Person p1 = new Person("Lucas", new Person("Leo",
        new Person("Sue", new Person("Jennie", new Person("Mary", null)))));

    System.out.println(p1.getPerson().getPerson().getPerson().getName()); // Jennie

    // Use loop to count the number of persons
    Person head = p1;
    int counter = 0;
    while (head != null) {
      head = head.getPerson();
      counter++;
    }
    System.out.println(counter);
    System.out.println(head); // null

    LinkedList<Person2> persons = new LinkedList<>();
    persons.add(new Person2("Lucas"));
    persons.add(new Person2("Leo"));
    persons.add(new Person2("Sue"));
    persons.add(new Person2("Jennie"));
    persons.add(new Person2("Mary"));
    System.out.println(persons);
    System.out.println(persons.get(2).getName()); // Sue
    System.out.println(persons.size()); // 5

    // List
    List<Person2> personList = new LinkedList<>();
    personList.add(new Person2("Lucas"));
    personList.add(new Person2("Mary"));

    System.out.println(getFirstPerson(personList).getName()); // Lucas

    // Shape -> Circle/Square
    List<Shape> shapes = new LinkedList<>();
    shapes.add(new Circle(3.2));
    shapes.add(new Square(2.5));
    shapes.add(new Circle(6.1));
    System.out.println(totalArea(shapes)); // 155.31857141283567

    // ! Queue / Deque
    // ! Queue MUST be First in First Out (FIFO)
    Queue<String> names = new ArrayDeque<>(); // ! LinkedList or ArrayDeque
    names.add("John");
    names.add("Leo");
    names.add("Lucas");
    System.out.println(names); // [John, Leo, Lucas]
    System.out.println(names.poll()); // John
    System.out.println(names); // [Leo, Lucas]
    System.out.println(names.size()); // 2
    System.out.println(names.isEmpty()); // false

    // Queue is not for loop
    for (String name : names) {
      System.out.println(name);
    }

    // Queue is for comsume
    while (!names.isEmpty()) {
      System.out.println(names.poll());
    }
    // names.remove(); // similar to poll(), remove head

    // ! Deque can FILO, FIFO, etc
    Deque<String> nameDeque = new LinkedList<>(); // ! ArrayDeque or LinkedList
    nameDeque.add("Vincent");
    nameDeque.add("Steven");
    nameDeque.add("Tracy"); // add to Tail
    nameDeque.addFirst("Kelly");
    nameDeque.addLast("Tommy");
    System.out.println(nameDeque); // [Kelly, Vincent, Steven, Tracy, Tommy]
    nameDeque.poll(); // remove head
    System.out.println(nameDeque); // [Vincent, Steven, Tracy, Tommy]
    nameDeque.pollLast();
    System.out.println(nameDeque); // [Vincent, Steven, Tracy]

    System.out.println(nameDeque.peek()); // Vincent, lookup or get head
    System.out.println(nameDeque.peekLast()); // Tracy, lookup or get tail

    while (!nameDeque.isEmpty()) {
      System.out.println(nameDeque.poll());
    }
  }

  // get the head of list, if not found, return null
  public static Person2 getFirstPerson(List<Person2> persons) {
    if (persons == null || persons.size() == 0)
      return null;
    return persons.get(0);
  }

  // static method: List<Shape> -> calculate total area
  public static double totalArea(Collection<Shape> shapes) {
    BigDecimal total = BigDecimal.ZERO;
    for (Shape shape : shapes) {
      total = total.add(BigDecimal.valueOf(shape.area()));
    }
    return total.doubleValue();
  }
}
