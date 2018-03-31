package com.streamtechnology.service;

import com.streamtechnology.entity.User;
import org.springframework.transaction.annotation.Transactional;

public interface UserServise {
    User getUserByEmail(String email);

    User getUser(Integer id);

    User registerUser(User user);

    User getUser(Long userId);
}
