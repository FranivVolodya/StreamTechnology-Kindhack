package com.streamtechnology.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "room_details_tb")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoomDetails {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "room_id")
    private Integer roomId;

    //TODO comma separated file location img
    @Column(name = "photos")
    private String photos;

    @Column(name = "mates_number")
    private Integer matesNumber;

    //TODO comma separated benefits img
    @Column(name = "benefits")
    private String benefits;

    @Column(name = "rent_price")
    private Double rentPrice;

    @Column(name = "domestic_help")
    private boolean domesticHelp;

    @Column(name = "domestic_help_info")
    private String domesticHelpInfo;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
