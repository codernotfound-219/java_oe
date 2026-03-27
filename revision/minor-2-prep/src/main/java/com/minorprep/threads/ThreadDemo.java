package com.minorprep.threads;

public class ThreadDemo extends Thread {
  private static final int TIMES=30;
  private int x;

  public ThreadDemo(int x) { this.x=x; }

  @Override
  public void run() {
    for (int i = x+TIMES; i > x; i--) {
      System.out.println("run() : " + i);
    }
  }

  public static void main(String[] args) {
    ThreadDemo th1 = new ThreadDemo(200);
    th1.start();
    for (int i = 0; i < TIMES; i++) {
      System.out.println("main() : " + i);
    }
  }
}
