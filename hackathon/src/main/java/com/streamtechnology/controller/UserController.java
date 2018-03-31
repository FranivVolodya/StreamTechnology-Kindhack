package com.streamtechnology.controller;

import com.streamtechnology.entity.User;
import com.streamtechnology.service.UserServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    BCryptPasswordEncoder passwordEncoder;

    @Autowired
    UserServise userServise;

    @PostMapping("/sign-up")
    public void signUp(@RequestBody User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userServise.registerUser(user);
    }

    @GetMapping("/ping")
    public String ping() {
        return "OK";
    }

    @GetMapping("/whoami")
    public Object user() {
        return SecurityContextHolder.getContext()
                .getAuthentication();
    }

}
