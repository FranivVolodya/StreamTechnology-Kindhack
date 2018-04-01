package com.streamtechnology.dto;

public class AddRoomDTO {

    private String email;
    private String photos;
    private Integer matesNumber;
    private String benefits;
    private Double rentPrice;
    private Boolean domesticHelp;
    private String domesticHelpInfo;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhotos() {
        return photos;
    }

    public void setPhotos(String photos) {
        this.photos = photos;
    }

    public Integer getMatesNumber() {
        return matesNumber;
    }

    public void setMatesNumber(Integer matesNumber) {
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

    public Boolean getDomesticHelp() {
        return domesticHelp;
    }

    public void setDomesticHelp(Boolean domesticHelp) {
        this.domesticHelp = domesticHelp;
    }

    public String getDomesticHelpInfo() {
        return domesticHelpInfo;
    }

    public void setDomesticHelpInfo(String domesticHelpInfo) {
        this.domesticHelpInfo = domesticHelpInfo;
    }
}
