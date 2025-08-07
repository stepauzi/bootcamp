public class DemoString {
  public static void main(String[] args) {
    // Data Types: 8 Primitives, Class
    String s1 = "hello";
    System.out.println(s1); //hello

    // length
    System.out.println(s1.length()); //5

    int l1 = s1.length();

    // equals()
    if (s1.equals("hello")) { // ! Java: case sensitive
      System.out.println("equals");
    } else {
      System.out.println("Not equals");// print
    }
    // charAt(int index)
    System.out.println(s1.charAt(0)); //h, index = 0 means the first character of the string

    // print the last character of a string
    // ! 1.
    System.out.println(s1.charAt(s1.length() - 1));

    // ! 2.
    int lastIndexofString = s1.length() - 1;
    char lastChar = s1.charAt(lastIndexofString);
    System.out.println(lastChar);

    // ! index -> out of range (system error)
    //i.e. (not ok)
    // System.out.println(s1.charAt(-1));
  }
}
