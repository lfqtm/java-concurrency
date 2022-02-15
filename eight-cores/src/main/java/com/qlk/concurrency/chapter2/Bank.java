package com.qlk.concurrency.chapter2;

public class Bank {

  /**
   * 将票数设置为类变量，完成数据一致性
   * 缺点：没有正确的顺序
   */
  public static void main(String[] args) {
    TicketWindow thread1 = new TicketWindow("一号柜台");
    TicketWindow thread2 = new TicketWindow("二号柜台");
    TicketWindow thread3 = new TicketWindow("三号柜台");

    thread1.start();
    thread2.start();
    thread3.start();
  }
}
