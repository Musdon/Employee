package com.company;

public class CommissionEmployee extends Employee {
    public double grossSales;
    public double commissionRate;
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
                              double commissionRate){
        super(firstName, lastName, socialSecurityNumber);
        if (commissionRate <= 0 || commissionRate >= 1){
            throw new IllegalArgumentException("Commission rate must be between one and zero");
        }
        if (grossSales<0){
            throw new IllegalArgumentException("Gross sales must not be less than zero");
        }
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales<0){
            throw new IllegalArgumentException("Gross sales must not be less than zero");
        }
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0 || commissionRate >= 1){
            throw new IllegalArgumentException("Commission rate must be between one and zero");
        }
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }
    @Override
    public double getPaymentAmount(){
         return getCommissionRate() * getGrossSales();
    }
    public String toString(){
        return String.format("%s: %s\n%s: ₦%,.2f: %s: ₦%,.2f", "Commission Employee", super.toString(),
                "Gross Sales", getGrossSales(), "Commission Rate", getCommissionRate());
    }
}
