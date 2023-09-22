package com.rating.RatingService.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="rating")
public class Rating {
    @Id
    @Column(name="Id")
    private String Id;

    @Column(name="user_id")
    private String userId;
    @Column(name="hotel_id")
    private String hotelId;

    @Column(name="About")
    private String feedback;

}
