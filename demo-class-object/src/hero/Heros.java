package hero;

import java.math.BigDecimal;

// ! final class -> cannot be extended

// ! level, role
public final class Heros {
  public static final int WARRIOR = 0;
  public static final int ARCHER = 1;
  public static final int MAGE = 2;

  public static final int[][] MAX_HP =
      new int[][] {{20, 40, 60, 80, 100, 120, 140, 160, 180, 200},
          {20, 40, 60, 80, 100, 120, 140, 160, 180, 200},
          {20, 40, 60, 80, 100, 120, 140, 160, 180, 200}};

  public static final int[][] MAX_MP =
      new int[][] {{20, 40, 60, 80, 100, 120, 140, 160, 180, 200},
          {20, 40, 60, 80, 100, 120, 140, 160, 180, 200},
          {20, 40, 60, 80, 100, 120, 140, 160, 180, 200}};

  public static final int[][] PHY_ATTACK =
      new int[][] {{10, 15, 20, 25, 30, 35, 40, 45, 50, 55},
          {10, 15, 20, 25, 30, 35, 40, 45, 50, 55},
          {10, 15, 20, 25, 30, 35, 40, 45, 50, 55}};

  public static final int[][] PHY_DEFENSE =
      new int[][] {{3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, //
          {3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, //
          {3, 4, 5, 6, 7, 8, 9, 10, 11, 12}};

  public static final int[][] MAG_ATTACK =
      new int[][] {{10, 15, 20, 25, 30, 35, 40, 45, 50, 55},
          {10, 15, 20, 25, 30, 35, 40, 45, 50, 55},
          {10, 15, 20, 25, 30, 35, 40, 45, 50, 55}};

  public static final int[][] MAG_DEFENSE =
      new int[][] {{3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, //
          {3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, //
          {3, 4, 5, 6, 7, 8, 9, 10, 11, 12}};

  public static final double[][] CRITICAL_CHANCE =
      new double[][] {{2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0}, //
          {2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0}, //
          {2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 11.0}};

  public static final int[][] CRITICAL_DAMAGE =
      new int[][] {{10, 15, 20, 25, 30, 35, 40, 45, 50, 55},
          {10, 15, 20, 25, 30, 35, 40, 45, 50, 55},
          {10, 15, 20, 25, 30, 35, 40, 45, 50, 55}};

  public static final double[][] MAX_EXP =
      new double[][] {{3.0, 5.0, 7.0, 9.0, 11.0, 13.0, 15.0, 17.0, 19.0, 21.0},
          {3.0, 5.0, 7.0, 9.0, 11.0, 13.0, 15.0, 17.0, 19.0, 21.0},
          {3.0, 5.0, 7.0, 9.0, 11.0, 13.0, 15.0, 17.0, 19.0, 21.0}};

  public static final double[][] EXP_GAINED =
      new double[][] {{1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0, 5.5},
          {1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0, 5.5},
          {1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0, 5.5}};

  public static int getMaxHp(int role, int level) {
    if (level < 1 || level > Heros.MAX_HP.length)
      return -1;
    return Heros.MAX_HP[role][level - 1];
  }

  public static double calcAddedExp(int role, int killedHeroLevel) {
    return Heros.EXP_GAINED[role][killedHeroLevel - 1];
  }

  public static int getRole(Hero hero) {
    int role = -1;
    if (hero instanceof Warrior) {
      role = 0;
    } else if (hero instanceof Archer) {
      role = 1;
    } else if (hero instanceof Mage) {
      role = 2;
    }
    return role;
  }

  public static void attack(Hero self, Hero target, int maxHp, int maxMp,
      int selfPa, int targetPd) {
    int deductedHp = Math.max(selfPa - targetPd, 0);
    target.deductHp(deductedHp);
    if (!target.isAlive()) {
      double addedExp =
          Heros.calcAddedExp(Heros.getRole(target), target.getLevel());
      self.setExp(BigDecimal.valueOf(self.getExp()) //
          .add(BigDecimal.valueOf(addedExp))//
          .doubleValue());
      if (self.getExp() >= Heros.MAX_EXP[Heros.getRole(self)][self.getLevel()
          - 1]) {
        self.levelUp(maxHp, maxMp);
      }
    }
  }
}
