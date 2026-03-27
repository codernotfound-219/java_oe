package reentrantlocks;
import java.util.concurrent.locks.ReentrantLock;

public class SecureDatabase {
  private final ReentrantLock lock = new ReentrantLock();

  public void mainEntry() {
    lock.lock();

    try {
      System.out.println(Thread.currentThread().getName() + " acquired access to MainEntry");
      serverEntry();
    } finally {
      System.out.println(Thread.currentThread().getName() + " releases the MainEntry Lock");
      lock.unlock();
    }
  }

  public void serverEntry() {
    lock.lock();

    try {
      System.out.println(Thread.currentThread().getName() + " acquired access to ServerRoom");

      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt(); 
      }

    } finally {
      System.out.println(Thread.currentThread().getName() + " releases the ServerRoom Lock");
      lock.unlock();
    }
  }
}
