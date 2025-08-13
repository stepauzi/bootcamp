import java.time.LocalDate;

public class Furniture {
  private String type;
  private String name;
  private String color;
  private String mainMaterial;
  private Double length;
  private Double width;
  private Double height;
  private Double weight;
  private LocalDate producationDate;

  // Setter
  public void setType(String type){
    this.type = type;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setColor(String color){
    this.color = color;
  }
  public void setMainMaterial(String mainMaterial){
    this.mainMaterial = mainMaterial;
  }
  public void setLength(double length){
    this.length = length;
  }
  public void setWidth(double width){
    this.width = width;
  }
  public void setHeight(double height){
    this.height = height;
  }
  public void setWeight(double weight){
    this.weight = weight;
  }
  public void setProducationDate(LocalDate producationDate){
  this.producationDate = producationDate;
  }

  // Getter
  public String getType(){
    return this.type;
  }
  public String getName(){
    return this.name;
  }
  public String getColor(){
    return this.color;
  }
  public String getMaterial(){
    return this.mainMaterial;
  }
  public Double getLength(){
    return this.length;
  }
  public Double getWidth(){
    return this.width;
  }
  public Double getHeight(){
    return this.height;
  }
  public Double getWeight(){
    return this.weight;
  }
  public LocalDate getProducationDate(){
    return this.producationDate;
  }

 // Main
 public static void main(String[] args) {

Furniture sofa1 = new Furniture();
sofa1.setType("Living Room Furniture");
sofa1.setName("3 seats Sofa");
sofa1.setColor("Blue");
sofa1.setMainMaterial("Leather");
sofa1.setLength(186); //cm
sofa1.setWidth(93); //cm
sofa1.setHeight(88); //cm
sofa1.setWeight(22.76); //kg
sofa1.setProducationDate(LocalDate.of(2025, 8, 1));

Furniture bed1 = new Furniture();
bed1.setType("Bedroom Furniture");
bed1.setName("4 feet Double Bed");
bed1.setColor("White");
bed1.setMainMaterial("Latex");
bed1.setLength(190); //cm
bed1.setWidth(137); //cm
bed1.setHeight(20); //cm
bed1.setWeight(31.7); //kg
bed1.setProducationDate(LocalDate.of(2018, 5, 24));

Furniture table1 = new Furniture();
table1.setType("Dining Room Furniture");
table1.setName("6 seater Dining Table");
table1.setColor("Brown");
table1.setMainMaterial("Wood");
table1.setLength(200); //cm
table1.setWidth(110); //cm
table1.setHeight(75); //cm
table1.setWeight(71); //kg
table1.setProducationDate(LocalDate.of(2023, 1, 22));

Furniture cabinet1 = new Furniture();
cabinet1.setType("Kitchen Furniture");
cabinet1.setName("Base Cabinet");
cabinet1.setColor("White");
cabinet1.setMainMaterial("Plastic");
cabinet1.setLength(80); //cm
cabinet1.setWidth(37); //cm
cabinet1.setHeight(80); //cm
cabinet1.setWeight(12); //kg
cabinet1.setProducationDate(LocalDate.of(2022, 3, 19));

System.out.println(sofa1.getType());
 }
  }
