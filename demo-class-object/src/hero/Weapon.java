package hero;

public abstract class Weapon {
  private int level;

  public Weapon() {
    this.level = 1;
  }

  // read
  public int getLevel() {
    return this.level;
  }

  // write
  public void levelUp() {
    this.level++;
  }

  abstract double getPA();

  abstract double getMA();

  abstract double getCC();

  // VSCode Run -> Java Compile (javac) + Java Run (java)
  public static void main(String[] args) {
    int[][] heroPaMap = new int[3][10];
    int[][] heroMaMap = new int[3][10];
    int[][] heroCcMap = new int[3][10];
    // Warrior
    heroPaMap[0] = new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    // Archer
    heroPaMap[1] = new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    // Mage
    heroPaMap[2] = new int[] {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
  }


}
