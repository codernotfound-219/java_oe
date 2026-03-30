
public class Workers extends Thread {
  private final Service sc;
  private int localCircle;

  public Workers(Service s) {
    this.sc = s;
    localCircle = 0;
  }

  @Override
  public void run() {
    int perThread = sc.getPerThreadCount();
    for (int i = 0; i < perThread; i++) {
      double x = Math.random();
      double y = Math.random();

      if (sc.isCircle(x, y)) localCircle++;
    }

    sc.update(localCircle);
  }
}
