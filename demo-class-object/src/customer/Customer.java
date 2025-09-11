package customer;
// HKTVMALL

import java.math.BigDecimal;

// ! One to Many
public class Customer {
  // ! 
  private Order[] orders;
  private int age;

  // ! constructor
  public Customer() {
    this.orders = new Order[0];
  }

  // get/set

  public void add(Order newOrder) {
    Order[] orders = new Order[this.orders.length + 1];
    for (int i = 0; i < this.orders.length; i++) {
      orders[i] = this.orders[i];
    }
    orders[orders.length - 1] = newOrder;
    this.orders = orders;
  }

  // method presentation
  // -> totalPurchasedAmount()
  public double totalPurchasedAmount() {
    BigDecimal sum = BigDecimal.ONE;
    for (Order order : this.orders) {
      sum = sum.add(BigDecimal.valueOf(order.total()));
    }
    return sum.doubleValue();
  }

  // method presentation
  // -> isVip(), totalPurchasedAmount > 100,000
  public boolean isVip() {
    return this.totalPurchasedAmount() > 100_000;
  }

  public static void main(String[] args) {
    // Customer A, OrderA & B
    // Customer B, OrderC

    // and with some items...

    // Customer A -> isVip -> true
    // Customer B -> isVip -> false
  }
}
