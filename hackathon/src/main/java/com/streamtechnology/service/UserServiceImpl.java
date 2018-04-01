package com.streamtechnology.service;

import com.streamtechnology.entity.Granny;
import com.streamtechnology.dto.UserDTO;
import com.streamtechnology.dto.mappers.UserMapper;
import com.streamtechnology.entity.User;
import com.streamtechnology.entity.UserRole;
import com.streamtechnology.repository.AddressRepository;
import com.streamtechnology.repository.GrannyRepository;
import com.streamtechnology.repository.RoomDetailRepository;
import com.streamtechnology.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserServise {

    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private GrannyRepository grannyRepository;
    @Autowired
    private RoomDetailRepository roomDetailRepository;

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public User getUser(Integer id) {
        return null;
    }

    @Override
    public User registerUser(UserDTO userDTO) {
        User existingUser = userRepository.findByEmail(userDTO.getEmail());
        if (existingUser == null) {
            if (UserRole.GRANNY.equals(userDTO.getUserRole())) {
                return grannyRepository.saveAndFlush(UserMapper.toGranny(userDTO));
            } else if (UserRole.SUNNY.equals(userDTO.getUserRole())) {

            }
        }
        throw new RuntimeException("Such email already exists.");
    }

    @Override
    public User getUser(Long userId) {
        return userRepository.findOne(userId);
    }

    @Override
    public List<Granny> getAllGranny() {
        return grannyRepository.findAllByUserRole(UserRole.GRANNY);
    }

}
