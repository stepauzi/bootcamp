import java.util.Hashtable;
import java.util.Map;

public class HashTableTask implements Runnable {
  private Map<String, Integer> map;

  public HashTableTask() {
    this.map = new Hashtable<>();
  }

  @Override
  public void run() {
    // ! Now we need to lock both getOrDefault() and put() for ONE thread
    for (int i = 0; i < 10_000; i++) {
      int value = this.map.getOrDefault("apple", 0); // key
      this.map.put("apple", value + 1); // key
    }
  }

  public Map<String, Integer> getMap() {
    return this.map;
  }
}
