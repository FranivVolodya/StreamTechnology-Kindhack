package com.streamtechnology.service;

import com.streamtechnology.entity.User;
import org.springframework.transaction.annotation.Transactional;

public interface UserServise {
     boolean saveUser(User u);


}
