package com.rating.RatingService.controlller;

import com.rating.RatingService.entity.Rating;
import com.rating.RatingService.service.RatingServic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {
    @Autowired
    private RatingServic ratingServic;
    @PostMapping
    public ResponseEntity<Rating> create(@RequestBody Rating rating)
    {
        Rating rating1=ratingServic.saveAllRate(rating);
        return ResponseEntity.status(HttpStatus.CREATED).body(rating1);
    }

    @RequestMapping("/allrating")
    public  ResponseEntity<List<Rating>> getAll()
    {
        List<Rating> allrating=ratingServic.getAllRate();
        return ResponseEntity.status(HttpStatus.OK).body(allrating);
    }
    @RequestMapping("/{id}")///personal ID is service
    public  ResponseEntity<Rating> getSingleRating(@PathVariable String id)
    {
        Rating rating2=ratingServic.getRate(id);
        return ResponseEntity.ok(rating2);
    }
    @RequestMapping("/user/{id}")//userId pass krne p
    public  ResponseEntity<List<Rating>> getUserId(@PathVariable String id)
    {
        List<Rating> rating2=ratingServic.getUserId(id);
        return ResponseEntity.status(HttpStatus.OK).body(rating2);
    }
    @RequestMapping("/hotel/{id}")//hotelId pass krne p
    public  ResponseEntity<List<Rating>> getHotelId(@PathVariable String id)
    {
        List<Rating> rating2=ratingServic.getHotelId(id);
        return ResponseEntity.status(HttpStatus.OK).body(rating2);
    }
}