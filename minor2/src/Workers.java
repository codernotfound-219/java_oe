
public class Workers extends Thread {
  private final Service sc;

  public Workers(Service s) {
    this.sc = s;
  }

  @Override
  public void run() {
    sc.operation();
  }
}
