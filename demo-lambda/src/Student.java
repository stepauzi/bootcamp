public class Student {
  private int age;

  public Student(int age) {
    this.age = age;
  }

  // ! Outer Class cannot read inner class attribute,
  // ! but inner class can read outer class attribute.
  // public String collegeInfo() {
  // return "College name=" + name;
  // }

  public int sum(int x, int y) {
    // ! Method Local Inner Class
    class Calculator {
      private int x;
      private int y;

      Calculator(int x, int y) {
        this.x = x;
        this.y = y;
      }

      public int sum() {
        return this.x + this.y;
      }
    }
    return new Calculator(x, y).sum();
  }

  public class College {
    private String name;

    public College(String name) {
      this.name = name;
    }

    public String studentInfo() {
      return "Student age=" + age //
          + ", College name=" + name;
    }
  }
}
