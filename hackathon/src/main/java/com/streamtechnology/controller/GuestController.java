package com.streamtechnology.controller;

import com.streamtechnology.dto.PropertyBasicDTO;
import com.streamtechnology.service.GrannyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GrannyService grannyService;

    @GetMapping("/room-list")
    public ResponseEntity<List<PropertyBasicDTO>> getBasicInfo() {
        List<PropertyBasicDTO> grannyFlatDTOs = grannyService.getRestrictedData();
        return new ResponseEntity<List<PropertyBasicDTO>>(grannyFlatDTOs, HttpStatus.OK);
    }

}
