package generic;
// ! ClassName<T> -> attribute/ instance method's T

public class Bag<T> {
  private T value;

  public Bag(T value) {
    this.value = value;
  }

  // T (not yet defined) is similar to Object (already defined)
  public T getValue() {
    return this.value;
  }

  public static void main(String[] args) {
    // ! During compile time, we have to define T.
    // ! Generic Class -> reduce number of classes in the system.
    Bag<String> bag = new Bag<>("hello");
    Bag<Ball> bag2 = new Bag<>(new Ball(Color.BLUE, 3));

    StringBag bag3 = new StringBag();
    BallBag bag4 = new BallBag();


    // ! Bag attribute Object vs Bag<T>
    Bag<Object> magicBag = new Bag<>(new Passenger(23));
    Bag<String> stringBag = new Bag<>("hello");
    Bag<Ball> ballBag = new Bag<>(new Ball(Color.BLUE, 3));

    Bag2 magicBag2 = new Bag2(new Passenger(23));
  }
}
