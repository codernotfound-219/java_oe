import java.lang.Math;

public class Service {
  private int circle;
  private final int N = 10000000;
  private final int totalThreads = 4;
  private final int perThread = N/totalThreads;

  public Service() { circle = 0; }

  public int getCount() { return circle; }
  public int getTotal() { return N; }
  public int getPerThreadCount() { return perThread; }

  public boolean isCircle(double x, double y) {
    return x*x + y*y <= 1;
  }

  public synchronized void update(int delta) {
    circle += delta;
  }
}
