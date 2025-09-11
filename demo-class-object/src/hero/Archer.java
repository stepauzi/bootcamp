package hero;

public class Archer extends Hero {
  private static final int MY_ROLE = Heros.ARCHER;

  private Bow bow; // Recurve/ Guinsoo

  // Archer Object has Hero Object inside
  public Archer() {
    super(Heros.MAX_HP[MY_ROLE][0], Heros.MAX_HP[MY_ROLE][0]); // Hero empty constructor
  }

  public void setBow(Bow bow) {
    this.bow = bow;
  }

  public boolean isEquipped() {
    return this.bow != null;
  }

  public void levelUp() {
    super.levelUp(Heros.MAX_HP[MY_ROLE][super.getLevel()],
        Heros.MAX_MP[MY_ROLE][super.getLevel()]);
  }

  public void recoverHp() {
    super.setHp(Heros.MAX_HP[MY_ROLE][super.getLevel() - 1]);
  }

  public void recoverMp() {
    super.setHp(Heros.MAX_MP[MY_ROLE][super.getLevel() - 1]);
  }

  public void attack(Hero target) {
    Heros.attack(this, //
        target, //
        Heros.MAX_HP[MY_ROLE][super.getLevel()], //
        Heros.MAX_MP[MY_ROLE][super.getLevel()], //
        this.getPa(), //
        this.getPd());
  }

  public int getPa() {
    return Heros.PHY_ATTACK[MY_ROLE][super.getLevel() - 1];
  }

  public int getPd() {
    return Heros.PHY_DEFENSE[MY_ROLE][super.getLevel() - 1];
  }

  public static void main(String[] args) {
    Archer archer = new Archer();
    Warrior warrior = new Warrior();
    archer.attack(warrior);
  }
}
