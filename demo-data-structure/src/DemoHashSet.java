import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DemoHashSet {
  public static void main(String[] args) {
    HashSet<String> names = new HashSet<>();
    names.add("John");
    names.add("Leo");
    System.out.println(names.size());
    System.out.println(names.isEmpty());
    System.out.println(names.contains("Leo"));
    System.out.println(names);

    for (String name : names) {
      System.out.println(name);
    }

    // remove Leo
    names.remove("Leo");
    names.remove(new String("John"));
    System.out.println(names.size()); // 0

    // ! HashSet vs ArrayList
    // ! 1. Disallow duplicated
    names.add("Oscar");
    names.add("Jacky");
    names.add("Oscar"); // duplicated
    names.add("oscar");
    System.out.println(names.size()); // 3, because HashSet disallow duplicated object automatically.
    // Reason: HashSet.add() -> object.equals() (String.equals())

    // ! 2. No ordering ("Hash")
    System.out.println(names); // [oscar, Jacky, Oscar]

    // ! Important Point for both ArrayList and HashSet -> Override equals() for Object
    ArrayList<Cat> cats = new ArrayList<>();
    Cat c1 = new Cat("Kelly");
    cats.add(c1);
    cats.add(new Cat("Sue"));
    Cat c3 = new Cat("Kelly");
    cats.add(c3);
    System.out.println(cats.size()); // 3

    cats.remove(new Cat("Kelly")); // Remove Fail, missing equals() in Cat.class
    System.out.println(cats.size()); // 3

    cats.remove(c1);
    cats.remove(c3);
    System.out.println(cats.size()); // 1, it works, because it is calling Object.equals()

    // correct solution: rewrite equals() in Cat.class

    // Question 1a: Remove duplicates by HashSet
    ArrayList<String> emails = new ArrayList<>();
    emails.add("leo123@gmail.com");
    emails.add("lucas234@gmail.com");
    emails.add("leo123@gmail.com");
    HashSet<String> uniqueEmails = new HashSet<>();
    for (String email : emails) {
      uniqueEmails.add(email);
    }
    System.out.println(uniqueEmails); // [lucas234@gmail.com, leo123@gmail.com]

    // Question 1b: Put duplicated emails into another ArrayList
    ArrayList<String> duplicatedEmails = new ArrayList<>();
    HashSet<String> dummySet = new HashSet<>();
    // 1. HashSet add() return true -> not duplicated; return false -> duplicated
    for (String email : emails) {
      if (!dummySet.add(email)) { // ! return false if duplicated
        duplicatedEmails.add(email);
      }
    }
    System.out.println(duplicatedEmails); // [leo123@gmail.com]
    
    // Question 2: Construct a HashMap (at least put 2 entries)
    HashMap<String, ArrayList<Dog>> dogListMap = new HashMap<>();
    ArrayList<Dog> dogs1 = new ArrayList<>();
    ArrayList<Dog> dogs2 = new ArrayList<>();
    dogs1.add(new Dog("John", 1));
    dogs1.add(new Dog("Oscar", 3));
    dogs2.add(new Dog("Alan", 3));
    dogs2.add(new Dog("Mary", 4));
    dogs2.add(new Dog("Kate", 2));
    dogListMap.put("1A", dogs1);
    dogListMap.put("1B", dogs2);

    System.out.println(dogListMap.get("1B"));
    // [Dog(name=Alan,age=3), Dog(name=Mary,age=4), Dog(name=Kate,age=2)]

    System.out.println(dogListMap.get("1C")); // null
    // System.out.println(dogListMap.get("1C").get(0).getName()); // java.lang.NullPointerException

    // Question 3: Convert Cat Array into Cat ArrayList, then print out all Cat Names
    Cat[] catArray = new Cat[] {new Cat("Kelly", 3), new Cat("Oscar", 10)};
    ArrayList<Cat> catList = new ArrayList<>();
    for (Cat cat : catArray) {
      catList.add(cat);
    }
    for (Cat cat : catList) {
      System.out.println(cat.getName());
    }

  }
}
