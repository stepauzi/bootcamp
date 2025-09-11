import java.util.Objects;

public class Stephanie {

private int age;
private String address;

/* ------------------------------- Constructor ------------------------------ */
  public Stephanie(int age, String address) {
    this.age = age;
    this.address = address;
  }

/* --------------------------------- Getter --------------------------------- */

  public int getAge() {
    return this.age;
  }

  public String getAddress(){
    return this.address;
  }

/* --------------------------------- Setter --------------------------------- */
 
  public void setAge(int age) {
    this.age = age;
  }

  public void setAddress(String address){
    this.address = address;
  }

   /* --------------------------------- Equals --------------------------------- */
 // Method Signature = method name + parameters
  // for Override, rule = method signature + return type
  @Override
  public boolean equals(Object o) {
    // Step 1:
    if (this == o)
      return true;
    // Step 2: if obj is not an Cat object, return false
    // ! instanceof = asking if obj is an object of Cat
    if (!(o instanceof Stephanie))
      return false;
    // Step 3: Because obj MUST be a cat object.
    Stephanie stephanie = (Stephanie) o;
    return Objects.equals(this.getAge(), stephanie.getAge()) //
    && Objects.equals(this.getAddress(), stephanie.getAddress()); //
  }

  @Override
  public String toString(){
    return "Stephanie(" //
    + ", age = " + this.age //
    + ", address = " + this.address //
    + ")";
  }

  @Override // ! Override -> checking if your parent class has this method.
  public int hashCode(){ // Must -- hashCode
    return Objects.hash(this.age, this.address);
  }

  /* ------------------------------ Create Method ----------------------------- */
  /* ------------------------ please input before Main ------------------------ */
  public static int square(int input){
    return input * input;
  }

  public static void print(String name){  //! 沒有計算 所以用void
    System.out.println(name);
  }

/* ---------------------------------- Main ---------------------------------- */
public static void main(String[] args) {

  /* --------------------------------- Forloop -------------------------------- */
  int[] diceCounter = new int[6]; // ! Array
  int NUM_ROLLLS = 100;
  int number = (int)(Math.random() * 5.9999999);

  for(int i = 0; i < NUM_ROLLLS; i++){

    diceCounter[number]++;  
  }
  System.out.println(diceCounter[0]);


  /* --------------------------- Demo Square Method --------------------------- */
  int a = 6;
  System.out.println("Square's area:" + square(a));
  /* ---------------------------- Demo print Method --------------------------- */
  print("hello");


  /* -------------------- 1. 使用 for 迴圈計算 1 到 100 之間所有偶數的和。 -------------------- */
int totalSum = 0;

  for (int i = 0; i < 100; i++){
    if (i % 2 == 0){
      totalSum += i;
    }
  } System.out.println(totalSum);

}
  }

