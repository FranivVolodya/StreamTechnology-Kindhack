package com.streamtechnology.dto.mappers;

import com.streamtechnology.dto.AddRoomDTO;
import com.streamtechnology.dto.RoomDTO;
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

    public static RoomDTO map(RoomDetails roomDetails) {
        RoomDTO roomDTO = new RoomDTO();
        roomDTO.setId(Long.valueOf(roomDetails.getRoomId()));
        roomDTO.setPhotos(roomDetails.getPhotos());
        roomDTO.setMatesNumber(roomDetails.getMatesNumber());
        roomDTO.setBenefits(roomDetails.getBenefits());
        roomDTO.setRentPrice(roomDetails.getRentPrice());
        roomDTO.setDomesticHelp(roomDetails.isDomesticHelp());
        roomDTO.setDomesticHelpInfo(roomDetails.getDomesticHelpInfo());
        return roomDTO;
    }
}
