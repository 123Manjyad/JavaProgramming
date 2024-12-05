package com.org.Collection.UtilityPackage;
import java.util.*;

public class Employe implements java.lang.Comparable<Employe> {

    int eid;
    String name;
    String email;

    // Default constructor
    Employe() {
        super();
    }

    // Parameterized constructor
    Employe(int eid, String name, String email) {
        this.eid = eid;
        this.name = name;
        this.email = email;
    }

    // Getters and Setters
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // toString method to print employee details
    @Override
    public String toString() {
        return "Employe [eid=" + eid + ", name=" + name + ", email=" + email + "]";
    }

    // compareTo method to compare employees based on their eid
    @Override
    public int compareTo(Employe o) {
        // Compare by eid
        return this.eid - o.eid;
    }

    public static void main(String[] args) {
        // Create a list of employees
        List<Employe> employees = new ArrayList<>();
        employees.add(new Employe(1234, "Manjeet Yadav", "manjeetyadav@gmail.com"));
        employees.add(new Employe(12343, "Manjeet Yadav", "manjeetyadav@gmail.com"));
        employees.add(new Employe(12340, "Manjeet Yadav", "manjeetyadav@gmail.com"));
        employees.add(new Employe(123043, "Manjeet Yadav", "manjeetyadav@gmail.com"));
        employees.add(new Employe(12034, "Manjeet Yadav", "manjeetyadav@gmail.com"));
        employees.add(new Employe(102343, "Manjeet Yadav", "manjeetyadav@gmail.com"));

        // Print employees before sorting
        System.out.println("Before sorting:");
        for (Employe e : employees) {
            System.out.println(e);
        }

        // Sort employees by their eid (using compareTo method)
        Collections.sort(employees);

        // Print employees after sorting
        System.out.println("\nAfter sorting by eid:");
        for (Employe e : employees) {
            System.out.println(e);
        }
    }
}
