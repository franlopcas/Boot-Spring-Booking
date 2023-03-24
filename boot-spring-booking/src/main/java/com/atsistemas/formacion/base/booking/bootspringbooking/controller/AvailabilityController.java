package com.atsistemas.formacion.base.booking.bootspringbooking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atsistemas.formacion.base.booking.bootspringbooking.entity.Availability;
import com.atsistemas.formacion.base.booking.bootspringbooking.service.AvailabilityService;

@RestController
@RequestMapping("/availabilities")
public class AvailabilityController {

	private AvailabilityService availabilityService;
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> listarDisponibilidades(){
		List<Availability> disponibilidades = availabilityService.mostrarDisponibilidades();
		if(disponibilidades.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Availability>>(disponibilidades, HttpStatus.OK);
	}
	
	@GetMapping(value="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> consultarDisponibilidad(@PathVariable (name="id") Integer id){
		Availability disponible = availabilityService.consultarDispo(id);
		if(disponible == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Availability>(disponible, HttpStatus.OK);
	}
	
	
	@GetMapping(value="/hotel/{name}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> consultarDisponibilidadHotel(@PathVariable(name="name") String name){
		List<Availability> disponible = availabilityService.disponibilidadHotel(name);
		if(disponible.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Availability>>(disponible, HttpStatus.OK);
	}
}
