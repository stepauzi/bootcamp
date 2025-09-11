package abstraction;

// Class name "implements" Interface name
// ! Interface control the child class method availability at compile time
public class Superman extends Human implements Flyable {

  public Superman(String name) {
    super(name); // "super" call Parent Constructor
  }

  // equals, hashCode, toString ...
  @Override
  public void fly() {
    System.out.println("Superman " + super.getName() + " is flying");
  }

  @Override
  public void eat() {
    System.out.println("Superman " + super.getName() + " is eating");
  }

  public static void main(String[] args) {
    Superman s1 = new Superman("John");
    s1.fly();
    s1.eat();
    Superman s2 = new Superman("Lucas");
    s2.fly();
    s2.eat();

    // Polymorphism
    // ! "Hide" Superman Object "Skill"
    Flyable superman = new Superman("Leo");
    superman.fly();
    // System.out.println(superman.getName());
    // superman.eat(); // Compile-time Polymorphism, checking type of object.
    // ! superman object has eat()? Yes

    // ! "Unhide" Superman Object all skills
    Superman superman2 = (Superman) superman;
    System.err.println(superman2.getName()); // Leo

    Human superman3 = new Superman("Steven");
    System.out.println(superman3.getName());
    superman3.eat();

    
    Eatable[] humans = new Eatable[3];
    humans[0] = new Student("Jennie");
    humans[1] = new Superman("Kelly");
    humans[2] = new Student("Alden");
    for (Eatable human : humans) {
      human.eat();
    }

  }
}
