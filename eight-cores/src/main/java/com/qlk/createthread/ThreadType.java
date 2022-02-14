package com.qlk.createthread;

public class ThreadType extends Thread {

  public static void main(String[] args) {

    Thread thread = new Thread(new ThreadType());


    thread.start();
  }

  @Override
  public void run() {

    System.out.println("綫程執行" + Thread.currentThread().getName());
  }
}
