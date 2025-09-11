import java.math.BigDecimal;
import java.util.Stack;

public class PracticeDay4 {

  public static void main(String[] args) {
    
  
  //Task 1
  int score = 90;

  if (score >= 90){
    System.out.println("優秀");
  }
  else if (score >= 60){
    System.out.println("合格");
  } else {
    System.out.println("不合格");
  }

  //Task 2
  int[] nums = {1,2,3,4,5};
  Stack<Integer> stack = new Stack<>();
  for (int n : nums) {
    stack.push(n);
  } System.out.println("Stack 現在內容:" + stack);

  System.out.println("反轉輸出:");
  while (!stack.isEmpty()) {
    System.out.println(stack.pop());
  }

  //Task 3
  Stack<String> fruit = new Stack<>();
  fruit.push("Apple");
  fruit.push("Banana");
  fruit.push("Cherry");
  System.out.println(fruit.pop());
  System.out.println(fruit);

  Stack<Integer> numIntegers = new Stack<>();
  numIntegers.push(5);
  numIntegers.push(10);
  numIntegers.push(15);
  System.out.println(numIntegers.peek());
  System.out.println(numIntegers);

  Stack<Integer> orgIntegers = new Stack<>();
  for (int n : nums){
    orgIntegers.push(n);
  }
  String revint = "";
  while (!orgIntegers.isEmpty()) {
    revint += orgIntegers.pop();
  }
  System.out.println(revint);

  Stack<Double> doubles = new Stack<>();
  System.out.println(doubles.isEmpty());
  doubles.push(2.2);
  System.out.println(doubles.isEmpty());

  int day = 1;
  switch (day){
    case 1: System.out.println("Mon");
    break;
    case 2: System.out.println("Tue");
    break;
    case 3: System.out.println("Wed");
    break;
    case 4: System.out.println("Thu");
    break;
    case 5: System.out.println("Fri");
    break;
    case 6: System.out.println("Sat");
    break;
    case 7: System.out.println("Sun");
    break;
    default: System.out.println("Invalid Day");
    break;
  }

    int[] numbers1 = {12, 5, 8, 19, 21, 4};

    int max = numbers1[0];
    int min = numbers1[0];
    int sum = 0;

    for (int n : numbers1){
      if ( n > max){
        max = n; 
      } else if ( n < min){
        min = n;
      }
      }

    for (int n : numbers1){
      sum += n;
    } double average1 = (double) sum / numbers1.length;

    for (int n : numbers1){
      if ( n > average1){
        System.out.println(n);
      }
    }

    for (int n : numbers1){
      if (n % 2 == 1){
        System.out.println(n);
      }
    }
   for (int n : numbers1){
    if ( n % 2 == 0){
      System.out.println(n);
    }
   }

   String a = "HelloJava";

   for (int i = 0; i < a.length(); i++){
    char c = a.charAt(i);
    System.out.println(c);
    if (c >= 'A' && c <= 'Z'){
      System.out.println(c);
    }
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
      System.out.println(c);
    }
   }
      BigDecimal d = new BigDecimal("10.05");
      BigDecimal e = new BigDecimal("0.95");

      BigDecimal sum1 = d.add(e);
      System.out.println(sum1);

      BigDecimal f = new BigDecimal("1.2");
      BigDecimal g = new BigDecimal("1.20");
      System.out.println(f.equals(g));

   }

    }