package com.streamtechnology.dto;

import com.streamtechnology.entity.Address;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

public class GrannyFlatDTO {

    private String email;
    private String firstName;
    private String lastName;
    private String phone;
    private String dateOfBirthday;
    private String badHabits;
    private boolean animal;
    private boolean domesticHelp;
    private String gender;
    private String infoAboutMe;
    private String whyIWantToBeHere;
    private String address;
    private String flatMateGender;
    private String flatMateAge;
    private String flatMateInfo;
    private String additionalRequirements;
    private String photo;
    private int matesNumber;
    private String benefits;
    private Double rentPrice;
    private boolean readyDomesticHelp;
    private String domesticHelpInfo;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public GrannyFlatDTO() {

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getMatesNumber() {
        return matesNumber;
    }

    public void setMatesNumber(int matesNumber) {
        this.matesNumber = matesNumber;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public Double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(Double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public boolean isReadyDomesticHelp() {
        return readyDomesticHelp;
    }

    public void setReadyDomesticHelp(boolean readyDomesticHelp) {
        this.readyDomesticHelp = readyDomesticHelp;
    }

    public String getDomesticHelpInfo() {
        return domesticHelpInfo;
    }

    public void setDomesticHelpInfo(String domesticHelpInfo) {
        this.domesticHelpInfo = domesticHelpInfo;
    }

    public GrannyFlatDTO(String firstName, String lastName, String phone,
                         String dateOfBirthday, String badHabits, boolean animal,
                         boolean domesticHelp, String gender, String infoAboutMe,
                         String whyIWantToBeHere,  String flatMateGender,
                         String flatMateAge, String flatMateInfo, String additionalRequirements,
                         int matesNumber, Double rentPrice, boolean readyDomesticHelp, String domesticHelpInfo,
                         String address, String benefits, String photo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.dateOfBirthday = dateOfBirthday;
        this.badHabits = badHabits;
        this.animal = animal;
        this.domesticHelp = domesticHelp;
        this.gender = gender;
        this.infoAboutMe = infoAboutMe;
        this.whyIWantToBeHere = whyIWantToBeHere;
        this.address = address;
        this.flatMateGender = flatMateGender;
        this.flatMateAge = flatMateAge;
        this.flatMateInfo = flatMateInfo;
        this.additionalRequirements = additionalRequirements;
        this.photo = photo;
        this.matesNumber = matesNumber;
        this.benefits = benefits;
        this.rentPrice = rentPrice;
        this.readyDomesticHelp = readyDomesticHelp;
        this.domesticHelpInfo = domesticHelpInfo;
    }

    public GrannyFlatDTO(String firstName, String lastName, String phone,
                         String dateOfBirthday, String badHabits, boolean animal,
                         boolean domesticHelp, String gender, String infoAboutMe,
                         String whyIWantToBeHere,  String flatMateGender,
                         String flatMateAge, String flatMateInfo, String additionalRequirements) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.dateOfBirthday = dateOfBirthday;
        this.badHabits = badHabits;
        this.animal = animal;
        this.domesticHelp = domesticHelp;
        this.gender = gender;
        this.infoAboutMe = infoAboutMe;
        this.whyIWantToBeHere = whyIWantToBeHere;
        this.address = address;
        this.flatMateGender = flatMateGender;
        this.flatMateAge = flatMateAge;
        this.flatMateInfo = flatMateInfo;
        this.additionalRequirements = additionalRequirements;
    }

}
