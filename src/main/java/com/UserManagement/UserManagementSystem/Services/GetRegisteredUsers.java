package com.UserManagement.UserManagementSystem.Services;

import com.UserManagement.UserManagementSystem.Models.User;

import java.util.List;

public interface GetRegisteredUsers {
    public List<User> getUsers();
    public User fetchUser(int id);
    public User addUser(User u1);
    public User UpdateUser(User u1);
    public String DeleteUser(int id);
}
