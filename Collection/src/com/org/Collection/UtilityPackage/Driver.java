package com.org.Collection.UtilityPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<EmployeComparator> employees = new ArrayList<>();
        
        // Adding employees to the list
        employees.add(new EmployeComparator(1234, "Manjeet Yadav", "manjeetyadav@gmail.com"));
        employees.add(new EmployeComparator(12343, "Alice", "alice@example.com"));
        employees.add(new EmployeComparator(12340, "Bob", "bob@example.com"));
        employees.add(new EmployeComparator(123043, "Charlie", "charlie@example.com"));
        employees.add(new EmployeComparator(12034, "David", "david@example.com"));
        employees.add(new EmployeComparator(102343, "Eve", "eve@example.com"));

        // Print employees before sorting
        System.out.println("Before sorting:");
        for (EmployeComparator e : employees) {
            System.out.println(e);
        }

       // Collections.sort(employees, new ComparatorEmail());
       // Collections.sort(employees, new ComparatorName());
       Collections.sort(employees, new ComparatorEid());
        System.out.println("\nAfter sorting by Eid:");
        for (EmployeComparator e : employees) {
            System.out.println(e);
        }
    }
}
