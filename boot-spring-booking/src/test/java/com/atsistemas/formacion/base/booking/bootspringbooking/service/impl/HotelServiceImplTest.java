package com.atsistemas.formacion.base.booking.bootspringbooking.service.impl;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.atsistemas.formacion.base.booking.bootspringbooking.entity.Hotel;
import com.atsistemas.formacion.base.booking.bootspringbooking.repository.HotelRepository;

@ExtendWith(MockitoExtension.class)
public class HotelServiceImplTest {

	private HotelServiceImpl hotelServiceImpl;
	@Mock private HotelRepository hotelRepository;
	
	@BeforeEach
	public void setup() {
		this.hotelServiceImpl = new HotelServiceImpl(hotelRepository);
	}

	@Test
	public void testListarHoteles() {
		Mockito.when(hotelRepository.findAll()).thenReturn(List.of(new Hotel(1,"Playa Tropical", 4)));
		List<Hotel> listaHoteles = hotelServiceImpl.listadoHoteles();
		Assertions.assertNotNull(listaHoteles);
	}
	@Test
	public void testConsultaHotel() {
		Mockito.when(hotelRepository.findAllById(Mockito.any()))
		.thenReturn(new Hotel(1,"Playa Tropical", 4));
		Hotel hotel = hotelServiceImpl.consultarHotel(1);
		Assertions.assertEquals("Playa Tropical",hotel.getName());
	}
}
