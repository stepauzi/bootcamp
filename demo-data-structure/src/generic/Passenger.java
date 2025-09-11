package generic;
import java.util.PriorityQueue;
import java.util.Queue;

public class Passenger implements Comparable<Passenger> {
  private int age;

  public Passenger(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public boolean isElderly() {
    return this.age > 65;
  }

  // -1 -> 我(this)
  // Question 1: order by age in descending
  // Question 2: Elderly age > 65
  public int compareTo(Passenger passenger) {
    // return this.age > passenger.getAge() ? -1 : 1;
    if (this.isElderly()) {
      if (passenger.isElderly()) {
        if (this.age < passenger.getAge())
          return -1;
        else
          return 1;
      } else {
        return -1;
      }
    } else { // !this.isElderly
      if (passenger.isElderly()) {
        return 1;
      } else {
        if (this.age < passenger.getAge())
          return -1;
        else
          return 1;
      }
    }
  }

  @Override
  public String toString() {
    return "Passenger(" //
        + "age=" + this.age //
        + ")";
  }

  public static void main(String[] args) {
    Queue<Passenger> pq = new PriorityQueue<>(); // compareTo() from Comparable<T>
    pq.add(new Passenger(4));
    pq.add(new Passenger(66));
    pq.add(new Passenger(78));
    pq.add(new Passenger(18));
    System.out.println(pq.poll()); // 66
    System.out.println(pq.poll()); // 78
    pq.add(new Passenger(69));
    pq.add(new Passenger(68));
    System.out.println(pq.poll()); // 68
  }
}
