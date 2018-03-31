package com.streamtechnology.controller;

import com.streamtechnology.entity.User;
import com.streamtechnology.entity.UserRole;
import com.streamtechnology.service.UserServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AuthorizationServiceException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

public abstract class AbstractController {

    @Autowired
    UserServise userServise;

    public void isAuthorized(UserRole role) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        User account = userServise.getUserByEmail(auth.getName());
        if (!account.getRole().equals(role)) {
            throw new AuthorizationServiceException("User is not allows to access the service");
        }

    }


}
