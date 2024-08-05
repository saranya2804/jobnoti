package com.Job.Job_Notification.Controller;

import com.Job.Job_Notification.Entity.User;
import com.Job.Job_Notification.Service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class userController {
    @Autowired
    private Userservice userservice;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userservice.registerUser(user);
    }

    @PostMapping("/login")
    public User loginUser(@RequestParam String username, @RequestParam String password){
        return userservice.loginUser(username,password);
    }
}
