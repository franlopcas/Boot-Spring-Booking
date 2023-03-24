package com.atsistemas.formacion.base.booking.bootspringbooking.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.atsistemas.formacion.base.booking.bootspringbooking.entity.Hotel;
import com.atsistemas.formacion.base.booking.bootspringbooking.repository.HotelRepository;
import com.atsistemas.formacion.base.booking.bootspringbooking.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService{
	
	private HotelRepository hotelRepository;
	
	public HotelServiceImpl(HotelRepository hotelRepository) {
		this.hotelRepository = hotelRepository;
	}

	@Override
	public List<Hotel> listadoHoteles() {
		return hotelRepository.findAll();
	}

	@Override
	public Hotel consultarHotel(Integer id) {
		return hotelRepository.findAllById(id);
	}

	@Override
	@Transactional
	public void actualizarHotel(Hotel hotel) {
		hotelRepository.updateHotel(hotel);
	}

	@Override
	@Transactional
	public Hotel crearHotel(Hotel hotel) {
		return hotelRepository.createHotel(hotel);
	}

}
