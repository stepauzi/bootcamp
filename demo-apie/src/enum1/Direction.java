package enum1;

public enum Direction {
  // 4 Direction
  EAST(-1), //
  SOUTH(-2), //
  WEST(1), //
  NORTH(2), //
  ;

  private int value;

  private Direction(int value) {
    this.value = value;
  }

  // values()
  public Direction oppsite() {
    for (Direction d : values()) {
      if (isOppsite(d, this))
        return d;
    }
    return null;
  }

  // static isOppsite()
  public static boolean isOppsite(Direction d1, Direction d2) {
    return d1.getValue() * -1 == d2.getValue();
  }

  public int getValue() {
    return this.value;
  }

  public static Direction valueOf(int value) {
    for (Direction d : values()) {
      if (d.getValue() == value)
        return d;
    }
    return null;
  }
}
