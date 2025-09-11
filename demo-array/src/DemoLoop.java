import java.util.Arrays;

public class DemoLoop {
  public static void main(String[] args) {
    // John, Peter, Sally
    String[] names = new String[] {"John", "Peter", "Sally"};

    // for loop print
    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }

    // For-each loop
    // ! Syntax: for (variable name : array name)
    for (String name : names) {
      System.out.println(name);
    }

    // char[] a b c i j k
    char[] chs = new char[] {'a', 'b', 'c', 'i', 'j', 'k'};
    // for-each loop
    for (char ch : chs) {
      System.out.println(ch);
    }

    // New String method: toCharArray()
    char[] chs1 = "hello".toCharArray();
    for (char ch : chs1) {
      System.out.println(ch);
    }

    // hello -> olleh
    // i--
    String str = "hello";
    String newStr = "";
    for (int i = str.length() - 1; i >= 0; i--) { // 4 3 2 1 0
      // newStr = newStr + str.charAt(i);
      newStr += str.charAt(i);
    }
    System.out.println(newStr);

    int n = 3;
    int total = 0;
    while (n > 0) { // ! Loop
      total += n;
      n--;
    }
    System.out.println("total=" + total); // 6
    // Step 1: n > 0 ? Yes (n=3)
    // Step 2: total becomes 3
    // Step 3: n--
    // Step 4: n > 0 ? Yes (n=2)
    // Step 5: total becomes 5
    // Step 6: n--
    // Step 7: n > 0 ? Yes (n=1)
    // Step 8: total becomes 6
    // Step 9: n--
    // Step 10: n > 0 ? No (n=0) -> exit loop

    // given int 532 -> 5 + 3 + 2 -> 10
    // Don't convert int to String
    int number = 532;
    // while loop
    // / %
    // 1st 532 -> 53 (2)
    // 2nd 53 -> 5 (3)
    // 3rd 5 -> 0 (5)
    total = 0;
    while (number > 0) {
      total += number % 10;
      number = number / 10;
    }
    System.out.println(total);

    // ! Find Max./ Min.
    int[] arr = new int[] {4, -9, 100, -50, 400, 230};
    int max = arr[0];
    int min = arr[0];
    int sum = 0;
    double average = 0.0;
    for (int x : arr) {
      if (x > max) {
        max = x;
      }
      if (x < min) {
        min = x;
      }
      sum += x;
    }
    average = (double) sum / arr.length; // int / int -> int
    System.out.println(max); // 400
    System.out.println(min); // -50
    System.out.println(sum);
    System.out.println(average);

    // swap
    int a = 10;
    int b = 20;

    // exchange their value ..
    int backup = a;
    a = b;
    b = backup;
    System.out.println(a); // 20
    System.out.println(b); // 10

    // ! 1. Move the head element to the tail.
    // [-9, 100, -50, 400, 230, 4]
    int[] arr2 = new int[] {4, -9, 100, -50, 400, 230};
    for (int i = 0; i < arr2.length - 1; i++) {
      // swap
      backup = arr2[i];
      arr2[i] = arr2[i + 1];
      arr2[i + 1] = backup;
    }
    System.out.println(Arrays.toString(arr2)); // [-9, 100, -50, 400, 230, 4]

    // ! 2. Move Max value to the tail.
    // [x, x, x, x, x, 400]
    for (int i = 0; i < arr2.length - 1; i++) {
      if (arr2[i] > arr2[i + 1]) {
        backup = arr2[i];
        arr2[i] = arr2[i + 1];
        arr2[i + 1] = backup;
      }
    }
    System.out.println(Arrays.toString(arr2));

    // ! 3. Sorting Asc
    // Repeating Moving Max value to the tail.
    // [x, x, x, x, x, 400] , i = 0
    // [x, x, x, x, 230, 400] , i = 1
    // [x, x, x, 100, 230, 400] , i = 2
    // [x, x, 4, 100, 230, 400] , i = 3
    // [-50, -9, 4, 100, 230, 400] , i = 4

    for (int i = 0; i < arr2.length - 1; i++) { // ! ith of time to moving max
      for (int j = 0; j < arr2.length - i - 1; j++) { // ! jth index for moving max value
        if (arr2[j] > arr2[j + 1]) {
          backup = arr2[j];
          arr2[j] = arr2[j + 1];
          arr2[j + 1] = backup;
        }
      }
    }
    System.out.println(Arrays.toString(arr2)); // [-50, -9, 4, 100, 230, 400]

    // ! 4. Put all odd numbers into another array
    int[] arr3 = new int[] {50, 9, 4, 100, 230, 400};
    int oddLength = 0;
    for (int x : arr3) {
      if (x % 2 == 1) {
        oddLength++;
      }
    }
    int[] oddArr = new int[oddLength];
    int idx = 0;
    for (int x : arr3) {
      if (x % 2 == 1) {
        oddArr[idx] = x;
        idx++;
      }
    }
    System.out.println(Arrays.toString(oddArr)); // [9]

    // ! Find the character appeared most of times in a given string.
    // "hello" -> 'l'
    // "abc" -> Not a test case
    String s = "hello";
    // ! Approach 1
    int targetIdx = -1;
    int maxCount = 0;
    for (int i = 0; i < s.length(); i++) {
      int countCh = 0;
      for (int j = 0; j < s.length(); j++) {
        if (s.charAt(i) == s.charAt(j)) {
          countCh++;
        }
      }
      if (countCh > maxCount) {
        maxCount = countCh;
        targetIdx = i;
      }
    }
    System.out.println(s.charAt(targetIdx)); // l

    // ! Approach 2:
    int[] countCh = new int[26];
    for (int i = 0; i < s.length(); i++) {
      countCh[s.charAt(i) - 'a']++;
    }
    int maxCountCh = countCh[0];
    int chIdx = -1;
    for (int i = 0; i < countCh.length; i++) {
      if (countCh[i] > maxCountCh) {
        maxCountCh = countCh[i];
        chIdx = i;
      }
    }
    char chResult = (char) (chIdx + 97);
    System.out.println(chResult);

    // Given 2 strings, assume they are with same length
    String str1 = "abcd";
    String str2 = "pqrs";

    // apbqcrds
    // String + char -> String
    // String + int -> String
    // char + char -> int
    String str3 = "";
    for (int i = 0; i < str1.length(); i++) {
      str3 = str3 + str1.charAt(i) + str2.charAt(i);
      // str3 += str1.charAt(i) + str2.charAt(i);
      // str3 = str3 + (str1.charAt(i) + str2.charAt(i));
    }
    System.out.println(str3);

    int x = 5;
    do {
      System.out.println(x);
      x--;
    } while (x > 0);

    x = 4;
    while (x < 10) {
      if(x % 2 == 1) {
        System.out.println(x);
      }
      x++;
    }
    
    for (int i = 0; i < 10; i++) {
      if (i > 4 && i % 2 == 1) {
        System.out.println(i);
      }
    }

    int h = 0;
    while (h < 6) {
      if (h > 3) {
        break;
      }
      System.out.println(h);
      h++;
    }
  }


}
