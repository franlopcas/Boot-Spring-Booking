package com.atsistemas.formacion.base.booking.bootspringbooking.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.atsistemas.formacion.base.booking.bootspringbooking.entity.Availability;
import com.atsistemas.formacion.base.booking.bootspringbooking.repository.AvailabilityRepository;
import com.atsistemas.formacion.base.booking.bootspringbooking.service.AvailabilityService;

@Service
public class AvailabilityServiceImpl implements AvailabilityService{

	private AvailabilityRepository availabilityRepository;
	
	public AvailabilityServiceImpl(AvailabilityRepository availabilityRepository) {
		this.availabilityRepository = availabilityRepository;
	}
	
	@Override
	public List<Availability> disponibilidadHotel(String name) {
		return availabilityRepository.findByHotelNameContains(name);
	}

	@Override
	public List<Availability> mostrarDisponibilidades() {
		return availabilityRepository.findAll();
	}

	@Override
	public Availability consultarDispo(Integer id) {
		return availabilityRepository.findAllById(id);
	}

}
