package com.streamtechnology.service;

import com.streamtechnology.entity.Address;
import com.streamtechnology.entity.User;
import com.streamtechnology.entity.UserRoles;
import com.streamtechnology.repository.AddressRepository;
import com.streamtechnology.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserServise{

    private AddressRepository addressRepository;
    private UserRepository userRepository;

    public UserServiceImpl(AddressRepository addressRepository, UserRepository userRepository) {
        this.addressRepository = addressRepository;
        this.userRepository = userRepository;
    }

    private User getUser() {
        return User.builder()
                .firstName("f")
                .lastName("l")
                .userRoles(UserRoles.GRANNY)
                .build();
    }

    @Transactional
    @Override
    public boolean saveUser(User u) {
        User user = getUser();
        Address address = Address.builder()
                .city("C")
                .street("s")
                .zipcode("s")
                .user(user)
                .build();

        userRepository.save(user);
        addressRepository.save(address);
        return true;
    }

    @Override
    public User getUser(Integer userId) {
        return userRepository.findOne(userId);
    }
}
