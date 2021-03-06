package com.UserManagement.UserManagementSystem.Models;

public class User {
    private int id;
    private String name;
    private String company;
    private String role;

    public User(int id, String name, String company, String role) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.role = role;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
