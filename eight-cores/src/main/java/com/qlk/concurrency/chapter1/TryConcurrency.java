package com.qlk.concurrency.chapter1;

/**
 * 读写案例
 */
public class TryConcurrency {
  public static void main(String[] args) {
    readFormDB();
    writeToFile();
  }

  private static void writeToFile() {
    try {
      Thread.sleep(1000 * 10L);
      println("write done");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  private static void readFormDB() {
    try {
      Thread.sleep(2000 * 10L);
      println("read done");
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  private static void println(String msg) {
    System.out.println(msg);
  }


}
