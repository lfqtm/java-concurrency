package com.qlk.concurrency.chapter2.strategy;

public class TaxCalculatorMain {

  public static void main(String[] args) {
    // thread实现方法
    /*TaxCalculator taxCalculator = new TaxCalculator(10000d, 2000d) {
      @Override
      protected double calcTax() {
        return getSalary() * 0.1 + getBonus() * 0.15;
      }
    };

    taxCalculator.calculate();
    */

    //runnable实现方法
    TaxCalculable taxCalculable = new TaxCalculable(10000d, 2000d);
    TaxCalculatorStrategy strategy = new SimpleTaxCalculatorStrategy();
    taxCalculable.setTaxCalculatorStrategy(strategy);

    taxCalculable.calculate();

  }
}
