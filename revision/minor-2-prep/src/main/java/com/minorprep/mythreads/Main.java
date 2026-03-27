package com.minorprep.mythreads;

public class Main {
  public static void main(String[] args) {
    SharedData data = new SharedData(10);
    Incrementor thread1 = new Incrementor(data);
    Incrementor thread2 = new Incrementor(data);

    thread1.start();
    thread2.start();
    
    for (int i = 0; i < data.getTarget(); i++) {
      data.increment();
    }

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {
      System.out.println("CRITICAL ERROR: Main thread was interrupted prematurely");
      e.printStackTrace();
    }

    System.out.println(data.getValue());
  }
}
