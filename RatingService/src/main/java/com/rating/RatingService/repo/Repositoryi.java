package com.rating.RatingService.repo;

import com.rating.RatingService.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Repositoryi extends JpaRepository<Rating,String> {
    List<Rating> findByUserId(String UserId);

    List<Rating> findByHotelId(String HotelId);
}
