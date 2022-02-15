package com.qlk.concurrency.chapter2.v2;

public class TicketWindowRunnable implements Runnable {

  private static int index =1;
  private static final int MAX = 50;

  @Override
  public void run() {
    while (index <= MAX) {
      System.out.println("当前柜台(" + Thread.currentThread().getName() + ")" + "=>当前的号码是：" + (index++));
    }
  }
}
