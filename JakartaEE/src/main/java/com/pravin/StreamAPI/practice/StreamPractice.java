package com.pravin.StreamAPI.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    int id;
    String name;
    String department;
    double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class StreamPractice {
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Alice", "IT", 80000),
                new Employee(2, "Bob", "HR", 50000),
                new Employee(3, "Charlie", "IT", 90000),
                new Employee(4, "David", "Sales", 60000),
                new Employee(5, "Eva", "HR", 55000),
                new Employee(6, "Frank", "IT", 120000)
        );

        List<Employee> filtering = employeeList.stream()
                .filter(e -> e.getDepartment().equals("IT"))
                .toList();
        System.out.println("\n1. IT Team Members: " + filtering);

        List<String> names = employeeList.stream()
                .filter(e -> e.getSalary() > 60000)
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println("2. High Earners Names: " + names);
    }
}
