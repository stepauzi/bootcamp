package generic;
import java.util.ArrayList;
import java.util.List;

public class DemoGeneric {
  public static void main(String[] args) {
    // Collection (Java 1/2)
    // Generic (after Java 5) -> List<String>

    // before Java 5
    List objects = new ArrayList();
    objects.add(new Ball(Color.RED, 3));
    objects.add(new Passenger(35));

    for (Object o : objects) {
      if (o instanceof Ball) {
        Ball ball = (Ball) o;
        System.out.println(ball.getColor());
      } else if (o instanceof Passenger) {
        Passenger passenger = (Passenger) o;
        System.out.println(passenger.getAge());
      } 
    }

    // After Java 5
    // ! During compile time, you have to specify the type of object
    List<Ball> balls = new ArrayList<Ball>();
    for (Ball b : balls) {
      System.out.println(b.getColor());
    }
    

  }
}
