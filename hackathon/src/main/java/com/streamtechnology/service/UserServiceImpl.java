package com.streamtechnology.service;

import com.streamtechnology.entity.User;
import com.streamtechnology.entity.*;
import com.streamtechnology.repository.AddressRepository;
import com.streamtechnology.repository.RoomDetailRepository;
import com.streamtechnology.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServise {

    private AddressRepository addressRepository;
    private UserRepository userRepository;
    private RoomDetailRepository roomDetailRepository;

    public UserServiceImpl(AddressRepository addressRepository, UserRepository userRepository,
                           RoomDetailRepository roomDetailRepository) {
        this.addressRepository = addressRepository;
        this.userRepository = userRepository;
        this.roomDetailRepository = roomDetailRepository;
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User getUser(Integer id) {
        return null;
    }

    @Override
    public User registerUser(User user) {
        User existingUser = userRepository.findByEmail(user.getEmail());
        if (existingUser == null) {
            return userRepository.save(user);
        }
        throw new RuntimeException("Such email already exists.");
    }

    @Override
    public User getUser(Long userId) {
        return userRepository.findOne(userId);
    }
}
