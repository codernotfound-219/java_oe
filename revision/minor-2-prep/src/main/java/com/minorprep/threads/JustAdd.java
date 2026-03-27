package com.minorprep.threads;

public class JustAdd extends Thread {
  private final int N = 10;
  private int val;

  public JustAdd(int x) {
    this.val = x;
  }

  int value() { return val; }

  synchronized void increment() {
    val=val+1;
  }

  public void operate() {
    for (int i = 0; i < N; i++) increment();
  }

  @Override
  public void run() {
    for (int i = 0; i < N; i++) increment();
  }
  
  public static void main(String[] args) {
    JustAdd a = new JustAdd(0);
    a.start();
    a.operate();

    try {
      a.join(); // halt the main thread until a terminates
    } catch (InterruptedException e) {
      System.out.println("INTERRUPT EXCEPTION: the main thread was prematurely interrupted");
      e.printStackTrace();
    }

    System.out.println(a.value());
  }
}
