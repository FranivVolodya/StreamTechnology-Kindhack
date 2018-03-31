package com.streamtechnology.service;

import com.streamtechnology.dto.GrannyFlatDTO;

import java.util.List;

public interface GrannyFlatService {
    List<GrannyFlatDTO> getFullData();

    List<GrannyFlatDTO> getRestrictedData();
}
