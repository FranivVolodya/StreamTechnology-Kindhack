package com.streamtechnology.controller;

import com.streamtechnology.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class SearchController {

    @Autowired
    private SearchService searchService;

    @GetMapping("/")
    public ResponseEntity findRooms(@RequestParam(value = "bottomPrice", required = false) Double bottomPrice,
                                             @RequestParam(value = "topPrice", required = false) Double topPrice,
                                             @RequestParam(value = "domesticHelpRequired", required = false) Boolean domesticHelpRequired) {
        return ResponseEntity.ok(searchService.findRooms(bottomPrice, topPrice, domesticHelpRequired));
    }

}
