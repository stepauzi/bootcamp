import java.util.Stack;

public class PracticeDay6 {

  public static void main(String[] args) {
  


  String word = "JavaBootcamp";
  Stack<Character> stack = new Stack<>();

  for (int i = 0; i < word.length(); i++){
    char c = word.charAt(i);
    if( c >= 'A' && c <= 'Z'){
    stack.push(c);
  }
}

  while(!stack.isEmpty()){
    System.out.println(stack.pop());
  }

    int count = 0;
    // int average = 10 / count; java.lang.ArithmeticException: / by Zero
    try {
      int average = 10 / count;
      System.out.println(average);
    } catch (ArithmeticException e){
      System.out.println("Cannot divide by 0");
      System.out.println("The root cause is " + e.getMessage());
    }

        int[] arr = new int[3];
    // System.out.println(arr[3]); // java.lang.ArrayIndexOutOfBoundsException
    try {
      System.out.println(arr[3]);
    } catch (ArrayIndexOutOfBoundsException e){
      System.out.println("Index is out of bounds, please use '0 - " + (arr.length -1) + "'");
      System.out.println("The root cause is " + e.getMessage());
    }

        String wordString = "hello";
    try {
      System.out.println(wordString.charAt(5));
    } catch (StringIndexOutOfBoundsException e){
      System.out.println("String is out of bounds, please only input '0 - " + (wordString.length() - 1));
      System.out.println("The root cause is " + e.getMessage());
    }

      String input = null;
      try {
      int len = getLength(input);
      System.out.println("Length = " + len);
    } catch (IllegalArgumentException e) {
      System.out.println("Please input again.");
      System.out.println("The root cause - " + e.getMessage());
    }
}

  public static int getLength (String s){
    if ( s != null)
    return s.length();
    throw new IllegalArgumentException(" s should not be null.");


  }

}
