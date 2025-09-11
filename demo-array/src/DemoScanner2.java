import java.util.Scanner;

public class DemoScanner2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int bomb = (int) (Math.random() * 99) + 1;
    int input = -1;
    int max = 100;
    int min = 1;
    do {
      System.out.println(
          "Please select a number between " + min + " and " + max + ":");
      input = scanner.nextInt();
      if (input < min || input > max) {
        continue;
      }
      if (input > bomb) {
        max = input - 1;
      } else if (input < bomb) {
        min = input + 1;
      }
    } while (bomb != input);
    System.out.println("You got the bomb! It is " + bomb);
    scanner.close();
  }
}
