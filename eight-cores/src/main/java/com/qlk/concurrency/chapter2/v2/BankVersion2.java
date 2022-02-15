package com.qlk.concurrency.chapter2.v2;

/**
 * runnable接口
 *
 * 实现线程和业务逻辑单元 分离
 *
 */
public class BankVersion2 {

  public static void main(String[] args) {
    final TicketWindowRunnable ticketWindow = new TicketWindowRunnable();

    new Thread(ticketWindow, "一号窗口").start();
    new Thread(ticketWindow, "二号窗口").start();
    new Thread(ticketWindow, "三号窗口").start();
  }
}
