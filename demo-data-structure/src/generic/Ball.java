package generic;
import java.util.PriorityQueue;
import java.util.Queue;

public class Ball implements Comparable<Ball> {
  private Color color;
  private int value;

  public Ball(Color color, int value) {
    this.color = color;
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  public Color getColor() {
    return this.color;
  }

  // Question 1: BLUE -> RED -> YELLOW
  // Question 2: YELLOW -> RED -> BLUE
  // Question 3: RED -> YELLOW -> BLUE.
  // If they are with same color, order by value in descending.
  // ! this:-1, that:1
  @Override
  public int compareTo(Ball ball) {
    if (this.color == ball.getColor()) {
      if (this.value > ball.getValue())
        return -1;
      else
        return 1;
    }
    if (this.color == Color.RED)
      return -1;
    if (ball.getColor() == Color.RED)
      return 1;
    if (this.color == Color.YELLOW)
      return -1;
    if (ball.getColor() == Color.YELLOW)
      return 1;
    return -1; // -1 or 1
  }

  @Override
  public String toString() {
    return "Ball(" //
        + "color=" + this.color //
        + ",value=" + this.value //
        + ")";
  }

  public static void main(String[] args) {
    // ordering: BLUE -> RED -> YELLOW
    Queue<Ball> q1 = new PriorityQueue<>();
    q1.add(new Ball(Color.RED, 12));
    q1.add(new Ball(Color.YELLOW, 13));
    q1.add(new Ball(Color.RED, 1));
    q1.add(new Ball(Color.BLUE, 100));

    while (!q1.isEmpty()) {
      System.out.println(q1.poll());
    }
  }
}
