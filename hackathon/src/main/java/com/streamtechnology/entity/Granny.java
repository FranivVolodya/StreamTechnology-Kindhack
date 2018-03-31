package com.streamtechnology.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("GrannyUser")
public class Granny extends User{

    public Granny (){

    }
    @Column(name = "flat_mate_gender")
    private String flatMateGender;

    @Column(name = "flat_mate_age")
    private String flatMateAge;

    @Column(name = "flat_mate_info")
    private String flatMateInfo;

    @Column(name = "additional_requirements")
    private String additionalRequirements;

    public String getFlatMateGender() {
        return flatMateGender;
    }

    public void setFlatMateGender(String flatMateGender) {
        this.flatMateGender = flatMateGender;
    }

    public String getFlatMateAge() {
        return flatMateAge;
    }

    public void setFlatMateAge(String flatMateAge) {
        this.flatMateAge = flatMateAge;
    }

    public String getFlatMateInfo() {
        return flatMateInfo;
    }

    public void setFlatMateInfo(String flatMateInfo) {
        this.flatMateInfo = flatMateInfo;
    }

    public String getAdditionalRequirements() {
        return additionalRequirements;
    }

    public void setAdditionalRequirements(String additionalRequirements) {
        this.additionalRequirements = additionalRequirements;
    }
}
