package com.qlk.createthread;

/**
 * 思考题
 */
public class BothAndType {
  public static void main(String[] args) {

    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("我是runnable");
      }
    }) {
      @Override
      public void run() {
        System.out.println("我是Thread");
      }
    }.start();
  }
}
