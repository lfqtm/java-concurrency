package com.qlk.concurrency.chapter2.strategy;

public class SimpleTaxCalculatorStrategy implements TaxCalculatorStrategy {

  private final static double SALARY_RATE = 0.1;
  private final static double BONUS_RATE = 0.15;


  @Override
  public double calcTax(double salary, double bonus) {
    return salary * SALARY_RATE + bonus * BONUS_RATE;
  }
}
