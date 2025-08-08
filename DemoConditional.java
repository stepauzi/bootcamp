public class DemoConditional {
  public static void main(String[] args) {
    // if else -> control program flow
    int x = 10;
    if (x > 12) {
      System.out.println("hello");
    } else { // x <= 12
      System.out.println("goodbye");
    }

    // declare y
    // declare counter
    // check if double value y > 999.5, counter +1, otherwise, counter + 2
    // print out counter
    double y = 1000;
    int counter = 0;
    if (y > 999.5) {
      counter = counter + 1; //
    } else {
      counter = counter + 2;
    }
    System.out.println(counter); // 1

    // and or
    int a = 10;
    int b = 90;

    // ! && and
    if (a > 5 && b > 80) {
      System.out.println("do something..."); // print
    } else {
      System.out.println("do something else...");
    }

    // ! || or
    // && > ||
    // a > 9 && b > 90 -> true && false -> false
    // b % 2 == 0 -> true
    // finally: false || true -> true
    if (a > 9 && b > 90 || b % 2 == 0) {
      System.out.println("correct"); // print
    } else {
      System.out.println("incorrect");
    }

    // char gender = 'F';
    // char smoker = 'Y';
    int age = 66;
    boolean isMale = false;
    boolean isSmoker = true;
    double premium = 100.0;

    // Conditions:
    // 1) Female -> 10% extra premium
    // 2) Smoker -> 15% extra premium
    // 3) Age > 50 and Male -> 8% extra premium

    // Female + Smoker -> 25%
    // Female + non-Smoker -> 10%
    // Male + 50 + Smoker -> 15%
    // Male + 51 + Smoker -> 23%
    // Male + 50 + non-Smoker -> 0%
    // Male + 51 + non-Smoker -> 8%

    // Program: run time? readability? development time?

    double extraPremPct = 0.0;
    if (isMale) { // ! same as "if (isMale == true)"
      if (age > 50) {
        // extraPremPct = extraPremPct + 8.0;
        extraPremPct += 8.0;
      }
    } else { // Female
      extraPremPct += 10.0;
    }
    if (isSmoker) {
      extraPremPct += 15.0;
    }
    premium = premium * (100 + extraPremPct) / 100.0;
    System.out.println(premium);

    // leap year
    // divided by 4 -> Leap Year (i.e. 2024)
    // divided by 100 -> Not a leap year (i.e. 2100, 1900)
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
