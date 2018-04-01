package com.streamtechnology.repository;

import com.streamtechnology.entity.RoomDetails;

import java.util.List;

public interface RoomDetailsDao {
    List<RoomDetails> searchRooms(Double bottomPrice, Double topPrice, Boolean domesticHelpRequired);
}
