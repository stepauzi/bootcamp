import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DemoStack {
  public static void main(String[] args) {

    Stack<String> names = new Stack<>();
    names.push("John");
    names.push("Steven");
    names.push("Leo");

    System.out.println(names.size());
    System.out.println(names.contains("Steven"));
    System.out.println(names.peek()); // Leo

    while (!names.isEmpty()) {
      System.out.println(names.pop());
    }

    List<String> emails = new Stack<>();
    emails.add("abc@gmail.com");
    emails.add("ijk@gmail.com");
    emails.add("xyz@gmail.com");

    // emails.pop();
    // emails.push();
    System.out.println(emails.getFirst());
    System.out.println(emails.getLast());
    System.out.println(emails.get(2)); // xyz@gmail.com


  }
}
