package com.company;

import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Payable[] payables = new Payable[4];
        payables[0] = new Invoice("0123", "Axe", 5, 120);
        payables[1] = new Invoice("4567", "Hoe", 6, 150);
        payables[2] = new SalariedEmployee("Ajibade", "Musa", "001", 7000);
        payables[3] = new SalariedEmployee("Adesanya", "Mutiat", "002", 6500);

        System.out.println("Processing objects polymorphically");
        for (Payable currentPayable: payables){
            PrintStream printf = System.out.printf(currentPayable.toString(),
                    currentPayable.getPaymentAmount());
            System.out.print(printf);
        }
    }
}
