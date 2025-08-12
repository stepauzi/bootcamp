/**
 * Example Output
 * Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] testCase1 = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] testCase2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] testCase3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] testCase4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240

    // Your program should be able to handle all the above test case.
    // code here ...
    int[] arr = testCase1;
    int firstMax = 0;
    int secondMax = 0;

    if (arr[0] > arr[1]){
      firstMax = arr[0];
      secondMax = arr[1];
    } else {
      firstMax = arr[1];
      secondMax = arr[0];
    }
    for (int i = 0; i < arr.length; i++) {
      int num = arr[i];
      if (num > firstMax){
        secondMax = firstMax;
        firstMax = num;
      } else if (num > secondMax && num < firstMax){
        secondMax = num;
    } else if (num == firstMax) {
        secondMax = firstMax;
  }
      System.out.println(secondMax);
}
}
}