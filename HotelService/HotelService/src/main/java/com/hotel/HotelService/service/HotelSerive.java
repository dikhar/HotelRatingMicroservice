package com.hotel.HotelService.service;

import com.hotel.HotelService.entity.Hotel;

import java.util.List;

public interface HotelSerive {
    Hotel create(Hotel hotel);
    List<Hotel> getAllHotel();
    Hotel get(String Id);
}
