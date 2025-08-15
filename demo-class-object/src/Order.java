// ! One to Many

public class Order {
  private item[] items; //array 請用眾數
  private double totalPurchasedAmount;
  private String recipient;
  private String deliveryAddress;

  public void setItems(item[] items){
    this.items = items;
  }

  public item[] getItems(){
    return this.items;
  }
  public void setTotalPurchasedAmount (double totalPurchasedAmount){
    this.totalPurchasedAmount = totalPurchasedAmount;
  }
    public double getTotalPurchasedAmount(){
      return this.totalPurchasedAmount;
    }

    public void setRecipient(String recipient){
      this.recipient = recipient;
    }
    public String getRecipient(){
      return this.recipient;
    }
    public void setDeliveryAddress(String deliveryAddress){
      this.deliveryAddress = deliveryAddress;
    }
    public String getDeliveryAddress(){
      return this.deliveryAddress;
  // set/get

  // method presentation -> total, deliver address
}






public static void main(String[] args) {
  Order o1 = new Order();
  o1.setRecipient("Stephanie");
  System.out.println(o1.getRecipient());
}
}