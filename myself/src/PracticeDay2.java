public class PracticeDay2 {

  public static void main(String[] args) {
    int[] numbers = {3,8,2,7,6,10};
    for (int i= 0; i< numbers.length; i++){
      System.out.println(numbers[i]);
    }

  int sum = 0;
  int max = numbers[0];
    for (int i=0; i<numbers.length; i++){
      sum += numbers[i];
    }
    double average = (double) sum / numbers.length;
    System.out.println(average);

  for (int i=0; i<numbers.length; i++){
   if(numbers[i] > max){
        max = numbers[i];
    } 
  }System.out.println("Max number =" + max);

  for (int i=0; i < numbers.length; i++){
    if(numbers[i] % 2 == 1){
      System.out.println(numbers[i]);
    }
  }

  int evenCount = 0;
  for (int i=0; i < numbers.length; i++){
    if(numbers[i] % 2 == 0){
      evenCount++;
    } 
  } System.out.println(evenCount);


  int oddCount = 0;
  for (int i = 0; i < numbers.length; i++){
    if(numbers[i] % 2 == 1){
      oddCount++;
    }
  } System.out.println(oddCount);

  int oddSum = 0;
  for (int i =0; i < numbers.length; i++){
    if(numbers[i] % 2 == 1){
      oddSum += numbers[i];
    }
  } System.out.println(oddSum);

  int[] numbers1 = {4, 9, 2, 7, 10, 3};
  int total = 0;

  for (int i = 0; i < numbers1.length; i++){
    total += numbers1[i];   
  } double average2 = (double) total / numbers1.length; 
    System.out.println(average2);

int overAverage = 0;
  for (int i = 0; i < numbers1.length; i++){
    if (numbers1[i] > average2) {
      System.out.println("Over average number =" + numbers1[i]);
      overAverage = numbers1[i];
    }

  } System.out.println(overAverage);


  for (int i = 0; i < numbers1.length; i++){
    if (numbers1[i] % 2 ==1){
      System.out.println("Odd:" + numbers1[i]);
    } else {
      System.out.println("Even" + numbers1[i]);
    }
  }
  int[] scores = {15, 22, 8, 19, 30, 25, 10};
  int scoresSum = 0;
  int maxScores = scores[0];
  int minScores = scores[0];

  for (int score : scores){
    System.out.println(score);
  }

  for (int score : scores){
     scoresSum += score;
  } double averageScores = (double) scoresSum / scores.length;
    System.out.println(averageScores);

    for (int score : scores){
      if (score > maxScores)
        maxScores = score;
      if (score < minScores)
        minScores = score;
      
    } System.out.println(maxScores);
    System.out.println(minScores);

  }
}