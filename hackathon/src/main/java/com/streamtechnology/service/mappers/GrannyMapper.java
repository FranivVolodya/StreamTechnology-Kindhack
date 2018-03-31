package com.streamtechnology.service.mappers;

import com.streamtechnology.dto.GrannyFlatDTO;
import com.streamtechnology.entity.Granny;
import com.streamtechnology.entity.RoomDetails;

import java.util.Arrays;

public class GrannyMapper {

    public static Granny map(GrannyFlatDTO grannyFlatDTO) {
        Granny granny = new Granny();
        granny.setFirstName(grannyFlatDTO.getFirstName());
        granny.setLastName(grannyFlatDTO.getLastName());
        granny.setPhone(grannyFlatDTO.getPhone());
        granny.setDateOfBirthday(grannyFlatDTO.getDateOfBirthday());
        granny.setAnimal(grannyFlatDTO.isAnimal());
        granny.setDomesticHelp(grannyFlatDTO.isDomesticHelp());
        granny.setGender(grannyFlatDTO.getGender());
        granny.setInfoAboutMe(grannyFlatDTO.getInfoAboutMe());
        granny.setWhyIWantToBeHere(grannyFlatDTO.getWhyIWantToBeHere());
        granny.setAddress(grannyFlatDTO.getAddress());
        granny.setFlatMateGender(grannyFlatDTO.getFlatMateGender());
        granny.setFlatMateAge(grannyFlatDTO.getFlatMateAge());
        granny.setFlatMateInfo(grannyFlatDTO.getFlatMateInfo());
        granny.setAdditionalRequirements(grannyFlatDTO.getAdditionalRequirements());
        RoomDetails roomDetails = new RoomDetails();
        roomDetails.setPhotos(grannyFlatDTO.getPhoto());
        roomDetails.setMatesNumber(grannyFlatDTO.getMatesNumber());
        roomDetails.setBenefits(grannyFlatDTO.getBenefits());
        roomDetails.setRentPrice(Double.valueOf(grannyFlatDTO.getRentPrice()));
        roomDetails.setDomesticHelp(grannyFlatDTO.isReadyDomesticHelp());
        roomDetails.setDomesticHelpInfo(grannyFlatDTO.getDomesticHelpInfo());
        granny.setRoomDetails(Arrays.asList(roomDetails));
        return granny;
    }

}
