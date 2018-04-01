package com.streamtechnology.service;

import com.streamtechnology.dto.GrannyFlatDTO;
import com.streamtechnology.dto.PropertyBasicDTO;
import com.streamtechnology.dto.UserDTO;
import com.streamtechnology.entity.Granny;

import java.util.List;

public interface GrannyService {

    void addProfileInfo(Granny granny);

    GrannyFlatDTO getProfileInfo(String email);

    List<GrannyFlatDTO> getFullData();

    List<PropertyBasicDTO> getRestrictedData();

}
