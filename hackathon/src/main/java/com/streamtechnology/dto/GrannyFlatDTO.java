package com.streamtechnology.dto;

import com.streamtechnology.entity.Address;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

public class GrannyFlatDTO {

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
    private List<Address> address;
    private String flatMateGender;
    private String flatMateAge;
    private String flatMateInfo;
    private String additionalRequirements;
    private List<String> photo;
    private String matesNumber;
    private List<String> benefits;
    private Long rentPrice;
    private boolean readyDomesticHelp;
    private boolean domesticHelpInfo;

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

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
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

    public List<String> getPhoto() {
        return photo;
    }

    public void setPhoto(List<String> photo) {
        this.photo = photo;
    }

    public String getMatesNumber() {
        return matesNumber;
    }

    public void setMatesNumber(String matesNumber) {
        this.matesNumber = matesNumber;
    }

    public List<String> getBenefits() {
        return benefits;
    }

    public void setBenefits(List<String> benefits) {
        this.benefits = benefits;
    }

    public Long getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(Long rentPrice) {
        this.rentPrice = rentPrice;
    }

    public boolean isReadyDomesticHelp() {
        return readyDomesticHelp;
    }

    public void setReadyDomesticHelp(boolean readyDomesticHelp) {
        this.readyDomesticHelp = readyDomesticHelp;
    }

    public boolean isDomesticHelpInfo() {
        return domesticHelpInfo;
    }

    public void setDomesticHelpInfo(boolean domesticHelpInfo) {
        this.domesticHelpInfo = domesticHelpInfo;
    }

    public GrannyFlatDTO(String firstName, String lastName, String phone,
                         String dateOfBirthday, String badHabits, boolean animal,
                         boolean domesticHelp, String gender, String infoAboutMe,
                         String whyIWantToBeHere,  String flatMateGender,
                         String flatMateAge, String flatMateInfo, String additionalRequirements,
                         String matesNumber, Long rentPrice, boolean readyDomesticHelp, boolean domesticHelpInfo,
                         List<Address> address, List<String> benefits, List<String> photo) {
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

}
