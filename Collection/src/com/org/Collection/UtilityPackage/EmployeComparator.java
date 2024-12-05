package com.org.Collection.UtilityPackage;

import java.util.Comparator;

public class EmployeComparator  {

    int eid;
    String name;
    String email;

    // Default constructor
    EmployeComparator() {
        super();
    }

    // Parameterized constructor
    EmployeComparator(int eid, String name, String email) {
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


 
}
