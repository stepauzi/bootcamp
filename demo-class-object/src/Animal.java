import java.time.LocalDate;

public class Animal { // 說明書
  private LocalDate dob;

  public void setDob(LocalDate dob) {
    this.dob = dob;
}
  public LocalDate getDob() {
    return this.dob;
  }

  public static void main(String[] args){ // Main
    // Person Object
    // Animal Object

    Animal vincent = new Animal();
    vincent.setDob(LocalDate.of(2020, 10, 9));
    LocalDate vincentDob = vincent.getDob();
    System.out.println(vincentDob);

    vincent.setDob(LocalDate.of(2021, 11, 2));
    System.out.println(vincent.getDob()); // updated
    System.out.println(vincentDob); // ! will not update, keep same

    Animal lucas = new Animal();
    lucas.setDob(LocalDate.of(2021, 11, 2));
    System.out.println(lucas.getDob());

    lucas = vincent; // Lucas's Data -> AGC (Auto Garbage Collection)
    // ! Vincent's all data will give to Lucas, no more Lucas' Data
    lucas.setDob(LocalDate.of(2024, 12, 31));
    System.out.println(vincent.getDob());
    System.out.println(lucas.getDob());
  }
}