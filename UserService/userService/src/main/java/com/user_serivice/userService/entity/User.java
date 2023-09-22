package com.user_serivice.userService.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="microuser")
public class User {
    @Id
    @Column(name="Id")
    private String user_Id;
    @Column(name="hotel_id")
    private String hotel_id;
    @Column(name="rating_id")
    private String rating_id;
    @Column(name="Name")
    private String name;
    @Column(name="Mail")
    private String mail;
    @Column(name="About")
    private String about;
    @Transient
    private List<Rating> ratings=new ArrayList<>();

}
