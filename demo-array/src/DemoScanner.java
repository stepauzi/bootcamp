import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Game
    // Bomb = 38, random (1-100)
    // User: 50, (1-49)
    // User: 20, (21-49)
    // if user selected number = bomb, exit loop

    // ask question: Please select a number between xxx and xxx:
    // collected user input
    // validate user input, if it is out of range, ask the question again. (continue)
    // revise the range numbers for next round

    int bomb = (int)(Math.random() * 99) + 1; // Bomb Number
    int input = 0;
    int max = 100;
    int min = 1;
    while (bomb != input) {
      System.out.print("Please select a number between " + min + " and " + max + " : " );
    input = scanner.nextInt();
      if (input < min || input > max ) {
        continue;
      }
      if (input > bomb ){
        max = input - 1;
      } else if (input < bomb){
        min = input + 1;
      }
    }
      System.out.println("You got the bomb! It is " + bomb);
    scanner.close();
    }
    }
