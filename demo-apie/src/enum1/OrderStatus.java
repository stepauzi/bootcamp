package enum1;

// ! Finite number of values
// ! Not Change often
public enum OrderStatus {
  PAID(1), PREPARING(2), DELIVERING(3), DELIVERED(4);

  private int value;

  // ! enum constructor -> private
  private OrderStatus(int value) {
    this.value = value;
  }
  // ! JVM -> create enum object for you.
  // ! And you cannot create enum object by constructor

  public int getValue() {
    return this.value;
  }

  public OrderStatus next() {
    return OrderStatus.valueOf(this.value + 1);
  }

  // ! OrderStatus.values() -> return all enum values
  public static OrderStatus valueOf(int value) {
    for (OrderStatus o : OrderStatus.values()) {
      if (o.getValue() == value)
        return o;
    }
    return null;
  }

  public static void main(String[] args) {
    for (OrderStatus o : OrderStatus.values()) {
      System.out.println(o);
    }
  }
}
