package com.atsistemas.formacion.base.booking.bootspringbooking.service;

import java.util.List;

import com.atsistemas.formacion.base.booking.bootspringbooking.entity.Availability;

public interface AvailabilityService {

	public List<Availability> disponibilidadHotel(String name);
	public List<Availability> mostrarDisponibilidades();
	public Availability consultarDispo(Integer id);
}
