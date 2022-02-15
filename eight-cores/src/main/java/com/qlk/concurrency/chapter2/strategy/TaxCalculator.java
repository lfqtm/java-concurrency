package com.qlk.concurrency.chapter2.strategy;

/**
 * 税率计算器
 *
 */
public abstract class TaxCalculator {

  private final double salary;
  private final double bonus;

  public TaxCalculator(double salary, double bonus) {
    this.salary = salary;
    this.bonus = bonus;
  }

  protected abstract double calcTax();

  public void calculate() {
    System.out.println(this.calcTax());;
  }

  public double getSalary() {
    return salary;
  }

  public double getBonus() {
    return bonus;
  }
}
