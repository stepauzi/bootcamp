package method;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Human {
  // height, weight
  private double height;
  private double weight;

  public void setHeight(double height) {
    this.height = height;
  }

  public double getHeight() {
    return this.height;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getWeight() {
    return this.weight;
  }

  // bmi = weight (kg) / height^2 (m)
  public double getBmi() {
    BigDecimal bd = BigDecimal.valueOf(this.height) //
        .multiply(BigDecimal.valueOf(this.height));
    return BigDecimal.valueOf(this.weight) //
        .divide(bd, 2, RoundingMode.HALF_UP) //
        .doubleValue();
  }

  public double getBmi(int scale, RoundingMode roundingMode) {
    BigDecimal bd = BigDecimal.valueOf(this.height) //
        .multiply(BigDecimal.valueOf(this.height));
    return BigDecimal.valueOf(this.weight) //
        .divide(bd, scale, roundingMode) //
        .doubleValue();
  }

  // Method: isOverweight, return boolean, bmi > 30
  public boolean isOverweight() {
    return this.getBmi() > 30;
  }

  public static void main(String[] args) {
    // Human Object
    // 70kg / 1.76m
    // get BMI
    Human h1 = new Human();
    h1.setHeight(1.76);
    h1.setWeight(73.5);
    System.out.println(h1.getBmi()); // 23.73
    System.out.println(h1.getBmi(3, RoundingMode.HALF_UP)); // 23.728

    if (h1.getBmi() > 30) {

    }
    if (h1.isOverweight()) {

    }

  }
}
