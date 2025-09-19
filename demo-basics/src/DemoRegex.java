public class DemoRegex {
  public static void main(String[] args) {
    // String Regular Expression
    String codeRule = "^[A-Za-z0-9_]+$";
    String s = "SAVE1234";
    String s2 = "SAVE_1234";
    String s3 = "";
    String s4 = "saVE$23";
    System.out.println(s.matches(codeRule));
    System.out.println(s2.matches(codeRule));
    System.out.println(s3.matches(codeRule)); // false
    System.out.println(s4.matches(codeRule)); // false

    String emailAddressRule = "^[A-Za-z0-9]+@[A-Za-z]+\\.com$";
    System.out.println("vincent123@gmail.com".matches(emailAddressRule)); // true
    System.out.println("vincent123@gmailcom".matches(emailAddressRule)); // false
    System.out.println("vincent123@gmail.co".matches(emailAddressRule)); // false
  }
}
