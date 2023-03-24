package com.atsistemas.formacion.base.booking.bootspringbooking.repository;

import java.util.List;

import com.atsistemas.formacion.base.booking.bootspringbooking.entity.Hotel;

public interface HotelRepository{

	List<Hotel> findAll();
	Hotel findAllById(Integer id);
	void updateHotel(Hotel hotel);
	Hotel createHotel(Hotel hotel);
	
}
