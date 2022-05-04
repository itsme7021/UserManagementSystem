package com.UserManagement.UserManagementSystem.Comntrollers;

import com.UserManagement.UserManagementSystem.Models.User;
import com.UserManagement.UserManagementSystem.Services.GetRegisteredUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controller {

    @Autowired
    private GetRegisteredUsers fetch;
    //get data of users

    @GetMapping("/users")
    public List<User> getAllUsers()
    {
        return this.fetch.getUsers();
    }

    @GetMapping("/users/{UserId}")
    public User getUser(@PathVariable String UserId)
    {
        return this.fetch.fetchUser(Integer.parseInt(UserId));
    }

    @PostMapping("/users")
    public User RegisterNewUser(@RequestBody User u1)
    {
        return this.fetch.addUser(u1);
    }

    @PutMapping("/users")
    public User UpdateRegisteredUser(@RequestBody User u1)
    {
        return this.fetch.UpdateUser(u1);
    }

    @DeleteMapping("/users/{UserId}")
    public String DeleteRegisteredUser(@PathVariable String UserId)
    {
        return this.fetch.DeleteUser(Integer.parseInt(UserId));
    }
}
