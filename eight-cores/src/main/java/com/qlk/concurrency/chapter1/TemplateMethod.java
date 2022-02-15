package com.qlk.concurrency.chapter1;

/**
 * 抽象方法实现
 */
public abstract class TemplateMethod {

  public final void println(String message) {
    System.out.println("############");
    wrapPrint(message);
    System.out.println("############");
  }

  protected abstract void wrapPrint(String message);

  public static void main(String[] args) {
    TemplateMethod templateMethod = new TemplateMethod() {
      @Override
      protected void wrapPrint(String message) {
        System.out.println("*" + message + "*");
      }
    };

    templateMethod.println("hello TemplateMethod");
  }
}
