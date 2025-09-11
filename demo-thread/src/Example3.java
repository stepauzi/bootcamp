public class Example3 {
  public static void main(String[] args) {
    SyncTask task = new SyncTask();
    Thread worker1 = new Thread(task); // task.run()
    Thread worker2 = new Thread(task);

    worker1.start(); // execute task.run()
    worker2.start(); // execute task.run()
    
    try {
      // ! main thread will wait until worker1 come back
      worker1.join();
      // ! main thread will wait until worker2 come back
      worker2.join();
    } catch(InterruptedException e) {

    }
    System.out.println(task.getX()); // 200_000
  }
}
