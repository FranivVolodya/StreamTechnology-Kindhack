package com.streamtechnology.controller;

import com.streamtechnology.entity.UserRole;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class PrivateController extends AbstractController {

    @GetMapping("/sayHello")
    public String sayHello() {
        isAuthorized(UserRole.GRANNY);
        return "sayHelloPrivate";
    }

}
