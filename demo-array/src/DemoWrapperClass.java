public class DemoWrapperClass {
  public static void main(String[] args) {

System.out.println(Integer.valueOf(3));
System.out.println(Double.valueOf(3.3));

    Character ch = 'a'; // auto-box
    char ch2 = ch; // un-box

    // int -> long (auto-promotion / up-casting)
    long l1 = 7;
    // long -> int (explicit / down-casting)
    int x3 = (int) l1;

    // int -> Long
    // Long l2 = 7; // ! Integer has no relationship with Long
    Long l2 = (long) 7; // int -> long (upcast) -> Long (Auto-box)

    // long -> Integer
    // Integer x4 = 4L; /// long -> Long -> Integer (NOT OK)
    Integer x4 = (int) 4L; // long -> int (downcast) -> Integer (auto-box)

    // ! Comparison
    // ! Primitive comparison -> (>,<,>=,<=,!=,==)
    // ! Wrapper Class comparison (use method Only, compareTo)

    Integer i1 = 10;
    Integer i2 = 11;

    System.out.println(i1 > i2); //false, int > int
    System.out.println(i1.compareTo(i2)); // -1

    int i3 = 12;
    System.out.println(i1.compareTo(i3)); //-1
    // ! i3 is a Primtive, which has NO functionaility
    // System.out.println(i3.compareTo(i1));

    // Integer vs Long
    Long l3 = 20L;
    // i1,compareTo(l3)
    System.out.println(i1.longValue() > l3.longValue());

    // Character (ASCII)
    Character ch3 = 'b';
    System.out.println(ch3.charValue() > 97); //97
    System.out.println(ch3.compareTo(Character.valueOf('b')));

  }
}
