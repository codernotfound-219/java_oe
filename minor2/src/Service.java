import java.lang.Math;

public class Service {
  private int circle;
  private final int N = 10000000;
  private final int totalThreads = 4;
  private final int perThread = N/totalThreads;

  public Service() { circle = 0; }

  public int getCount() { return circle; }
  public int getTotal() { return N; }

  private boolean isCircle(double x, double y) {
    return x*x + y*y <= 1;
  }

  private synchronized void increment() {
    circle++;
  }

  public void operation() {
    for (int i = 0; i<perThread; i++) {
      double x = Math.random();
      double y = Math.random();

      if (isCircle(x, y)) increment();
    }
  }
}
