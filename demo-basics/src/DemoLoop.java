public class DemoLoop {
  public static void main(String[] args) {
    // if-else (program flow)
    int x = 2;
    x = x * 2; // programming should be able to run this line multiple times
    x = x * 2;
    x = x * 2;
    x = x * 2;
    x = x * 2;
    x = x * 2;
    x = x * 2;
    x = x * 2;
    x = x * 2;
    System.out.println(x);

    // Loop (Programming Tool)
    // ! initializer; condition to continue; modifier
    for (int i = 0; i < 10; i++) {
      System.out.println("hello");
    }

    for (int i = 0; i < 6; i++) {
      System.out.println("abc");
    }
    // Step 1: int i = 0;
    // Step 2: i < 3 ? yes (i = 0)
    // Step 3: print abc
    // Step 4: i++
    // Step 5: i < 3 ? yes (i = 1)
    // Step 6: print abc
    // Step 7: i++
    // Step 8: i < 3 ? yes (i = 2)
    // Step 9: print abc
    // Step 10: i++
    // Step 11: i < 3 ? no (i = 3)
    // ! Conclusion: the above loop executed 11 lines of code.

    // 1. use for loop to print 1 3 5 7 9
    for (int i = 0; i < 10; i++) { // 0-9
      if (i % 2 == 1) {
        System.out.println(i);
      }
    }

    // 2. 2^10 by for loop
    int base = 2;
    int result = base;
    for (int i = 0; i < 9; i++) {
      result *= base;
    }
    System.out.println(result);

    // 3. 1 - 100, print the number which divided by 3 and divided by 10
    for (int i = 1; i < 101; i++) { // 0-100
      if (i % 3 == 0 && i % 10 == 0) {
        System.out.println(i);
      }
    }

    // 4. Given a String
    // 4a) check if this String contains 'l' character (by for loop)
    // 4b) Count the number of l

    String s1 = "hello";
    char targetCh = 'l';

    // ! i -> index
    // boolean isFound = false;
    int counter = 0;
    for (int i = 0; i < s1.length(); i++) { // length()
      if (s1.charAt(i) == targetCh) {
        // isFound = true;
        counter++;
      }
    }
    // if (isFound) {
    if (counter > 0) {
      System.out.println(targetCh + " is found, count=" + counter);
    } else {
      System.out.println(targetCh + " is not found");
    }

    // Searching pattern
    String s2 = "hello";
    String targetStr = "lo";

    // if (targetStr.length() > s2.length())

    boolean isMatched = true;
    boolean isEverMatched = false;
    for (int i = 0; i < s2.length() - targetStr.length() + 1; i++) {
      isMatched = true;
      for (int j = 0; j < targetStr.length(); j++) {
        if (s2.charAt(i + j) != targetStr.charAt(j)) {
          isMatched = false;
        }
      }
      if (isMatched) {
        isEverMatched = true;
      }
    }
    if (isEverMatched) {
      System.err.println("Pattern " + targetStr + " is found.");
    } else {
      System.err.println("Pattern " + targetStr + " is not found.");
    }

    // ! 4. contains() -> Java Method
    System.out.println(s2.contains(targetStr)); // true

    System.out.println("abc".contains("ab")); // true (contains -> 是否包含)
    System.out.println("abc".contains("abc")); // true
    System.out.println("abc".contains("abcd")); // false
    System.out.println("abc".contains("ABC")); // false


    // print 2,4,6,8,10
    // Approach 1:
    for (int i = 1; i < 11; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
        // 1000 lines of code...
      }
    }
    // Approach 2: continue
    for (int i = 1; i < 11; i++) {
      if (i % 2 != 0) {
        continue; // go to next iteration -> i++
      }
      System.out.println(i);
    }

    // break -> searching, exit earlier
    // Search the name contain J character
    String name = "John";
    boolean isFound = false;
    for (int i = 0; i < name.length(); i++) { // 0-3
      System.out.println("Test Flow:" + i);
      if (name.charAt(i) == 'J') {
        isFound = true;
        break; // ! exit the loop
      }
    }
    System.out.println(isFound); // true


  }
}
