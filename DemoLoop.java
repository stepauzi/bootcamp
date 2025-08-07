public class DemoLoop {
  public static void main(String[] args) {
    // if-else (program flow)
    int x = 2;
    x = x * 2; // Programming should be able to run this line multiple times
    System.out.println(x);

    // Loop ( Programming Tool)
    // ! initializer; condition to continue; modifier
    

      // Step 1: int i = 0;
      // Step 2: i < 3? yes
      // Step 3: print abc
      // Step 4: i++
      // Step 5: i < 3 ? yes (i = 1)
      // Step 6: print abc
      // Step 7: i++
      // Step 8: i < 3 ? yes (i = 2)
      // Step 9: print abc
      // Step 10: i++
      // Step 11: i < 3 ? yes (i = 3
      // ! Conclusion: the above loop executed 11 lines of code.

      //3. 1-100, print the number which divided by 3 and divided by 10
      for (int i = 0; i < 100; i++) { //0-100
        if (i % 3 == 0 && i % 10 == 0) {
          System.out.println(i);
        }
      }


      //4a Given a String, check if this String contains 'l' character (by for loop)

      String s1 = "hello";
      char targetCh ='l';


      boolean containsl = false;

      for (int i = 0; i < s1.length(); i++){ //length()
         if (s1.charAt(i) == targetCh) { // if + charAt()
                containsl = true;
        }
      }
      if (containsl){
      System.out.println(targetCh + " is found");
      }
  
      //4b Count the number of 'l'
      int counter = 0;

      for (int i = 0; i < s1.length(); i++){ //length()
         if (s1.charAt(i) == targetCh) { // if + charAt()
              counter++;
        }
      }
      if (counter > 0){
      System.out.println(targetCh + " is found, count= " + counter);
      } else {
        System.out.println(targetCh + " is not found");
      }
    }
  }