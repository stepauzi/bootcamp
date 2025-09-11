import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeDay7 {


    public static class Student{
      private String name;
      private int score;

      public Student(String name, int score){
        this.name = name;
        this.score = score;
      }

      public String getName(){
        return this.name;
      }

      public int getScore(){
        return this.score;
      }

      @Override
      public String toString(){
        return "Student(" + "Name = " +
        name + ", Score = " + score + ")";
      }


  public static void main(String[] args) {
    int MaxValue = 0;
    int[] q1 = {4, 7, 1, 9, 3};

    for (int i = 0; i < q1.length; i++){
      if( MaxValue < q1[i]){
        MaxValue = q1[i];
      } 
    } System.out.println(MaxValue);


    int[] q2 = {1,2,3,4,5,6,7,8,9,10};
    List<Integer> q2List = new ArrayList<>();
    int evenNum = 0;

      for(int i = 0; i < q2.length; i++ ){
        q2List.add(q2[i]);
      if (q2[i]%2 == 0){
        evenNum = q2[i];
      }
      }
      List<Integer> squareList = new ArrayList<>();
      for(int i = 0; i < q2.length; i++){
        int square = q2[i]*q2[i];
        squareList.add(square);
      }
      Comparator<Integer> sortedbyComparator1 = (i1, i2) -> {
          if (i2 > i1) return 1; return -1;
      };
      List<Integer> sortList1 = squareList.stream()
      .sorted(sortedbyComparator1)
      .collect(Collectors.toList());
      System.out.println(sortList1);

      List<Student> studentsList = new ArrayList<>();
      studentsList.add(new Student("Alice", 85));
      studentsList.add(new Student("Bob", 40));
      studentsList.add(new Student("Charlie", 70));
      studentsList.add(new Student("David", 55));

      List<Student> passList = studentsList.stream()
      .filter(s -> s.getScore() >= 50)
      .collect(Collectors.toList());
      System.out.println("Pass" + passList);

       List<Student> failList = studentsList.stream()
      .filter(s -> s.getScore() < 50)
      .collect(Collectors.toList());
      System.out.println("Fail" + failList);

    }
    }
  }
