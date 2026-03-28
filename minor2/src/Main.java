
public class Main {
  public static void main(String[] args) {
    Service sc = new Service();
    Workers th1 = new Workers(sc);
    Workers th2 = new Workers(sc);
    Workers th3 = new Workers(sc);
    Workers th4 = new Workers(sc);


    th1.start();
    th2.start();
    th3.start();
    th4.start();

    try {
      th1.join();
      th2.join();
      th3.join();
      th4.join();
    } catch (InterruptedException e) {
      System.out.println("CRITICAL ERROR: main was interrupted prematurely");
      e.printStackTrace();
    }

    double circle = sc.getCount();
    double square = 4 * sc.getTotal();

    double pi = 4 * (circle/square);
    System.out.println("Pi = " + pi);
  }
}
