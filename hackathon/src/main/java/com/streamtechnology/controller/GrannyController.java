package com.streamtechnology.controller;

import com.streamtechnology.dto.GrannyFlatDTO;
import com.streamtechnology.dto.ShortAppartmentDescriptionDTO;
import com.streamtechnology.entity.Address;
import com.streamtechnology.entity.UserRole;
import com.streamtechnology.service.GrannyService;
import com.streamtechnology.service.mappers.GrannyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/granny")
public class GrannyController extends AbstractController {

    @Autowired
    private GrannyService grannyService;

    @PostMapping("/add-profile-info")
    public ResponseEntity addProfileInfo(@RequestBody GrannyFlatDTO grannyFlatDTO) {
        isAuthorized(UserRole.GRANNY);
        grannyService.addProfileInfo(GrannyMapper.map(grannyFlatDTO));
        return ResponseEntity.ok().build();
    }

//    @GetMapping()
//    public ResponseEntity<GrannyFlatDTO> getGranny() {
//        return new ResponseEntity<GrannyFlatDTO>(getTmpGrannyFlatDTO(), HttpStatus.OK);
//    }
//
    private GrannyFlatDTO getTmpGrannyFlatDTO() {
        return new GrannyFlatDTO("Ім'я","Прізвище","+380670000000","07.08.1965",
                "Немає", false,false,"Жінка","Полюбляю настільні ігри",
                "Хочу допомогти студентам та веселіше проводити вечори :)","Чоловік/Жінка",
        "Немає значення","Не курить, не вживає алкоголь","5",3,
                200.0,true,"Прибирати у своїй кімнаті.",null,null,
                null);
    }


    @GetMapping("/all")
    public ResponseEntity<List<ShortAppartmentDescriptionDTO>> getShortAppartmentDescriptions() {
        List<ShortAppartmentDescriptionDTO>  grannyFlatDTOs = new ArrayList<>();
        ShortAppartmentDescriptionDTO dto = new ShortAppartmentDescriptionDTO("Залізничний", "Затишна квартира", 56,
                2, 250.0);
        ShortAppartmentDescriptionDTO dto1 = new ShortAppartmentDescriptionDTO("Франківський", "Гарний район", 34,
                3, 400.0);
        grannyFlatDTOs.add(dto);
        grannyFlatDTOs.add(dto1);
        return new ResponseEntity<List<ShortAppartmentDescriptionDTO>>(grannyFlatDTOs, HttpStatus.OK);
    }


    @GetMapping("/all/full-info")
    public ResponseEntity<List<GrannyFlatDTO>> getAllGrannys() {
        List<GrannyFlatDTO>  grannyFlatDTOs = new ArrayList<>();
        grannyFlatDTOs.add(getTmpGrannyFlatDTO());
        grannyFlatDTOs.add(getTmpGrannyFlatDTO());
        return new ResponseEntity<List<GrannyFlatDTO>>(grannyFlatDTOs, HttpStatus.OK);
    }


    @GetMapping("/")
    public ResponseEntity<List<GrannyFlatDTO>> getGrannys() {
        List<GrannyFlatDTO>  grannyFlatDTOs;
        grannyFlatDTOs = grannyService.getFullData();
        return new ResponseEntity<List<GrannyFlatDTO>>(grannyFlatDTOs, HttpStatus.OK);
    }

}
