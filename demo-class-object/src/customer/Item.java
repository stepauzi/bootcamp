package customer;
import java.math.BigDecimal;

public class Item {
  private double price;
  private int quantity;

  // ! Constructor
  // ! By default, Java Class contains empty constructor (implicitly exists)

  // Constructor
  // 1. Constructor has NO return type
  // 2. Class Name
  public Item() { // ! empty contructor: No input parameter
    
  }

  // set/get
  public void setPrice(double price) {
    this.price = price;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  // method: presentation
  // -> subtotal
  public double subtotal() {
    return BigDecimal.valueOf(this.price) //
        .multiply(BigDecimal.valueOf(this.quantity)) //
        .doubleValue();
  }

  public static void main(String[] args) {
    // ! "new" is calling constructor "Item()"
    Item i1 = new Item();
  }
}
