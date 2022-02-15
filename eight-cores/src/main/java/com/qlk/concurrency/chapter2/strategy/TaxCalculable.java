package com.qlk.concurrency.chapter2.strategy;

public class TaxCalculable {

  private final double salary;
  private final double bonus;
  private TaxCalculatorStrategy taxCalculatorStrategy;

  public TaxCalculable(double salary, double bonus) {
    this.salary = salary;
    this.bonus = bonus;
  }

  protected double calcTax() {
    return taxCalculatorStrategy.calcTax(salary, bonus);
  };

  public void calculate() {
    System.out.println(this.calcTax());;
  }

  public double getSalary() {
    return salary;
  }

  public double getBonus() {
    return bonus;
  }

  public void setTaxCalculatorStrategy(TaxCalculatorStrategy taxCalculatorStrategy) {
    this.taxCalculatorStrategy = taxCalculatorStrategy;
  }
}
