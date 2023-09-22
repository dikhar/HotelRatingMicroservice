package com.hotel.HotelService.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="HotelDb")
public class Hotel {
    @Id
    @Column(name="Id")
    private String user_id;
    @Column(name = "Name")
    private String name;
    @Column(name="Location")
    private String location;
    @Column(name="About")
    private String about;
}
