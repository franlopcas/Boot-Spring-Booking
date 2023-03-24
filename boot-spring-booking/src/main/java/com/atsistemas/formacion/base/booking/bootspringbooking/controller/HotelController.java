package com.atsistemas.formacion.base.booking.bootspringbooking.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atsistemas.formacion.base.booking.bootspringbooking.entity.Hotel;
import com.atsistemas.formacion.base.booking.bootspringbooking.service.HotelService;

@RestController
@RequestMapping("/hoteles")
public class HotelController {

	private HotelService hotelService;
	
	public HotelController(HotelService hotelService) {
		this.hotelService = hotelService;
	}
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> listarHoteles(){
		List<Hotel> hoteles = hotelService.listadoHoteles();
		if(hoteles.isEmpty()) {
			return new ResponseEntity<> (HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Hotel>>(hoteles, HttpStatus.OK);
	}
	
	@GetMapping(value="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> consultarHotel(@PathVariable(name="id") Integer id){
		Hotel hotel = hotelService.consultarHotel(id);
		if(hotel == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Hotel>(hotel, HttpStatus.OK);
	}
	
	@PostMapping(value="/create", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Hotel> crearHotel(@RequestBody Hotel hotel) {
		Hotel newhotel = hotelService.crearHotel(hotel);
		return new ResponseEntity<Hotel> (newhotel, HttpStatus.CREATED);
	}
	
	@PutMapping(value="/update", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Hotel> actualizaHotel(@RequestBody Hotel hotel){
		Hotel updateHotel = hotelService.consultarHotel(hotel.getId());
		if(updateHotel == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		hotelService.actualizarHotel(hotel);
		return new ResponseEntity<Hotel> (hotel, HttpStatus.ACCEPTED);
	}
}
