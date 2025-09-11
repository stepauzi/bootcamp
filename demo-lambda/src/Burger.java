public class Burger {
  private String meat;
  private String cheese;
  // ...
  // ...

  public static Builder builder() {
    return new Builder();
  }

  private Burger(Builder builder) {
    this.meat = builder.meat;
    this.cheese = builder.cheese;
  }

  public String getMeat() {
    return this.meat;
  }

  public String getCheese() {
    return this.cheese;
  }

  // ! Builder Pattern
  public static class Builder {
    private String meat;
    private String cheese;

    public Builder meat(String meat) {
      this.meat = meat;
      return this; // !
    }

    public Builder cheese(String cheese) {
      this.cheese = cheese;
      return this; // !
    }

    public Burger build() {
      return new Burger(this);
    }
  }

  public static void main(String[] args) {
    // new Burger("ABC", "IJK");
    // ! if there are 10 attribates and 8 of them are null, it is hard to assign null/ non-null value
    // new Burger(null, "IJK");
    // new Burger("ABC", null);

    // ! Builder Pattern avoid assigning null value during initial creation
    Burger b1 = Burger.builder() // create Builder Object
        .meat("ABC") //
        .cheese("DEF") //
        .build(); // ! create Burger Object

    Burger b2 = Burger.builder() // create Builder Object
        .meat("ABC") //
        .build();

    Burger b3 = Burger.builder() // create Builder Object
        .cheese("ABC") //
        .build();
  }
}
