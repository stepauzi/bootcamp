import java.time.LocalDate;

public class DemoLocalDate {
  public static void main(String[] args) {
    // number, String, boolean, etc.
    String birthday = "01-JAN-1999";
    // + 1 year

    LocalDate yearEnd = LocalDate.of(1999, 12, 31);

    LocalDate firstDateOfYear = yearEnd.plusDays(1L); //plusDays use long value
      System.out.println(firstDateOfYear);

    LocalDate twoMonthsAfter = yearEnd.plusMonths(2L); 
      System.out.println(twoMonthsAfter);

    System.out.println(firstDateOfYear.isLeapYear()); // true

    LocalDate today = LocalDate.now(); // read running machine system time
      System.out.println(today.getDayOfWeek());

    System.out.println(today.isAfter(LocalDate.of(2025, 8 , 11))); // true (Today is 2025/8/11)
    System.out.println(today.isEqual(LocalDate.of(2025, 8 , 12))); // true (Today is 2025/8/11)
    System.out.println(today.isBefore(LocalDate.of(2025, 8 , 13))); // true (Today is 2025/8/11)

    System.out.println((today.getYear())); //2025
    System.out.println(today.getMonth().ordinal()); // count from 0 -> August is 7th
    System.out.println(LocalDate.of(2025,1,1).getMonth().ordinal()); // 0
  }
}