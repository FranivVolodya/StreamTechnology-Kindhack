package com.streamtechnology.service;

import com.streamtechnology.dto.RoomDTO;
import com.streamtechnology.dto.mappers.RoomMapper;
import com.streamtechnology.entity.RoomDetails;
import com.streamtechnology.repository.RoomDetailRepository;
import com.streamtechnology.repository.RoomDetailsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SearchService {

    @Autowired
    private RoomDetailsDao roomDetailsDao;

    public List<RoomDTO> findRooms(Double bottomPrice, Double topPrice, Boolean domesticHelpRequired) {
        List<RoomDetails> roomDetails = roomDetailsDao.searchRooms(bottomPrice, topPrice, domesticHelpRequired);
        return roomDetails.stream().map(RoomMapper::map).collect(Collectors.toList());
    }

}
