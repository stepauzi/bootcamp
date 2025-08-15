import java.math.BigDecimal;
import java.math.RoundingMode;

public class Human {
 // height, weight
 // bmi =  weight (kg) / height^2 (m)

  private double height;
  private double weight;

  public void setHeight(double height){
    this.height = height;
  }
    public void setWeight(double weight){
    this.weight = weight;
  }

  public double getHeight(){
    return this.height;
  }
  public double getWeight(){
    return this.weight;
  }
  public double getBmi(){
    BigDecimal bd = BigDecimal.valueOf(this.height) //
    .multiply(BigDecimal.valueOf(this.height));
    return BigDecimal.valueOf(this.weight) //
    .divide(bd, 2, RoundingMode.HALF_UP) //
    .doubleValue();}

    public double getBmi(int scale, RoundingMode roundingMode){
    BigDecimal bd = BigDecimal.valueOf(this.height) //
    .multiply(BigDecimal.valueOf(this.height));
    return BigDecimal.valueOf(this.weight) //
    .divide(bd, scale, roundingMode) //
    .doubleValue();
  }
    public boolean isOverHeight(){
      return getBmi() > 30;
    }

  public static void main(String[] args) {
  
// Method: isOveweight, return boolean, bmi > 30
// Human Object
// 73.5kg / 1.76m
// get BMI
 Human h1 = new Human();
 h1.setHeight(1.76);
 h1.setWeight(73.5);
  System.out.println(h1.getBmi());
  System.out.println(h1.isOverHeight());

}
  }
