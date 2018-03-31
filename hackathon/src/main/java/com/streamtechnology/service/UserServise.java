package com.streamtechnology.service;

import com.streamtechnology.entity.Granny;
import com.streamtechnology.entity.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserServise {
    User getUserByEmail(String email);

    User getUser(Integer id);
    List<Granny> getAllGranny();

    User registerUser(User user);

    User getUser(Long userId);
}
