package com.streamtechnology.service;

import com.streamtechnology.dto.GrannyFlatDTO;
import com.streamtechnology.entity.Address;
import com.streamtechnology.entity.Granny;
import com.streamtechnology.entity.RoomDetails;
import com.streamtechnology.repository.GrannyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GrannyServiceImpl implements GrannyService {

    @Autowired
    GrannyRepository grannyRepository;

    @Autowired
    UserServise userServise;

    @Override
    public void addProfileInfo(Granny granny) {
        grannyRepository.saveAndFlush(granny);
    }

    @Override
    public List<GrannyFlatDTO> getFullData() {
        List<Granny> grannies = userServise.getAllGranny();
        List<GrannyFlatDTO>  grannyFlatDTOs = new ArrayList<>();
        RoomDetails room;
        Address address;
        GrannyFlatDTO grannyFlatDTO;
        for (Granny granny: grannies){
            room = granny.getRoomDetails().get(0);
            address = granny.getAddress().get(0);
            grannyFlatDTO = new GrannyFlatDTO(granny.getFirstName(), granny.getLastName(),
                    granny.getPhone(), granny.getDateOfBirthday(), granny.getBadHabits(), granny.isAnimal(),
                    granny.isDomesticHelp(), granny.getGender(), granny.getInfoAboutMe(), granny.getWhyIWantToBeHere(),
                    granny.getFlatMateGender(), granny.getFlatMateAge(), granny.getFlatMateInfo(), granny.getAdditionalRequirements(),
                    room.getMatesNumber(), room.getRentPrice(), granny.isDomesticHelp(), granny.getFlatMateInfo(), address.getCity(),
                    room.getBenefits(), room.getPhotos());
            grannyFlatDTOs.add(grannyFlatDTO);
        }
        return grannyFlatDTOs;
    }

    @Override
    public List<GrannyFlatDTO> getRestrictedData() {
        return null;
    }

}
