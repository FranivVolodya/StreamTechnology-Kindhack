package com.streamtechnology.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sunny")
public class SunnyController {

    @PutMapping()
    public ResponseEntity<Void> addSunny (){
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
