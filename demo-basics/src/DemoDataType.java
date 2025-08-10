public class DemoDataType {
  public static void main(String[] args) {
    // ! int, double, boolean, char, byte, short, long, float (Primitive)
    // ! String 

    // "hello    WORLD  !!!!" -> String value
    // s1 -> String variable
    String s1 = "hello    WORLD  !!!!";
    System.out.println(s1);

    // variable naming convention -> camel case
    // Never: is_male, ismale, etc
    boolean isMale = true;

    int age = 66;
    boolean isElderly = age > 65;
    // Step 1: age > 65 -> true value
    // Step 2: assign true value into boolean variable
    System.out.println(isElderly); // true

    // ! char range: 0 - 6xxxx
    char gender = 'M';
    System.out.println(gender);
    char ch = '體';
    char ch3 = '体';
    
    int chAscii = ch;
    System.out.println(chAscii); // 39636
    int ch3Ascii = ch3;
    System.out.println(ch3Ascii); // 20307

    char ch2 = 'の';
    int ch2Ascii = ch2;
    System.out.println(ch2Ascii); // 12398

    // ! define char value -> use single quote ''
    // ! define String value -> use double quote ""
    // ! char value has to be single character

    // Java ~30 years
    // ! byte, short, int and long
    byte age2 = 100;
    // byte: -128 to 127
    // short: -32xxx to 32xxx
    // int: -2.1 billion to 2.1 billion
    // long: -2^62 to 2^62

    // ! Java: long > int > short > byte (level of type)
    long l1 = 100;
    // assign 100 int value into long type variable (OK)
    System.out.println(l1); // 100
    
    long l2 = 100L;
    // assign 100L long value into long type variable (OK)
    System.out.println(l2); // 100

    byte b1 = 100;
    byte b2 = -128;
    // byte b3 = 128; // out of range

    short s3 = 32767;
    // short s4 = 32768;
    short s4 = -32768;

    int result = b1 + 7;
    // step1: byte value + int value -> int value
    // step2: assign int value into int variable
    System.out.println(result); // 134

    // 100L (long value)
    // "100L" (String value)
    String s2 = "100L";
    System.out.println(s2); // 100L

    // ! Not allowed, 
    // short r1 = b1 + s3; // byte value + short value -> int + int -> int 
    // cannot assign int value to short variable

    int r1 = b1 + s3; // byte value + short value -> int + int -> int
    System.out.println(r1); // 32894

    // byte b10 = b1 + 1; // byte + int -> int
    // ! because byte + int -> int, so we cannot assign int value into byte variable

    int r2 = b1 + 1; 

    int i10 = 2_147_483_647;
    int i11 = i10 + 1;
    System.out.println(i11); // -2147483648

    int i12 = 2_100_000_000 + 100_000_000; // overflow
    System.out.println(i12); // -2094967296

    // ! by default, 7.84 is a double value
    // by default, 7 is a int value
    float width = 7.84f;
    System.out.println(width); // 7.84
    long k = 10L;
    System.out.println(k); // 10
    double d10 = 9.89d;
    System.out.println(d10); // 9.89

    // ! because 7.77 is double value, and we cannot assign double value to float variable
    // ! double > float
    // float f1 = 7.77;

    float length = 5.3f;
    float area = length * width;
    System.out.println(area); // 41.552002

    // float area2 = length * 7.84; 
    // ! float * double -> double value -> float variable (NOT OK)

    // ASCII Code
    // a,b,c,d...1,2,3,4...!@#$%...
    char letter = 97; // ! we can assign char value or ASCII code
    System.out.println(letter); // a

    // char letter2 = letter + 1;
    // Step 1: char value + int value -> int -> cannot assign int value to char variable

    int letter2 = letter + 1; // char + int -> int
    System.out.println(letter2); // 98

    // solution: downcast
    char letter3 = (char) (letter + 1); // ! downcast (int -> char)
    System.out.println(letter3); // b

    int asciiForZero = 48;
    char letter4 = (char) asciiForZero;
    System.out.println(letter4); // '0'

    int asciiForA = 'A';
    // Step 2: assign char value into int variable (OK)
    // Step 3: auto-convert char value to ascii code
    System.out.println(asciiForA); // 65

    char letterForZ = 'A' + 25; // ! explicit char value + explicit int value (no risk)
    System.out.println(letterForZ);

    int distance = 2;
    char letterForC = (char) ('A' + distance); // ! explicit char value + int variable (risky)
    System.out.println(letterForC); // 'C'
  }
}
