package com.streamtechnology.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Sunny {
    @Column(name = "work_study")
    private String workStudy;

    @Column(name = "work_place")
    private String work_place;

    @Column(name = "photo")
    private String photo;

    @Column(name = "have_mate")
    private String haveMate;
}
