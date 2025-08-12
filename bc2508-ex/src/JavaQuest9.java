/**
 * Expected Output:
 * J
 * e
 * 3
 * 9
 * 10
 * ab c
 * VenturenixLAB, Coding
 * 19
 * ren
 * VENTURENIXLAB, JAVA
 * venturenixlab, java
 * V*NTUR*NIXLAB, JAVA!!!
 */
public class JavaQuest9 {
  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";

    // prints J
    char ch15 = str.charAt(15);
    System.out.println(ch15);
    // prints e (the 1st e)
    // code here ...
    // Use indexOf()
    int index = str.indexOf('e');
    if (index != -1){
      System.out.println(str.charAt(index));
    }
    // prints 3
    System.out.println(str.indexOf('t'));
    // prints 9
    System.out.println(str.indexOf('x'));
    // prints 10
    System.out.println(str.indexOf('L'));
    // code here ...

    // Use String trim()
    String abc = "    ab c    ";
    // prints "ab c"
    System.out.println(abc.trim());

    // Use String replace() method
    System.out.println(abc.replace("    ", ""));

    // prints VenturenixLAB, Coding
    // code here ...
    System.out.println(str.replace("Java", "Coding"));


    // int length()
    // prints 19
    // code here ...
    System.out.println(str.length());

    // Use String substring(int start, int end)
    // prints "ren"
    // code here ...
    System.out.println(str.substring(5, 8));

    // print "VENTURENIXLAB, JAVA"
    System.out.println((str.toUpperCase()));
    // prints "venturenixlab, java"
    // code here ...
    System.out.println(str.toLowerCase());

    // Method Chaining (one line to complete)
    // prints "V*NTUR*NIXLAB, JAVA!!!"
    // code here ...
    System.out.println(str.replace("e", "*"));

  }
}