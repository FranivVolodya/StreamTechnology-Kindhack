package com.streamtechnology.service;

import com.streamtechnology.dto.GrannyFlatDTO;
import com.streamtechnology.dto.PropertyBasicDTO;
import com.streamtechnology.dto.UserDTO;
import com.streamtechnology.entity.Address;
import com.streamtechnology.entity.Granny;
import com.streamtechnology.entity.RoomDetails;
import com.streamtechnology.repository.GrannyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
    @Transactional
    public List<GrannyFlatDTO> getFullData() {
        List<Granny> grannies = userServise.getAllGranny();
        List<GrannyFlatDTO>  grannyFlatDTOs = new ArrayList<>();
        for (Granny granny: grannies){
            RoomDetails room = granny.getRoomDetails().get(0);
            Address address = granny.getAddress().get(0);
            GrannyFlatDTO grannyFlatDTO = new GrannyFlatDTO(granny.getFirstName(), granny.getLastName(),
                    granny.getPhone(), granny.getDateOfBirthday(), granny.getBadHabits(), granny.isAnimal(),
                    granny.isDomesticHelp(), granny.getGender(), granny.getInfoAboutMe(), granny.getWhyIWantToBeHere(),
                    granny.getFlatMateGender(), granny.getFlatMateAge(), granny.getFlatMateInfo(), granny.getAdditionalRequirements(),
                    room.getMatesNumber(), room.getRentPrice(), granny.isDomesticHelp(), granny.getFlatMateInfo(), granny.getAddress(),
                    room.getBenefits(), room.getPhotos());
            grannyFlatDTOs.add(grannyFlatDTO);
        }
        return grannyFlatDTOs;
    }

    @Override
    public List<PropertyBasicDTO> getRestrictedData() {
        List<Granny> grannies = userServise.getAllGranny();
        List<PropertyBasicDTO> propetyDtos = new ArrayList<>();
        for (Granny granny: grannies){
            PropertyBasicDTO basicDTO = new PropertyBasicDTO();
            if (!granny.getRoomDetails().isEmpty()) {
                RoomDetails roomDetails = granny.getRoomDetails().get(0);
                basicDTO.setRooms(roomDetails.getMatesNumber());
                basicDTO.setPrice(roomDetails.getRentPrice());
                basicDTO.setDescription(roomDetails.getDomesticHelpInfo());
                basicDTO.setMeters(30 + new Random(20).nextInt());
                if (!granny.getAddress().isEmpty()) {
                    Address address = granny.getAddress().get(0);
                    basicDTO.setRegion(address.getCity());
                }
                propetyDtos.add(basicDTO);
            }


        }
        return propetyDtos;
    }

}
