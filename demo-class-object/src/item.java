import java.math.BigDecimal;

public class item {
  private double price;
  private int quantity; // 數量一定係整數, 所以用int 唔用double
  

  public void setPrice(double price){
    this.price = price;
  }
    public double getPrice(){
      return this.price;
    }

  public void setQuanity(int quantity){
    this.quantity = quantity;
  }
  public int getQuanity(){
    return this.quantity;
  }

  public double getSubtotal(){
    return BigDecimal.valueOf(this.price) //
    .multiply(BigDecimal.valueOf(this.quantity)) //
    .doubleValue();
  }

public static void main(String[] args) {

    item chips1 = new item();
    chips1.setPrice(5);
    chips1.setQuanity(10);
    System.out.println(chips1.getSubtotal());

  // set/get

  // methood: presentation -> subtotal
  
}
}
