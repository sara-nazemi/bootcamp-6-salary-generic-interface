package org.model;

public abstract class Employee {
    protected String nationalId;
    protected String name;
    protected Double salary;
    protected Float taxRate;

    public Employee() {
    }

    public Employee(String nationalId, String name, Double salary, Float taxRate) {
        this.nationalId = nationalId;
        this.name = name;
        this.salary = salary;
        this.taxRate = taxRate;
    }

    public String getNationalId() {
        return nationalId;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public Float getTaxRate() {
        return taxRate;
    }
}
