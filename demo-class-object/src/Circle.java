import java.math.BigDecimal;

// ! Class Author (Circle Class)
// ! Class User (Circle, BigDecimal)

public class Circle {
  
  private double radius;
  // ! We won't add diameter a an attribute in Class Circle
  // because the existing attribute (radius) ca derive the new attribute (diameter).

  // ! Method: Presentation of esisting attributes
  // Getter for radius;
  public double getRadius(){
  return BigDecimal.valueOf(this.radius).doubleValue();
  }

  // Getter for Diamater (no need Setter)
  public double getDiamater(){
    // BigDecimal
  return BigDecimal.valueOf(this.radius).multiply(BigDecimal.TWO).doubleValue();

  }
  // Getter for calculate area (no need Setter)
  public double getArea(){
    return BigDecimal.valueOf(this.radius)//
    .multiply(BigDecimal.valueOf(this.radius))//
    .multiply(BigDecimal.valueOf(Math.PI))//
    .doubleValue();
  }

  // Setter for Radius
  public void setRadius(double radius){
    this.radius = radius;
  }

  public static void main(String[] args) {
    //create circle project
    //set radius 3.3
    //get radius
    //get diameter
    //get area --- radius * radius * PI

    Circle c1 = new Circle();
    c1.setRadius(3.3);
    System.out.println(c1.getRadius());
    System.out.println(c1.getDiamater());
    System.out.println(c1.getArea());

  }
}
