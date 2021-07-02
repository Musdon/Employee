package com.company;

public class BasePlusCommissionEmployee extends CommissionEmployee implements Payable{
    private double baseSalary;
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                      double baseSalary, double grossSales, double commissionRate){
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        if (baseSalary<=0){
            throw new IllegalArgumentException("Base salary should not be less than zero");
        }
        this.baseSalary = baseSalary;
    }
    public void setBaseSalary(double baseSalary){
        if (baseSalary<=0){
            throw new IllegalArgumentException("Base salary should not be less than zero");
        }
        this.baseSalary = baseSalary;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    @Override
    public double getPaymentAmount(){
        return getBaseSalary() + super.getPaymentAmount();
    }
    @Override
    public String toString(){
        return String.format("%s %s: %s: ₦%,.2f", "base-salaried", super.toString(), "base Salary",
                getBaseSalary());
    }
}
