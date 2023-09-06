package org.main;

import org.model.Accountant;
import org.model.Employee;
import org.service.SalaryCalculator;
import org.service.SalaryCalculatorImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Employee accountant = new Accountant("0013623625", "x", 2000000d, 0.2f);
        Employee driver = new Accountant("0013623626", "x", 1000000d, 0.2f);
        Employee manager = new Accountant("0013623627", "x", 3500000d, 0.2f);
        Employee secretary = new Accountant("0013623628", "x", 15000000d, 0.2f);
        Employee technical = new Accountant("0013623629", "x", 2500000d, 0.2f);

        List<Employee> list = new ArrayList<>();
        list.add(accountant);
        list.add(driver);
        list.add(manager);
        list.add(secretary);
        list.add(technical);

        SalaryCalculator<Employee> s = new SalaryCalculatorImpl<>();
        Map<String, Double> salaryList = s.calculateSalary(list);

        for (Map.Entry<String, Double> entry : salaryList.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println("key = " + key + " , " + "value = " + value);
        }
    }
}