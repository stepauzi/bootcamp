public class Customer {
  private Order[] orders;
  private double totalPurchasedAmount;

  // get/set
  public void setOrders(Order[] orders){
    this.orders = orders;
  }

  public Order[] getOrders(){
    return this.orders;
  }

  public void setTotalPurchasedAmount (double totalPurchasedAmount){
    this.totalPurchasedAmount = totalPurchasedAmount;
  }
    public double getTotalPurchasedAmount(){
      return this.totalPurchasedAmount;
    }
    
    public boolean isVip(){
      return getTotalPurchasedAmount() > 100000;
    }

    public static void main(String[] args) {

      Customer c1 = new Customer();
      c1.setTotalPurchasedAmount(110000);
      System.out.println(c1.isVip());
    }

  // method presentation -> totalPurchasedAmount()
  // method presentation -> isVIP(), totalPurchasedAmount > 100k
}
