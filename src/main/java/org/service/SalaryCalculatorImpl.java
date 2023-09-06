package org.service;

import org.model.Employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalaryCalculatorImpl<T extends Employee> implements SalaryCalculator<T> {

    @Override
    public Double calculateSalary(T employee) {
        return employee.getSalary() - calculateTax(employee);
    }

    @Override
    public Map<String, Double> calculateSalary(List<T> employees) {
        Map<String, Double> salaryLists = new HashMap<>();
        for (T employee : employees) {
            Double roundTotal = (double) Math.round(calculateSalary(employee));
            salaryLists.put(employee.getNationalId(), roundTotal);
        }
        return salaryLists;
    }
}
