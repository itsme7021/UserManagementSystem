package com.UserManagement.UserManagementSystem.Services;

import com.UserManagement.UserManagementSystem.Models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class service implements GetRegisteredUsers{
    private List<User> UsersList;

    public service()
    {
        UsersList = new ArrayList<>();
        UsersList.add(new User(101 , "ayush" , "gd" , "sahdv"));
        UsersList.add(new User(102 , "goua" , "gdewjbd" , "sah"));
        UsersList.add(new User(103 , "ayu" , "gd223" , "sahdvsdjb"));
    }

    @Override
    public List<User> getUsers() {
        return UsersList;
    }

    @Override
    public User fetchUser(int id) {
        User u1= null;
        for(User u : UsersList)
        {
            if(u.getId() == id)
            {
                u1 = u;
                break;
            }
        }
        return u1;
    }

    @Override
    public User addUser(User u1) {
        UsersList.add(u1);
        return u1;
    }

    @Override
    public User UpdateUser(User u1) {
        int j=0;
        for(User u : UsersList)
        {
            if(u.getId() == u1.getId())
            {
                UsersList.set(j , u1);
            }
            j++;
        }
        return u1;
    }

    @Override
    public String DeleteUser(int id) {
        for(User u : UsersList)
        {
            if(u.getId() == id)
            {
                UsersList.remove(u);
                break;
            }
        }

        return "User with id = " + id + " DELETED";
    }


}
