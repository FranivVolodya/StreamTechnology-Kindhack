package com.streamtechnology.service;

import com.streamtechnology.dto.AddRoomDTO;
import com.streamtechnology.dto.GrannyFlatDTO;
import com.streamtechnology.dto.PropertyBasicDTO;
import com.streamtechnology.dto.UserDTO;
import com.streamtechnology.dto.mappers.RoomMapper;
import com.streamtechnology.entity.Address;
import com.streamtechnology.entity.Granny;
import com.streamtechnology.entity.RoomDetails;
import com.streamtechnology.repository.GrannyRepository;
import com.streamtechnology.repository.RoomDetailRepository;
import com.streamtechnology.service.mappers.GrannyMapper;
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
    RoomDetailRepository roomDetailRepository;

    @Autowired
    UserServise userServise;

    @Override
    @Transactional
    public void updateProfileInfo(Granny updatedGranny) {
        Granny existingGranny = grannyRepository.findByEmail(updatedGranny.getEmail());
        if (existingGranny == null) {
            throw new RuntimeException("No such email found");
        }
        GrannyMapper.copy(updatedGranny, existingGranny);
    }

    @Override
    @Transactional
    public void addRoom(AddRoomDTO addRoomDTO) {
        Granny existingGranny = grannyRepository.findByEmail(addRoomDTO.getEmail());
        if (existingGranny == null) {
            throw new RuntimeException("No such email found");
        }
        RoomDetails roomDetails = RoomMapper.map(addRoomDTO);
        roomDetails.setUser(existingGranny);
        roomDetailRepository.save(roomDetails);
    }

    @Override
    public GrannyFlatDTO getProfileInfo(String email) {
        Granny granny = grannyRepository.findByEmail(email);
        if (granny == null) {
            throw new RuntimeException("No such email found");
        }
        return new GrannyFlatDTO(granny.getFirstName(), granny.getLastName(), granny.getPhone(), granny.getDateOfBirthday(),
                granny.getBadHabits(), granny.isAnimal(), granny.isDomesticHelp(), granny.getGender(), granny.getInfoAboutMe(),
                granny.getWhyIWantToBeHere(), granny.getFlatMateGender(), granny.getFlatMateAge(), granny.getFlatMateInfo(),
                granny.getAdditionalRequirements());
    }

    @Override
    @Transactional
    public List<GrannyFlatDTO> getFullData() {
        List<Granny> grannies = userServise.getAllGranny();
        List<GrannyFlatDTO>  grannyFlatDTOs = new ArrayList<>();
        Address address;
        for (Granny granny: grannies){
            for (RoomDetails room : granny.getRoomDetails()) {
                address = granny.getAddress().get(0);
                GrannyFlatDTO grannyFlatDTO = new GrannyFlatDTO(granny.getFirstName(), granny.getLastName(),
                        granny.getPhone(), granny.getDateOfBirthday(), granny.getBadHabits(), granny.isAnimal(),
                        granny.isDomesticHelp(), granny.getGender(), granny.getInfoAboutMe(), granny.getWhyIWantToBeHere(),
                        granny.getFlatMateGender(), granny.getFlatMateAge(), granny.getFlatMateInfo(), granny.getAdditionalRequirements(),
                        room.getMatesNumber(), room.getRentPrice(), granny.isDomesticHelp(), granny.getFlatMateInfo(), "",
                        room.getBenefits(), room.getPhotos());
                if (!granny.getAddress().isEmpty()) {
                    grannyFlatDTO.setAddress(address.getCity());
                }
                grannyFlatDTOs.add(grannyFlatDTO);
            }
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
