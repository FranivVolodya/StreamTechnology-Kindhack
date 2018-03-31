package com.streamtechnology.dto.mappers;

import com.streamtechnology.dto.UserDTO;
import com.streamtechnology.entity.Granny;
import com.streamtechnology.entity.Sunny;

public class UserMapper {

    public static Granny toGranny(UserDTO userDTO) {
        Granny granny = new Granny();
        granny.setEmail(userDTO.getEmail());
        granny.setFirstName(userDTO.getFirstName());
        granny.setLastName(userDTO.getLastName());
        granny.setPassword(userDTO.getPassword());
        granny.setUserRole(userDTO.getUserRole());
        return granny;
    }

    public static Sunny toSunny(UserDTO userDTO) {
        Sunny sunny = new Sunny();
        sunny.setEmail(userDTO.getEmail());
        sunny.setFirstName(userDTO.getFirstName());
        sunny.setLastName(userDTO.getLastName());
        sunny.setPassword(userDTO.getPassword());
        sunny.setUserRole(userDTO.getUserRole());
        return sunny;
    }



}
