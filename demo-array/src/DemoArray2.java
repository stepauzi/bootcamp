import java.util.Arrays;

public class DemoArray2 {
  public static void main(String[] args) {
    // loop array
    long[] arr = new long[4];
    // ! arr[0] -> long variable
    arr[0] = 10; // upcast/ promotion (int to long)
    arr[1] = 100L;
    arr[2] = -9;
    arr[3] = 0;

    // Loop and print
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    // + 1 to all elements by loop
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] + 1; // ! long value + int value -> long, put long value into long variable
    }
    System.out.println(Arrays.toString(arr)); // [11, 101, -8, 1]

    // 11 + 101 -> 112
    // 101 + -8 -> 93
    // -8 + 1 -> -7
    // 1
    long[] arr2 = new long[4];
    for (int i = 0; i < arr.length; i++) {
      if (i == arr.length - 1) {
        arr2[i] = arr[i];
      } else {
        arr2[i] = arr[i] + arr[i + 1];
      }
    }
    System.out.println(Arrays.toString(arr2));

    // String[]
    String[] names = new String[3];
    names[0] = "Peter";
    names[1] = "Jennie";
    names[2] = "Lucas";
    // how many names contain 'e'
    int counter = 0;
    for (int i = 0; i < names.length; i++) {
      if (names[i].contains("e")) {
        counter++;
      }
    }
    System.out.println(counter);

    // Put String's length into another array
    int[] nameLengths = new int[names.length];
    for (int i = 0; i < names.length; i++) {
      nameLengths[i] = names[i].length();
    }
    System.out.println(Arrays.toString(nameLengths));

    // String -> boolean
    // lelel
    // lellel
    // aeleb
    // aelleb
    // ""
    String word = "lellel"; // lelel -> true, lellel -> true, peter -> false
    boolean isPalindrome = true;
    for (int i = 0; i < word.length(); i++) { // 6 / 2 = 3 (0/1/2), 5 / 2 = 2 (0/1)
      if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
        isPalindrome = false;
        break;
      }
    }
    System.out.println("isPalindrome=" + isPalindrome);

    int x = 10;
    x = x + 1;
    System.out.println(x); // 11

    // declare array
    int[] ages = new int[3];
    ages[0] = 31;
    ages[1] = 9;
    ages[2] = 4;
    System.out.println(Arrays.toString(ages));

    int[] ages2 = new int[] {31, 9, 4}; // ! given you knew all the numbers at the beginning.
    System.out.println(Arrays.toString(ages2));

  }
}
