import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.Stack;

public class PracticeDay5 {

public static void main(String[] args) {
  int[] scores = {12, 55, 78, 30, 90, 65};

// 1a. 打印每個分數
for (int s : scores){
  System.out.println(s);
}
// 1b. 找出最大值、最小值
int maxScore = scores[0];
int minScore = scores[0];

for (int s : scores ){
  if( s > maxScore ){
    maxScore = s;
  }
  if( s < minScore ){
    minScore = s;
  }
} System.out.println(maxScore);
System.out.println(minScore);

// 1c. 計算總和與平均
int sum = 0;
for (int s : scores ){
  sum += s;
}   System.out.println(sum);

// 1d. 打印大於平均值的分數
double average = (double) sum / scores.length;
for (int s : scores ){
  if ( s > average){
    System.out.println("大於平均值的分數" + s);
  }
}

String word = "JavaBootcamp";

// 2a. 打印每個字母
   for(int i = 0; i < word.length(); i++){
      char c = word.charAt(i);
      System.out.println(c);}

// 2b. 打印大寫字母

    for(int i = 0; i < word.length(); i++){
      char c = word.charAt(i);
      if (c >= 'A' && c <= 'Z'){
        System.out.println("大寫字母" + c);
      }
    }

// 2c. 打印元音字母
    for(int i = 0; i < word.length(); i++){
      char c = word.charAt(i);
      if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
        System.out.println("元音字母" + c);
      } 
    }  

// 計算 10.05 + 0.95，輸出正確結果
  BigDecimal a = new BigDecimal("10.05");
  BigDecimal b = new BigDecimal("0.95");
  System.out.println(a.add(b));

// 比較 1.2 與 1.20 是否相等
  BigDecimal c = new BigDecimal("1.2");
  BigDecimal d = new BigDecimal("1.20");
  System.out.println(c.compareTo(d) == 0);

  // 取得今天日期
    LocalDate today = LocalDate.now();
    System.out.println(today);
// 打印今年是哪一年
    System.out.println(today.getYear());
// 打印今天星期幾
    System.out.println(today.getDayOfWeek());

//用 Scanner 讀入一個數字 (1–7)
//用 switch 判斷輸入，對應星期
//default case 打印「輸入錯誤」
    Scanner scanner = new Scanner(System.in);

    int day = scanner.nextInt();

    switch(day){
      case 1: System.out.println("Monday");
            break;
      case 2: System.out.println("Tuesday");
            break;
      case 3: System.out.println("Wednesday");
            break;
      case 4: System.out.println("Thursday");
            break;
      case 5: System.out.println("Friday");
            break;
      case 6: System.out.println("Saturday");
            break;
      case 7: System.out.println("Sunday");
            break;
      default: System.out.println("輸入錯誤");
            break;
    }
    scanner.close();

    int[] nums = {4, 15, 23, 8, 42, 7};
    for(int n : nums){
      System.out.println(n);
    }

    int maxNum = nums[0];
    int minNum = nums[0];
    int sumNum = 0;

    for(int n : nums){
      if( n > maxNum){
        maxNum = n;
      }
       if( n < minNum){
        minNum = n;
      }
      sumNum += n;
    }
    System.out.println("最大值=" + maxNum + "& 最小值=" + minNum);
     System.out.println(sumNum);

      double averageNum = (double) sumNum / nums.length;
      for ( int n : nums){
      if( n > averageNum){
        System.out.println("大過平均值=" + n);
      }
    }

    for (int i = 0; i< word.length(); i++){
    char n = word.charAt(i);
    System.out.println(n);
    }

    for (int i = 0; i< word.length(); i++){
      char n = word.charAt(i);
      if( n >= 'A' && n <= 'Z'){
         System.out.println("大寫字母" + n);
      }
    }

    for (int i = 0; i < word.length(); i++){
      char n = word.charAt(i);
      if( n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u'){
        System.out.println("元音字母" + n);
      }
    }

    BigDecimal o = new BigDecimal("12.35");
    BigDecimal p = new BigDecimal("3.65");
    System.out.println(o.add(p));

    LocalDate todayDate = LocalDate.now();
    System.out.println(todayDate);
    System.out.println(todayDate.getYear());
    System.out.println(todayDate.getDayOfWeek());


    int[] nums3 = {5, 10, 15, 20, 25};
    Stack<Integer> stack = new Stack<>();
    for (int n : nums3){
      stack.push(n);
    }

    while(! stack.isEmpty()){
      System.out.println(stack.pop());
    }
}
}
