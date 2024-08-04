package com.Job.Job_Notification.Service;

import com.Job.Job_Notification.Entity.User;
import com.Job.Job_Notification.Repository.userrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userservice {
    @Autowired
    private userrepo repository;
    public User loginUser(String username, String password) {
        User user = repository.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public User registerUser(User user) {
        return repository.save(user);
    }
}
