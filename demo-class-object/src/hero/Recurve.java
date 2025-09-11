package hero;

public class Recurve extends Bow {

  @Override
  public double getPA() {
    return Bows.PHY_ATTACK[0][super.getLevel() - 1];
  }

  @Override
  public double getMA() {
    return Bows.MAG_ATTACK[0][super.getLevel() - 1];
  }

  @Override
  public double getCC() {
    return 1.0;
  }

  public static void main(String[] args) {
    Hero hero = new Archer();
    // setWeapon() -> Hero
    // setBow() -> Archer
    // which design is better?
  }
}
