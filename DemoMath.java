public class DemoMath {
  public static void main(String[] args) {
    int x = 5;
    int y = 9;

    System.out.println(x + y); // 14 (int) ->"14"

    int z = x + y;
    System.out.println(z); // 14
    System.out.println("z=" +z); // z=14

    double a = 0.2;
    double b = 0.4;

    double c = a - b;
    System.out.println(c); // -0.2

    int h = 40;
    int u = 3;

    int result = h * u;
    System.out.println(result); // 120

    int g = 9 / 2; //(int value / int value -> int value) -> 4
    System.out.println(g); //4.5
    System.out.println("g+" +g);

    double k = 9;
    double i = 2;

    double j = k / i;
    System.out.println(j);

    // ! Java: double type is higher than int type
    // we cannot assign a higher level type value into a lower level type of variable

    double d5 = 2; // 2 -> int value, so we can assign int value into double variable
    // auto-convert (auto-upgrade from int to double for the value)
    System.out.println(d5);

    //remainder
    int i2 = 10 / 3;
    System.out.println(i2); //3

    int i3 = 10 % 3;
    System.out.println(i3); //1, because 1 is the remainder of 10 / 3
    // double d6 = 9 / 0; ! Not allow divde zero for all programming language

    int i4 = (6 + 8) * 3;
    System.out.println(i4); //42

    int i6 = (9 + 7) * ((8-3) * 9 - 3);
    System.out.println(i6); //672

    
  }
}