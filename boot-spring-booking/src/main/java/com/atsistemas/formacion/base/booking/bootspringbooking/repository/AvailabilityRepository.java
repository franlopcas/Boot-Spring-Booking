package com.atsistemas.formacion.base.booking.bootspringbooking.repository;

import java.util.List;

import com.atsistemas.formacion.base.booking.bootspringbooking.entity.Availability;

public interface AvailabilityRepository{
	
	public List<Availability> findByHotelNameContains(String name);
	
	List<Availability> findAll();
	Availability findAllById(Integer id);
}
