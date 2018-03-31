package com.streamtechnology.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "user_tb")
@Data
@Builder
public class User implements Serializable {
    private static final long serialVersionUID = -4455863780196120817L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "phone")
    private String phone;

    @Column(name = "data_of_birthday")
    private String dateOfBirthday;

    @Column(name = "bad_habits")
    private String badHabits;

    @Column(name = "animal")
    private boolean animal;

    @Column(name = "domestic_help")
    private boolean domesticHelp;

    @Column(name = "gender")
    private String gender;

    @Column(name = "info_about_me")
    private String infoAboutMe;

    @Column(name = "why_I_want_to_be_here")
    private String whyIWantToBeHere;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Address> address;
}