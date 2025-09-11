package method;
import java.time.LocalDate;

public class Animal {
  // Attribute
  private LocalDate dob;

  // Method -> input (optional) -> output (optional)
  // ! void -> No return type
  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  // ! Method Return type: LocalDate
  public LocalDate getDob() {
    return this.dob;
  }

  public static void main(String[] args) {
    // Person object
    Person p1 = new Person();
    p1.setAge(30);
    System.out.println(p1.getAge()); // 30
    
    // Animal object
    Animal vincent = new Animal();
    vincent.setDob(LocalDate.of(2020, 10, 9));
    LocalDate vincentDob = vincent.getDob();
    System.out.println(vincentDob); // 2020-10-09

    vincent.setDob(LocalDate.of(2021, 11, 2));
    System.out.println(vincent.getDob()); //
    System.out.println(vincentDob); //

    Animal lucas = new Animal();
    lucas.setDob(LocalDate.of(2021, 11, 2));
    System.out.println(lucas.getDob());

    lucas = vincent;
    lucas.setDob(LocalDate.of(2024, 12, 31));
    System.out.println(vincent.getDob()); // 2024-12-31
    System.out.println(lucas.getDob()); // 2024-12-31
  }

}
