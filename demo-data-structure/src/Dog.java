import java.util.Objects;

public class Dog {
  private String name;
  private int age;

  public Dog(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public void setName(String name) {
    this.name = name;
  }

  // hashCode and equals()
  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.age);
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Dog)) return false;
    Dog dog = (Dog) o;
    return Objects.equals(this.name, dog.getName())
      && Objects.equals(this.age, dog.getAge());
  }

  @Override
  public String toString() {
    return "Dog(" //
        + "name=" + this.name //
        + ",age=" + this.age //
        + ")";
  }
}
