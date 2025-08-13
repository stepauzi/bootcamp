//! Java: Object Oriented Programming (OOP), C++, C#, etc
//! OOP = 物件導向語言
//! class = 形容物件
// Blueprint 藍圖
// 我地要描述既世界既Person, 佢地淨係得Name & Age
// ! (Wrong Concept in Java)因為Person特徵太少(Name & Age ONLY), 尼個世界既Person好易重覆Name & Age
// ! (Correct) 因為我覺得/我想形容既世界既Person, Name & Age 係唔會重覆, 我先會咁Design個 class
// Example -- ID證明
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;

public class Person {
  // Attribute () 
  private int age;
  private String name;
  private LocalDate dob;

  // Setter - age
  //! pl.setAge(17), put 17 into "this object (p1)
  public void setAge(int age){
    this.age = age;  // this = this object
  }

  // Getter - age
  public int getAge() {
    return this.age;
  }

 // Setter - name
 public void setName(String name){
     this.name = name;
 }

 // Getter - name
 public String getName() {
    return this.name;
}

 // Setter - dob
 public void setDob(LocalDate dob){
    this.dob = dob;
 }

 // Getter - dob
 public LocalDate getDob() {
    return this.dob;
 }

  public static void main(String[] args) {
    // "new" -> create object
    // "Person" -> class name
    // "()" -> constructor

    //! "p1" -> this is a name for you to call object in memory
    Person p1 = new Person();
    BigDecimal bd1 = new BigDecimal("3.4");
    // Person p2 = new BigDecimal(7.3);

    new Person(); // create an person object in memory, but without a name for later use

    Person p3 = new Person();
    p1.setName("Stephanie");
    p1.setDob(LocalDate.of(2000, 1, 1));
    int ageP1 = Period.between(p1.getDob(), LocalDate.now()).getYears();
    p1.setAge(ageP1); // . = goes to object

    p3.setName("Boris");
    p3.setDob(LocalDate.of(1999, 1, 13));
    int ageP3 = Period.between(p3.getDob(), LocalDate.now()).getYears();
    p3.setAge(ageP3);

    System.out.println(p1.getName());
    System.out.println(p1.getAge());
    System.out.println(p1.getDob());

    System.out.println(p3.getName());
    System.out.println(p3.getAge());
    System.out.println(p3.getDob());

    }
  }
