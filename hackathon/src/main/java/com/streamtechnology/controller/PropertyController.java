package com.streamtechnology.controller;

import com.streamtechnology.dto.GrannyFlatDTO;
import com.streamtechnology.dto.PropertyBasicDTO;
import com.streamtechnology.entity.UserRole;
import com.streamtechnology.service.GrannyService;
import com.streamtechnology.service.mappers.GrannyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/property")
public class PropertyController extends AbstractController {

    @Autowired
    private GrannyService grannyService;

    @PostMapping("/add-profile-info")
    public ResponseEntity addProfileInfo(@RequestBody GrannyFlatDTO grannyFlatDTO) {
        isAuthorized(UserRole.GRANNY);
        grannyService.addProfileInfo(GrannyMapper.map(grannyFlatDTO));
        return ResponseEntity.ok().build();
    }

    @GetMapping("/all/basic-info")
    public ResponseEntity<List<PropertyBasicDTO>> getBasicInfo() {
        List<PropertyBasicDTO>  grannyFlatDTOs = grannyService.getRestrictedData();
        return new ResponseEntity<List<PropertyBasicDTO>>(grannyFlatDTOs, HttpStatus.OK);
    }


    @GetMapping("/all/full-info")
    public ResponseEntity<List<GrannyFlatDTO>> getGrannys() {
        List<GrannyFlatDTO>  grannyFlatDTOs;
        grannyFlatDTOs = grannyService.getFullData();
        return new ResponseEntity<List<GrannyFlatDTO>>(grannyFlatDTOs, HttpStatus.OK);
    }

}
