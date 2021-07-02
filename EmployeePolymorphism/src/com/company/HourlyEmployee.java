package com.company;

public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours){
        super(firstName, lastName, socialSecurityNumber);
        if (wage<=0){
            throw new IllegalArgumentException("wage must not be less than zero");
        }
        if (hours<=0 || hours > 168){
            throw new IllegalArgumentException("hours must not be less than zero nor greater than 168");
        }
        this.wage = wage;
        this.hours = hours;
    }
    public void setWage(double wage){
        if (wage<=0){
            throw new IllegalArgumentException("wage must not be less than zero");
        }
        this.wage = wage;
    }

    public void setHours(double hours) {
        if (hours<=0 || hours > 168){
            throw new IllegalArgumentException("hours must not be less than zero nor greater than 168");
        }
        this.hours = hours;
    }
    public double getWage(){
        return wage;
    }
    public double getHours(){
        return hours;
    }
    @Override
    public double getPaymentAmount(){
        if (getHours()<=40) {
            wage = getWage() * getHours();
        }
        if(getHours()>40 && getHours() <= 168) {
            wage = 40 * getWage() + (getHours() - 40) * getHours() * 1.5;
        }
        return wage;
    }
    @Override
    public String toString(){
        return String.format("Hourly Employee: %s\n%s: ₦%,.2f: %s: %,.2f", super.toString(), "Hourly Wage",
                getWage(), "Hours worked", getHours());
    }
}