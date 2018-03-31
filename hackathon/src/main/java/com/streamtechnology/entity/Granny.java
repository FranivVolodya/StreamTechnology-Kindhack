package com.streamtechnology.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "granny_tb")
@Data
@Builder
public class Granny extends User{

    @Column(name = "flat_mate_gender")
    private String flatMateGender;

    @Column(name = "flat_mate_age")
    private String flatMateAge;

    @Column(name = "flat_mate_info")
    private String flatMateInfo;

    @Column(name = "additional_requirements")
    private String additionalRequirements;
}
