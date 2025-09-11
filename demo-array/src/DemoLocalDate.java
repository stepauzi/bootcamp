import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class DemoLocalDate {
  public static void main(String[] args) {
    // number, String, boolean, etc.
    String birthday = "01-JAN-1999";
    // + 1 year

    LocalDate yearEnd = LocalDate.of(1999, 12, 31);
    LocalDate firstDateOfYear = yearEnd.plusDays(1L);
    System.out.println(yearEnd.plusMonths(2L)); // 2000-02-29
    System.out.println(yearEnd.plusYears(1L)); // 2000-12-31
    // minus (Try yourself)

    System.out.println(firstDateOfYear);
    System.out.println(firstDateOfYear.isLeapYear()); // true

    LocalDate today = LocalDate.now(); // read running machine system time
    System.out.println(today.getDayOfWeek());

    System.out.println(today.isAfter(LocalDate.of(2025, 8, 11))); // true
    System.out.println(today.isAfter(LocalDate.of(2025, 12, 11))); // false
    System.out.println(today.isEqual(LocalDate.of(2025, 8, 12))); // true (today=2025.8.12)

    System.out.println(today.isBefore(LocalDate.of(2025, 8, 11))); // false
    System.out.println(today.isBefore(LocalDate.of(2025, 12, 11))); // true

    System.out.println(today.getYear()); // 2025
    System.out.println(today.getMonth().ordinal()); // 7 (AUGUST)
    System.out.println(LocalDate.of(2025, 1, 1).getMonth().ordinal()); // 0

    // Math: pow(), max(), min(), abs()
    // BigDecimal -> multiply / divide -> setScale() -> round
    double result = BigDecimal.valueOf(10.0) //
        .divide(BigDecimal.valueOf(3.0), 2, RoundingMode.HALF_DOWN) //
        .doubleValue();
    System.out.println(result);
    // new Random()
  }
}
