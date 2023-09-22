package com.user_serivice.userService.external;

import com.user_serivice.userService.entity.Hotel;
import com.user_serivice.userService.entity.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "HOTEL-SERVICE")
public interface HotelService {
    @GetMapping("/hotel/{id}")
    Hotel getHotelId(@PathVariable String id);
}

