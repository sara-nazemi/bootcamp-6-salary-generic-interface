package org.service;

import org.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface SalaryCalculator<T extends Employee> {

    Double calculateSalary(T employee);

    default Double calculateTax(T employee) {
        return employee.getSalary() * employee.getTaxRate();
    }

    Map<String, Double> calculateSalary(List<T> employees);
}
