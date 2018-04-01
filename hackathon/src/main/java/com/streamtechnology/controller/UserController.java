package com.streamtechnology.controller;

import com.streamtechnology.dto.UserDTO;
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
    public void signUp(@RequestBody UserDTO userDTO) {
        userDTO.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        userServise.registerUser(userDTO);
    }

    @GetMapping("/ping")
    public String ping() {
        return "OK";
    }

    @GetMapping("/who-am-i")
    public Object user() {
        return SecurityContextHolder.getContext()
                .getAuthentication();
    }

}
