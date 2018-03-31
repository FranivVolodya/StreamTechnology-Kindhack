package com.streamtechnology.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "room_details_tb")
@Data
@Builder
public class RoomDetails {
    @Column(name = "photo")
    private List<String> photo;

    @Column(name = "mates_number")
    private String matesNumber;

    @Column(name = "benefits")
    private List<String> benefits;

    @Column(name = "rent_price")
    private Long rentPrice;

    @Column(name = "domestic_help")
    private boolean domesticHelp;

    @Column(name = "domestic_help_info")
    private boolean domesticHelpInfo;
}
