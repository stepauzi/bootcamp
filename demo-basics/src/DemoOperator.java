public class DemoOperator {
  public static void main(String[] args) {
    // Math Operator: +=, -=, *=, /=
    int x = 3;
    x += 4; // ! same as x = x + 4
    System.out.println(x); // 7

    int y = 9;
    y -= 8; // ! same as y = y - 8
    System.out.println(y); // 1

    int g = 8;
    g *= 4; // ! same as g = g * 4
    System.out.println(g); // 32

    int p = 10;
    p /= 3; // ! same as p = p / 3
    System.out.println(p); // 3

    // + 1
    int u = 1;
    u++;
    System.out.println(u); // 2
    u = u + 1;
    u += 1;
    System.out.println(u); // 4

    // - 1
    int h = 5;
    h--;
    System.out.println(h); // 4
    h = h - 1;
    h -= 1;
    System.out.println(h); // 2

    // Comparsion Operator: >, <, >=, <=, !=, ==
    int age = 70;
    // ! Approach 1:
    boolean isElderly = age > 65;
    // ! Approach 2:
    if (age > 65) {
      isElderly = true;
    }
    char ch = 'A';
    boolean isCharEqualsToA = ch == 65;
    System.out.println(isCharEqualsToA); // true

    char grade = 'R'; // Valid Grades: A, B, C, D, E, F
    // Approach 1: or
    boolean isGradeValid = grade == 'A' || grade == 'B' || grade == 'C'
        || grade == 'D' || grade == 'E' || grade == 'F';
    // Approach 2: if
    isGradeValid = false;
    if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D'
        || grade == 'E' || grade == 'F') {
      isGradeValid = true;
    }
    // Approach 3: ASCII value range check
    isGradeValid = grade >= 'A' && grade <= 'F';
    // ! because we are using comparsion operator (>=, <=, >, <),
    // ! convert char value to int value before comparsion.

    // Odd / Even number
    int n = 23;
    boolean isOdd = n % 2 == 1;
    if (isOdd) {
      System.out.println("hello");
    }
    if (n % 2 == 1) {
      System.out.println("hello");
    }

    int a = 7;
    int b = 4;
    int c = 9;
    int d = 10;
    int max = a;
    if (b > max) {
      max = b;
    }
    if (c > max) {
      max = c;
    }
    if (d > max) {
      max = d;
    }
    System.out.println("max value=" + max); // max value=10


  }
}
