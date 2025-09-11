import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream2 {
  public static class Employee {
    private int id;
    private String department; // IT, HR, MK

    public Employee(int id, String department) {
      this.id = id;
      this.department = department;
    }

    public String getDepartment() {
      return this.department;
    }

    @Override
    public String toString() {
      return "Employee(" //
          + "id=" + this.id //
          + ",department=" + this.department //
          + ")";
    }
  }

  public static void main(String[] args) {
    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee(101, "IT"));
    employees.add(new Employee(102, "MK"));
    employees.add(new Employee(103, "IT"));
    employees.add(new Employee(104, "HR"));
    employees.add(new Employee(105, "HR"));
    employees.add(new Employee(106, "HR"));

    // Group by Department, number of employees
    // ! Group by -> counting, sum(age), max(age), min(age), avg(age)

    Map<String, Long> departmentMap = employees.stream() // Stream<Employee>
        .collect(Collectors.groupingBy( //
            e -> e.getDepartment(), // key
            Collectors.counting() // value
        ));
    System.out.println(departmentMap);

    Map<String, Long> map2 = new HashMap<>();
    for (Employee e : employees) {
      long employeeCount = map2.getOrDefault(e.getDepartment(), 0L) + 1L;
      map2.put(e.getDepartment(), employeeCount);
    }
    System.out.println(map2);

    // ! partitioningBy
    Map<Boolean, List<Employee>> map3 = employees.stream() //
        .collect(Collectors.partitioningBy(e -> "IT".equals(e.getDepartment())
            || "MK".equals(e.getDepartment())));
    System.out.println(map3);

    // List<String> -> Map<String, Integer>
    List<String> fruits = new LinkedList<>();
    fruits.add("apple");
    fruits.add("orange");
    fruits.add("banana");
    Map<String, Integer> fruitMap = fruits.stream() //
        .collect(Collectors.toMap(e -> e, e -> e.length()));
    System.out.println(fruitMap);


    Stream<Integer> integers2 = Stream.of(10, 9, -3, 6);

    // ! stream has already been operated upon or closed
    // once you terminate the stream, you no longer to perform intermediate operation.
    // ! For example, after collect(), the Stream Object has been closed.

    Stream<Integer> integer3 = integers2.filter(e -> e % 2 == 1); // ! error

    // Stream -> filter, map, sort, distinct, collect
    // List -> stream()

    List<Integer> result = integer3.collect(Collectors.toList()); // terminal

    // !
    boolean hasNegativeThree = Stream.of(10, 9, -3, 6).anyMatch(e -> e == -3);
    System.out.println(hasNegativeThree);

    // ! FlatMap
    List<List<String>> namesList = new ArrayList<>();
    List<String> names1 = new ArrayList<>();
    names1.add("John");
    names1.add("Sally");
    List<String> names2 = new ArrayList<>();
    names2.add("Nico");
    names2.add("Jennie");
    namesList.add(names1);
    namesList.add(names2);

    List<String> names = namesList.stream() //
        .flatMap(list -> list.stream()) //
        .collect(Collectors.toList());
    System.out.println(names);

    List<Member> members = new ArrayList<>();
    Member m1 = new Member();
    m1.add("ABC");
    m1.add("DEF");
    Member m2 = new Member();
    m2.add("ABC");
    m2.add("DEF");
    m2.add("DEF");
    members.add(m1);
    members.add(m2);
    // ! Approach 1: flatMap
    List<String> allAddresses = members.stream() //
        .flatMap(m -> m.getAddresses().stream()) //
        .collect(Collectors.toList());
    System.out.println(allAddresses);

    // ! Approach 2: for loop + addAll()
    allAddresses = new ArrayList<>();
    for (Member member : members) {
      allAddresses.addAll(member.getAddresses());
    }
    System.out.println(allAddresses);

    // ! Approach 3: Nested Loop + add()
    allAddresses = new ArrayList<>();
    for (Member member : members) {
      for (String address : member.getAddresses()) {
        allAddresses.add(address);
      }
    }
    System.out.println(allAddresses);
  }

  public static class Member {
    private List<String> addresses;

    public Member() {
      this.addresses = new ArrayList<>();
    }

    public boolean add(String address) {
      return this.addresses.add(address);
    }

    public List<String> getAddresses() {
      return this.addresses;
    }
  }
}
