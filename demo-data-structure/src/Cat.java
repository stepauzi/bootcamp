public class Cat {
  private String name;
  private int age;

  public Cat(String name) {
    this.name = name;
  }

  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String toString() {
    return "Cat(" //
        + "name=" + this.name //
        + ",age=" + this.age //
        + ")";
  }
}
