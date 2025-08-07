public class DemoDataType {
  public static void main(String[] args) {
  // ! int, double, boolean, char, byte, short, long, float (Primitive)
  // ! String
  String s1 = "Hello World!!!!";
  System.out.println(s1);
  
  // variable naming convention -> camel case
  // Never: is_male,ismale, etc
  boolean isMale = true;
  System.out.println(isMale);

  int age = 66;
  boolean isElderly = age > 65;
  // Step 1: age > 65 -> true variable
  // Step 2: assign true value into boolean variable
  System.out.println(isElderly); //true

  char gender = 'M';
  System.out.println(gender);


  char ch = '$';
  int chAscii = ch;
  System.out.println(chAscii);

  // ! define char value -> use single quote ''
  // ! define String value - > use double quote ""

  // ! char value has to be **single character**

  // byte, short, int and long

  // byte: -128 to 127
  // short: -32xxx to 32xxx
  // int: -2.1 billion to 2.1 billion
  // long: -2^63 to 2^63

  // ! Java: long > *int > short > byte (level of types)
  long l1 = 100;
  // Assign 100 int value into long type variable (OK)
  System.out.println(l1); //100

  long l2 = 100L;
  // Assign 100L long value into long type variable (OK)
  System.out.println(l2); //100

  byte b1 = 127;

  // short s4 = 32768;
  short s3 = 32767;
  short s4 = -32768;
  System.out.println(s4); 

  int result = b1 + 7;
  // Step 1: byte value + int value -> int value
  // Step 2: assign int value into int value
  System.out.println(result); //134

  // ! Not allowed
  //Short r1 = b1 + s3; //byte value + short value -> int + int -> int
  //cannot assign int value to short variable

    int r1 = b1 + s3; //byte value + short value -> int + int -> int
  System.out.println(r1); //32894
  
  // byte b10 = b1 + 1; //byte + int -> int
  // ! because byte + int -> int, ao we cannot assign int value into byte variable

  int i10 = -2_147_483_648; 
  int i11 = i10 - 1; 
  System.out.println(i11);

  int i12 = 2_100_000_000 + 100_000_000; // overflow
  System.out.println(i12); // will revert back to other side
  
  // by default, 7.84 is a double value
  //by default, 7 is a int value
  float width = 7.84f;
    System.out.println(width); // 7.84
  long k = 10L; 
  System.out.println(k); // 10
  double d10 = 9.89d;
  System.out.println(d10); //9.89

  // because 7.77 is double value, and we cannot assign double value to floar variable
  // ! double > float
  // float f1 = 7.77;

  float length = 5.3f;
  float area = length * width;
  System.out.println(area); //41.552003

  float area2 = length * 7; 
  // !float * double -> double value -> float variable (Not ok)
  System.out.println(area2);

  // ASCII Code
  // a,b,c,d, 1,2,3,4, &*^()

  char letter = 97; // ! we can assign char value ot ASCII code

  // char letter2 = letter + 1;
  // Step 1: char value + int value -> int -> cannot assign int value to char variable

  int letter2 = letter + 1; // ! char + int -> int
  System.out.println(letter2); // 98 (not b)

  // solution
  char letter3 = (char)(letter + 1); // ! downcast (int -> char)
  System.out.println(letter3); //b

  int asciiForZero = 48;
  char letter4 = (char)asciiForZero;
  System.out.println(letter4); // '0'

  int asciiForA = 'A';
  // Step 2: assign char value into int variable (ok)
  // Step 3: auto-convert char value to ascli code
  System.out.println(asciiForA); //65

  char letterForZ = 'A' + 25; // ! explicit char value 
  System.out.println(letterForZ);

  int word1 = 32424;
  char letter5 = (char)word1;
  System.out.println(letter5);
  System.out.println(word1);

  int distance = 2;
  char letterForC = (char)('A' + distance); // ! explicit char value + int variable (risky)
  System.out.println(letterForC);


}
}
