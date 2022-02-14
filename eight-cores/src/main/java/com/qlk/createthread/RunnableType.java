package com.qlk.createthread;

public class RunnableType implements Runnable {

  public static void main(String[] args) {
    Thread thread = new Thread(new RunnableType());
    thread.start();
  }


  @Override
  public void run() {
    System.out.println("线程启动 = " + Thread.currentThread().getName());
  }
}
