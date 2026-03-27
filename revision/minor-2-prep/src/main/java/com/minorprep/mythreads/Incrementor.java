package com.minorprep.mythreads;

public class Incrementor extends Thread {
  private final SharedData data;

  public Incrementor(SharedData d) {
    this.data = d;
  }

  @Override
  public void run() {
    for(int i=0; i < data.getTarget(); i++) {
      data.increment();
    }
  }
}
