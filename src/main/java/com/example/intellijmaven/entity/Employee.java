package com.example.intellijmaven.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String role;
//    private String department;
//    private String location;
//    private String supervisor;
//    private String salary;
//    private Date dateHired;



    public Employee() {}

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public Employee(Long id, String name, String role, Integer age) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String toString() {
        return String.format("Employee(id=%s, name=%s, role=%s)", id, name, role);
    }
}
