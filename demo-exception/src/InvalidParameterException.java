// ! Class -> return
// ! Checked Exception Class -> throw
// ! Unchecked Exception Class -> throw
public class InvalidParameterException extends Exception { // Checked Exception Class
  // new InvalidParameterException("xxx")
  public InvalidParameterException(String message) {
    super(message);
  }
}
