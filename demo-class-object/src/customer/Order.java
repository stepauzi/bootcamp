package customer;
// ! One to Many

import java.math.BigDecimal;
import java.util.Arrays;

public class Order {
  private Item[] items;

  public Order() {
    // ! initial load of creating object
    this.items = new Item[0];
  }

  // set/get
  public void setItems(Item[] items) {
    this.items = items;
  }

  // public Item[] getItems() {
  //   return this.items;
  // }

  public double[] subtotals() {
    double[] subtotals = new double[this.items.length];
    for (int i = 0; i < items.length; i++) {
      subtotals[i] = this.items[i].subtotal();
    }
    return subtotals;
  }

  public void add(Item newItem) {
    // ! Create a new array
    Item[] items = new Item[this.items.length + 1];
    // ! Copy the elements in this.items to new array items
    for (int i = 0; i < this.items.length; i++) {
      items[i] = this.items[i];
    }
    // ! Add the new item to the tail of array
    items[items.length - 1] = newItem;
    // ! replace the new array to the object array address
    this.items = items;
  }

  // method presentation
  // -> total
  public double total() {
    BigDecimal sum = BigDecimal.ZERO;
    for (Item item : this.items) {
      // ! BigDecimal add() -> new BigDecimal Object
      sum = sum.add(BigDecimal.valueOf(item.subtotal()));
    }
    return sum.doubleValue();
  }

  public static void main(String[] args) {
    Item item1 = new Item();
    item1.setPrice(73.3);
    item1.setQuantity(2);

    Item item2 = new Item();
    item2.setPrice(99.9);
    item2.setQuantity(3);

    Item item3 = new Item();
    item3.setPrice(100.0);
    item3.setQuantity(1);

    Order order1 = new Order();
    order1.add(item1);
    order1.add(item2);
    order1.add(item3);

    System.out.println(Arrays.toString(order1.subtotals())); // [146.6, 299.7, 100.0]
    System.out.println(order1.total()); // 546.3

    Order order2 = new Order();
    System.out.println(order2.total()); // 0.0
    System.out.println(Arrays.toString(order2.subtotals())); // []

    // the below logic is to calculate the total of items
    for (int i = 0; i < order1.subtotals().length; i++) {

    }

    // System.out.println(order1.getItems()[0].subtotal());
    // System.out.println(order1.getItems()[1].subtotal());
    // System.out.println(order1.getItems()[2].subtotal());
  }
}
