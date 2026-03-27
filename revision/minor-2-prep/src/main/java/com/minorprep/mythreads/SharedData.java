package com.minorprep.mythreads;

public class SharedData {
  private final int N = 100;
  private int val;

  public SharedData(int x)  { this.val = x; }

  public int getValue() {
    return val;
  }

  public int getTarget() {
    return N;
  }

  public synchronized void increment() {
    val++;
  }
}
