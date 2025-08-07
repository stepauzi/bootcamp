public class DemoOperator {
  public static void main(String[] args) {
    // Math Operator +=, -=, *=, /=
    int x = 3;
    x += 4; // x = x + 4
    System.out.println(x); // 7

    int y = 9;
    y -= 8; // y = y - 8
    System.out.println(y); // 1

    int z = 10;
    z *= 7; // z = z * 7
    System.out.println(z); // 70

    int a1 = 4;
    a1 /= 2; // a1 = a1 / 2
    System.out.println(a1); // 2


    // + 1
    int u = 1;
    u++; 
    System.out.println(u); //2
    u = u + 1;
    u += 1;
    System.out.println(u); //4

    // - 1
    int h = 5;
    h--;
    System.out.println(h); //4
    h = h - 1;
    h -= 1;
    System.out.print(h); //2

    // Comparsion Operator >, <, >=, <=, !=, ==
    // ! Approach 1
    int age = 70; 
    boolean isElderly = age > 65;
    // ! Approach 2
    if ( age > 65) {
      isElderly = true;
    }
    char ch = 'a';
    boolean isCharEqualsToA = ch == 65;
    System.out.println(isCharEqualsToA); //True

    char grade = 'R'; // Valid Grades: A,B,C,D,E,F
    // ! Approach 1 or
    boolean isGradeValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'E' || grade == 'F';
    // ! Approach 2 if
    isGradeValid = false;
    if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'E' || grade == 'F') {
      isGradeValid = true;
    }
    // ! Approach 3 ASCII value range check
    isGradeValid = grade >= 'A' && grade <= 'F';
    // ! because we are using comparsion operator (>=, <=, >, <,)
    // ! convert char value to int value before comparsion

    // Odd / Even number
    int number = 23;
    boolean isodd = number % 2 == 1;
    if (isodd) {
      System.out.println("hello");

      int a = 7;
      int b = 4;
      int c = 9;
      int d = 10;
      int max = a;
      if ( a > b) {
        max = a;
      }
      if ( c > max) {
        max = c;
      }
      if (d > max) {
        max = d;
      }
      System.out.println("max value=" + max); // max value=10
    }
      // leap year
      // divided by 4 -> Leap Year
      // divided by 100 -> not a leap year (i.e. 2100, 1900)
      // divided by 400 -> Leap Year (i.e. 2000)
      // Cannot divided by 4 -> Not a leap year (i.e. 2025)

      int year = 2000;
      boolean isLeapYear = false;
      if (year % 4 == 0) {
        if (year % 100 == 0) {
          if (year % 400 == 0) {
            isLeapYear = true;
          } else { 
            isLeapYear = false;
          }
        } else { // 2024
          isLeapYear = true;
          }
        } else {
          isLeapYear = false;
        }
        System.out.println("Leap Year? " + isLeapYear);

        isLeapYear = year % 4 == 0
        && (year % 100 == 0 && year % 400 == 0 || year % 100 != 0);
        System.out.println("Leap Year? " + isLeapYear);
        }
      }