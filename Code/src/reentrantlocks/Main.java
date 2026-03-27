package reentrantlocks;

public class Main {
  public static void main(String[] args) {
    SecureDatabase db = new SecureDatabase();

    Client cl1 = new Client(db);
    Client cl2 = new Client(db);

    Thread A = new Thread(cl1, "Thread-Alpha");
    Thread B = new Thread(cl2, "Thread-Beta");

    A.start();
    B.start();
  }
}
