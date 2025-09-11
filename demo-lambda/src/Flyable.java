public interface Flyable {
  void fly();
  // ! Traditionally, we create a class to create an object with fly() method

  public static void main(String[] args) {
    // anonymous class
    Flyable superman = new Flyable() {
      @Override
      public void fly() {
        System.out.println("Superman is flying ...");
      }
    };

    superman.fly();

    Flyable superwoman = new Flyable() {
      @Override
      public void fly() {
        System.out.println("Superwoman is flying ...");
      }
    };

    superwoman.fly();

    superman = new Bird();
    superman.fly(); // Bird is flying ...
  }
}
