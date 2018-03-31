package com.streamtechnology.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SunnyUser")
public class Sunny extends User {
    @Column(name = "work_study")
    private String workStudy;

    @Column(name = "work_place")
    private String work_place;

    @Column(name = "photo")
    private String photo;

    @Column(name = "have_mate")
    private String haveMate;

    public String getWorkStudy() {
        return workStudy;
    }

    public void setWorkStudy(String workStudy) {
        this.workStudy = workStudy;
    }

    public String getWork_place() {
        return work_place;
    }

    public void setWork_place(String work_place) {
        this.work_place = work_place;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getHaveMate() {
        return haveMate;
    }

    public void setHaveMate(String haveMate) {
        this.haveMate = haveMate;
    }
}
