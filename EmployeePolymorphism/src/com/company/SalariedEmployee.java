package com.company;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary){
        super(firstName, lastName, socialSecurityNumber);
        if (weeklySalary<0){
            throw new IllegalArgumentException("weekly salary cannot be less than zero");
        }
        this.weeklySalary = weeklySalary;
    }
    public void setWeeklySalary(double weeklySalary){
        if (weeklySalary<0){
            throw new IllegalArgumentException("weekly salary cannot be less than zero");
        }
        this.weeklySalary = weeklySalary;
    }
    public double getWeeklySalary(){
        return weeklySalary;
    }
    @Override
    public double getPaymentAmount(){
        return getWeeklySalary();
    }
    @Override
    public String toString(){
        return String.format("Salaried Employee: %s\n%s: %.2f", "Weekly Salary", super.toString(),
                getWeeklySalary());
    }
}
