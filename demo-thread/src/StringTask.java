public class StringTask implements Runnable {
  private String str = "";


  // "null" + "a"
  @Override
  public synchronized void run() {
    for (int i = 0; i < 10_000; i++) {
      this.str += "a";
    }
  }

  public String getStr() {
    return this.str;
  }
}
