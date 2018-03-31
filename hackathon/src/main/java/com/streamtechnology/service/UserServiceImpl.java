package com.streamtechnology.service;

import com.streamtechnology.entity.*;
import com.streamtechnology.repository.AddressRepository;
import com.streamtechnology.repository.RoomDetailRepository;
import com.streamtechnology.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    private Granny getUser() {
        Granny granny = new Granny();
        granny.setFirstName("d");
        granny.setLastName("d");
        granny.setUserRoles(UserRoles.GRANNY);
        return granny;
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
        RoomDetails roomDetails = new RoomDetails();
        roomDetails.setBenefits("sa");
        roomDetails.setDomesticHelp(true);
        roomDetails.setMatesNumber(5);
        roomDetails.setUser(user);

        userRepository.save(user);
        addressRepository.save(address);
        roomDetailRepository.save(roomDetails);
        return true;
    }

    @Override
    public User getUser(Integer userId) {
        return userRepository.findOne(userId);
    }
}
