package hero;

public abstract class Hero {
  private static int idCounter = 0;

  // state/ attribute
  private int id;
  private int level;
  private int hp;
  private int mp;
  private double exp;

  public Hero(int maxHp, int maxMp) {
    this.id = ++idCounter;
    this.level = 1;
    this.hp = maxHp;
    this.mp = maxMp;
    this.exp = 0.0;
  }

  public void levelUp(int maxHp, int maxMp) {
    this.level++;
    this.hp = maxHp;
    this.mp = maxMp;
    this.exp = 0.0;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public void setMp(int mp) {
    this.mp = mp;
  }

  public void setExp(double exp) {
    this.exp = exp;
  }

  public void deductHp(int deductedHp) {
    this.hp = Math.max(this.hp - deductedHp, 0);
    // if (this.hp >= deductedHp) {
    // this.hp = this.hp - deductedHp;
    // } else {
    // this.hp = 0;
    // }
  }

  // Circle radius
  public int getLevel() {
    return this.level;
  }

  public double getExp() {
    return this.exp;
  }

  public int getHp() {
    return this.hp;
  }

  public int getMp() {
    return this.mp;
  }

  public boolean isAlive() {
    return this.hp > 0;
  }

  public int getMaxHp() {
    return Heros.getMaxHp(Heros.getRole(this), this.level);
  }

  public int getId() {
    return this.id;
  }

  public boolean equals(Hero hero) {
    return this.id == hero.getId();
  }
}
