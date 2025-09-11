public class PracticeDay1 {
  public static void main(String[] args) {
    for(int i = 1; i <=20; i++){
      System.out.println(i);
    }

  int sum = 0;
  int a = 1;
  while (a <= 50){
    sum += a;
    a++;
  } System.out.println(sum);


  int [] numbers = {3, 17, 9, 25, 11};
  int max = numbers[0];

  for (int n : numbers) {
    if ( n > max) {
      max = n;
    }
  }     System.out.println(max);

int[] numbers2 = {7, 2, 15, 9 ,4};

int max2 = numbers2[0];

for (int i = 0; i < numbers2.length; i++){
  if (numbers2[i] > max2) {
    max2 = numbers2[i];
  }
} System.out.println(max2);

int[] numbers3 = {12, 7, 20, 3, 15};
int min = numbers3[0];

for(int i = 0; i < numbers3.length; i++){
  if (numbers3[i] < min){
   min = numbers3[i];
  }
  if (numbers3[i] % 2 == 0){
    System.out.println(numbers3[i]);
  }

}System.out.println(min);


  }
  }