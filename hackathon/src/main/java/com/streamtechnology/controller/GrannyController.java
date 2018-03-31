package com.streamtechnology.controller;

import com.streamtechnology.dto.GrannyFlatDTO;
import com.streamtechnology.entity.Granny;
import com.streamtechnology.service.GrannyFlatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("granny")
public class GrannyController {

    @Autowired
    GrannyFlatService grannyFlatService;

    @PutMapping()
    public ResponseEntity<Void> addGranny(Granny granny) {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

//    private GrannyFlatDTO getTmpGrannyFlatDTO() {
//
//
//        return new GrannyFlatDTO("Марія","Ящір","+3806793540971","07.08.1965",
//                "курю в ліжку", false,false,"femail","гаряча бабка","бо я реальна бабка","",
//        "хлоп, блондин","не курить","5","300",200L,true,false,null,null, null);
//    }

    @GetMapping("/")
    public ResponseEntity<List<GrannyFlatDTO>> getGrannys(@RequestParam("id") int id, @RequestParam("quantity") int number) {
        List<GrannyFlatDTO>  grannyFlatDTOs;
        grannyFlatDTOs = grannyFlatService.getFullData();

        return new ResponseEntity<List<GrannyFlatDTO>>(grannyFlatDTOs, HttpStatus.OK);
    }

}
