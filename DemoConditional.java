public class DemoConditional {
  public static void main(String[] args) {
    // if else -> control program flow
    int x = 10;
    if (x > 12){
      System.out.println("hello");
    }else { // x <= 12
      System.out.println("goodbye");
    }
  // declare y = 0;
  // declare counter
  // check if double value > 999.5, counter +1, otherwise, counter + 2
  // print out counter
      double y = 1000;
      double counter = 0;
      if (y > 999.5){
      counter = counter + 1;
      }else {
      counter = counter + 2;
      }
      System.out.println(counter);

      // and or
      int a = 10;
      int b = 90;

      // ! && and
      if (a > 5 && b > 80) {
      System.out.println("do something...");
      }else {
        System.out.println("do somehhing else..");
      }

      // ! || or
      // && > ||
      // a > 9 && b > 90 -> true && false -> false
      // b % 2 == 0 -> true
      // finally: false || true -> false
      if (a > 9 && b > 90 || b % 2 == 0) {
        System.out.println("correct");
      }else {
        System.out.println("Incorrect");
      }

      int age = 66; 
      // char gender = 'F';
      // char smoker = 'Y';
      boolean isMale = false;
      boolean isSmoker = true;
      double premium = 100.0;

      // Conditions:
      // 1) Female -> 10% extra premium
      // 2) Smoker -> 15% extra premium
      // 3) Age > 50 and Male -> 8% extra premium

      // Female + Smoker -> 25%
      // Female + non-smoker -> 10%
      // Male + 50 + Smoker -> 15%
      // Male + 51 + Smoker -> 23%
      // Male + 50 + non-smoker -> 0%
      // Male + 51 + non-smoker -> 8% 

      // Program: run fast? readability? development time?
    

      double extraPremPct = 0.0;
      if (isMale) { // ! same as "if (isMale == true)"
        if (age > 50) {
          // extraPremPct = extraPremPct + 8.0; 
          extraPremPct += 8.0;
        }
      } else { //Female
        // extraPremPct = extraPremPct + 10.0;
        extraPremPct += 10.0;
      }
      if (isSmoker) {
        // extraPremPct = extraPremPct + 15.0;
        extraPremPct += 15.0;
      }
      premium = premium * ( 100 + extraPremPct) / 100.0;
      System.out.println(premium);


    }
}