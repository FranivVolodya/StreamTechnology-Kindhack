package com.streamtechnology.service;

import com.streamtechnology.dto.AddRoomDTO;
import com.streamtechnology.dto.GrannyFlatDTO;
import com.streamtechnology.dto.PropertyBasicDTO;
import com.streamtechnology.dto.UserDTO;
import com.streamtechnology.entity.Granny;
import com.streamtechnology.entity.RoomDetails;

import java.util.List;

public interface GrannyService {

    void updateProfileInfo(Granny granny);

    void addRoom(AddRoomDTO addRoomDTO);

    GrannyFlatDTO getProfileInfo(String email);

    List<GrannyFlatDTO> getFullData();

    List<PropertyBasicDTO> getRestrictedData();

}
