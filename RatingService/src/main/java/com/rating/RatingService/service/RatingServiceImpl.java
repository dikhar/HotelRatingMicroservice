package com.rating.RatingService.service;


import com.rating.RatingService.entity.Rating;
import com.rating.RatingService.repo.Repositoryi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingServic {
    @Autowired
    private Repositoryi repository;
    @Override
    public Rating saveAllRate(Rating rating) {
        String random= UUID.randomUUID().toString();
        rating.setId(random);
        return repository.save(rating);
    }

    @Override
    public List<Rating> getAllRate() {
        return repository.findAll();
    }

    @Override
    public Rating getRate(String Id) {
        return repository.findById(Id).orElseThrow();
    }

    @Override
    public List<Rating> getHotelId(String HotelId) {
        return repository.findByHotelId(HotelId);
    }

    @Override
    public List<Rating> getUserId(String UserId) {
        return repository.findByUserId(UserId);
    }
}
