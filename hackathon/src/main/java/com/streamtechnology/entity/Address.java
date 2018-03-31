package com.streamtechnology.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "address_tb")
@Data
@Builder
public class Address implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "address_id")
    private Integer addressId;
    @Column(name = "address_street",length=500)
    private String street;
    @Column(name = "city", nullable = false, length=250)
    private String city;
    @Column(name = "zipcode", nullable = false, length=20)
    private String zipcode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}