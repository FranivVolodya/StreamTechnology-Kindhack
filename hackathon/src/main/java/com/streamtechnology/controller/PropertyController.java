package com.streamtechnology.controller;

import com.streamtechnology.dto.GrannyFlatDTO;
import com.streamtechnology.entity.UserRole;
import com.streamtechnology.service.GrannyService;
import com.streamtechnology.service.mappers.GrannyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.List;

@RestController
@RequestMapping("/private")
public class PropertyController extends AbstractController {

    @Autowired
    private GrannyService grannyService;

    @PostMapping("/update-profile-info")
    public ResponseEntity addProfileInfo(@RequestBody GrannyFlatDTO grannyFlatDTO) {
        isAuthorized(UserRole.GRANNY);
        grannyService.addProfileInfo(GrannyMapper.map(grannyFlatDTO));
        return ResponseEntity.ok().build();
    }

    @GetMapping("/get-profile-info/{email}")
    public ResponseEntity<GrannyFlatDTO> getProfileInfo(@PathVariable("email") String email) throws UnsupportedEncodingException {
        return ResponseEntity.ok(grannyService.getProfileInfo(new String(Base64.getDecoder().decode(email), "UTF-8")));
    }

    @GetMapping("/room-list")
    public ResponseEntity<List<GrannyFlatDTO>> getGrannys() {
        List<GrannyFlatDTO>  grannyFlatDTOs;
        grannyFlatDTOs = grannyService.getFullData();
        return new ResponseEntity<List<GrannyFlatDTO>>(grannyFlatDTOs, HttpStatus.OK);
    }

}
