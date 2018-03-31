package com.streamtechnology.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "user_tb")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="user_type",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value="User")
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -4455863780196120817L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "first_name")
    protected String firstName;

    @Column(name = "last_name")
    protected String lastName;

    @Column(name = "phone")
    protected String phone;

    @Column(name = "email")
    protected String email;

    @Column(name = "password")
    private String password;

    @Column(name = "data_of_birthday")
    protected String dateOfBirthday;

    @Column(name = "bad_habits")
    protected String badHabits;

    @Column(name = "animal")
    protected boolean animal;

    @Column(name = "domestic_help")
    protected boolean domesticHelp;

    @Column(name = "gender")
    protected String gender;

    @Column(name = "info_about_me")
    protected String infoAboutMe;

    @Column(name = "why_I_want_to_be_here")
    protected String whyIWantToBeHere;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    protected List<Address> address;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    protected List<RoomDetails> roomDetails;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private UserRole userRole;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public String getBadHabits() {
        return badHabits;
    }

    public void setBadHabits(String badHabits) {
        this.badHabits = badHabits;
    }

    public boolean isAnimal() {
        return animal;
    }

    public void setAnimal(boolean animal) {
        this.animal = animal;
    }

    public boolean isDomesticHelp() {
        return domesticHelp;
    }

    public void setDomesticHelp(boolean domesticHelp) {
        this.domesticHelp = domesticHelp;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getInfoAboutMe() {
        return infoAboutMe;
    }

    public void setInfoAboutMe(String infoAboutMe) {
        this.infoAboutMe = infoAboutMe;
    }

    public String getWhyIWantToBeHere() {
        return whyIWantToBeHere;
    }

    public void setWhyIWantToBeHere(String whyIWantToBeHere) {
        this.whyIWantToBeHere = whyIWantToBeHere;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public List<RoomDetails> getRoomDetails() {
        return roomDetails;
    }

    public void setRoomDetails(List<RoomDetails> roomDetails) {
        this.roomDetails = roomDetails;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }
}