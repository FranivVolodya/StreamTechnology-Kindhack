package com.streamtechnology.service;

import com.streamtechnology.entity.User;
import com.streamtechnology.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServise {
    @Autowired
    private UserDao userDao;

    public UserServiceImpl(){
    }

    @Override
    public  boolean addUser(User user){
            userDao.addUser(user);
    return  true;
    }

}
