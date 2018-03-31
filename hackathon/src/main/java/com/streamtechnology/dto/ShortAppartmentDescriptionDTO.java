package com.streamtechnology.dto;

public class ShortAppartmentDescriptionDTO {

    private String region;
    private String description;
    private Integer meters;
    private Integer rooms;
    private Double price;

    public ShortAppartmentDescriptionDTO() {

    }

    public ShortAppartmentDescriptionDTO(String region, String description, Integer meters, Integer rooms, Double price) {
        this.region = region;
        this.description = description;
        this.meters = meters;
        this.rooms = rooms;
        this.price = price;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getMeters() {
        return meters;
    }

    public void setMeters(Integer meters) {
        this.meters = meters;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
