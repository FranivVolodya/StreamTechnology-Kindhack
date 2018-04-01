package com.streamtechnology.dto.mappers;

import com.streamtechnology.dto.AddRoomDTO;
import com.streamtechnology.entity.Address;
import com.streamtechnology.entity.RoomDetails;

public class RoomMapper {

    public static RoomDetails map(AddRoomDTO dto) {
        RoomDetails roomDetails = new RoomDetails();
        roomDetails.setPhotos(dto.getPhotos());
        roomDetails.setMatesNumber(dto.getMatesNumber());
        roomDetails.setBenefits(dto.getBenefits());
        roomDetails.setRentPrice(dto.getRentPrice());
        roomDetails.setDomesticHelp(dto.getDomesticHelp());
        roomDetails.setDomesticHelpInfo(dto.getDomesticHelpInfo());
        return roomDetails;
    }
}
