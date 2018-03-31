package com.streamtechnology.service;

import com.streamtechnology.dto.GrannyFlatDTO;
import com.streamtechnology.dto.UserDTO;
import com.streamtechnology.entity.Granny;

import java.util.List;

public interface GrannyService {

    void addProfileInfo(Granny granny);

    List<GrannyFlatDTO> getFullData();

    List<GrannyFlatDTO> getRestrictedData();

}
