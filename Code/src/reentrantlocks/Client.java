package reentrantlocks;

public class Client implements Runnable {
  private final SecureDatabase db;

  public Client(SecureDatabase d) {
    this.db = d;
  }

  @Override
  public void run() {
    db.mainEntry();
  }
}
