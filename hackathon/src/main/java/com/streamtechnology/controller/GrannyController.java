package com.streamtechnology.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("granny")
public class GrannyController {

    @PutMapping()
    public ResponseEntity<Void> addGranny() {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity getGranny() {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List> getGrannys(@RequestParam("id") int id, @RequestParam("quantity") int number) {
        return new ResponseEntity<List>(Collections.emptyList(), HttpStatus.OK);
    }

}
