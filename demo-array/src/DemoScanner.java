import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // System.out.println("Please input a number:");
    // int number = scanner.nextInt(); // wait for user input
    // System.out.println("The input is " + number);

    // Game:
    // Bomb = 38, random (1-100)
    // User: 50, (1-49)
    // User: 20, (21-49)
    // if user selected number = bomb, exit loop
    int bomb = (int) (Math.random() * 99) + 1;
    int input = -1;
    int max = 100;
    int min = 1;
    while (bomb != input) {
      // ask question: Please select a number between xxx and xxx:
      System.out.println(
          "Please select a number between " + min + " and " + max + ":");
      // collected user input
      input = scanner.nextInt();
      // validate user input, if it is out of range, ask the question again. (continue)
      if (input < min || input > max) {
        continue;
      }
      // revise the range of numbers for next round
      if (input > bomb) {
        max = input - 1;
      } else if (input < bomb) {
        min = input + 1;
      }
    }
    System.out.println("You got the bomb! It is " + bomb);
    scanner.close();
  }
}
