public class PracticeDay3 {
  public static void main(String[] args) {
    
  //1.
  int[] numbers1 = {12, 7, 5, 20, 33, 18, 25};
  int sum1 = 0;

  for(int i = 0; i < numbers1.length; i++){
      sum1 += numbers1[i];
  } System.out.println("所有元素的 總和" + sum1);

  double average1 = (double) sum1 / numbers1.length;
  System.out.println("平均值" + average1);

  int max1 = numbers1[0];
  int min1 = numbers1[0];
  for(int num1 : numbers1){
    if (max1 < num1){
      max1 = num1;
    }
    if ( min1 > num1){
      min1 = num1;
    }
  } System.out.println("最大值" + max1);
  System.out.println("最小值" + min1);
  
  for(int num2 : numbers1){
    if (num2 > average1){
      System.out.println("大過平均值 嘅所有數字" +num2);
    }
  }

  int maxEvenNum = Integer.MIN_VALUE;
  int maxOddNum = Integer.MIN_VALUE;

  for (int num3 : numbers1){
    if (num3 % 2 == 0){
      if (num3 > maxEvenNum){
        maxEvenNum = num3;
      }
    } else {if (num3 > maxOddNum){
      maxOddNum = num3;
    }}

    }System.out.println("最大偶數" + maxEvenNum);
    System.out.println("最大奇數" + maxOddNum);

  // 2
  String word1 = "JavaBootcamp";
    for(int i = 0; i < word1.length(); i++){
      char c = word1.charAt(i);
      System.out.println("字母="+ c);
    }

    for(int i = 0; i < word1.length(); i++){
      char c = word1.charAt(i);
      if (c >= 'A' && c <= 'Z'){
        System.out.println("大寫字母" + c);
      }
    }

    for(int i = 0; i < word1.length(); i++){
      char c = word1.charAt(i);
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
        System.out.println("元音字母" + c);
      }
    }

    for(int i = word1.length()-1; i >= 0; i--) {
      System.out.println(word1.charAt(i));
    }

    int scoreA = 100;
    if (scoreA >= 90){
      System.out.println("優秀");
    }else if (scoreA >= 60){
      System.out.println("合格");
    } else { System.out.println("不合格");
  }

}
}