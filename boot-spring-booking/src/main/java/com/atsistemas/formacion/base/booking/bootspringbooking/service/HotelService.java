package com.atsistemas.formacion.base.booking.bootspringbooking.service;

import java.util.List;

import com.atsistemas.formacion.base.booking.bootspringbooking.entity.Hotel;

public interface HotelService {
	
	List<Hotel> listadoHoteles();
	Hotel consultarHotel(Integer id);
	void actualizarHotel(Hotel hotel);
	Hotel crearHotel(Hotel hotel);

}
