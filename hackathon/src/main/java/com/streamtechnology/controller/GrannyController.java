package com.streamtechnology.controller;

import com.streamtechnology.dto.GrannyFlatDTO;
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
        return new GrannyFlatDTO("Марія","Ящір","+3806793540971","07.08.1965",
                "курю в ліжку", false,false,"femail","гаряча бабка","бо я реальна бабка","",
        "хлоп, блондин","не курить","5",300,200.0,true,"",null,null, null);
    }

    @GetMapping("/")
    public ResponseEntity<List<GrannyFlatDTO>> getGrannys(@RequestParam("id") int id, @RequestParam("quantity") int number) {
        List<GrannyFlatDTO>  grannyFlatDTOs;
        grannyFlatDTOs = grannyService.getFullData();

        return new ResponseEntity<List<GrannyFlatDTO>>(grannyFlatDTOs, HttpStatus.OK);
    }

}
