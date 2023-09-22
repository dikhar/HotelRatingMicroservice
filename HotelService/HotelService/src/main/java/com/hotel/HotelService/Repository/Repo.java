package com.hotel.HotelService.Repository;

import com.hotel.HotelService.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Hotel,String> {
}
