package reentrantlocks;

public class Main {
  public static void main(String[] args) {
    SecureDatabase db = new SecureDatabase();

    Client cl1 = new Client(db);
    Client cl2 = new Client(db);

    cl1.start();
    cl2.start();
  }
}
