package com.atsistemas.formacion.base.booking.bootspringbooking.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="availabilities")
public class Availability {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="id_hotel")
	private Integer idHotel;
	
	@Column(name="rooms")
	private Integer rooms;
	
	@Column(name="fecha")
	private LocalDate fecha;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_hotel", nullable=false, insertable=false , updatable=false)
	private Hotel hotel;
	
	public Availability() {
		
	}
	
	public Availability(Integer id, Integer idHotel, Integer rooms, LocalDate fecha) {
		super();
		this.id = id;
		this.idHotel = idHotel;
		this.rooms = rooms;
		this.fecha = fecha;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdHotel() {
		return idHotel;
	}
	public void setIdHotel(Integer idHotel) {
		this.idHotel = idHotel;
	}
	public Integer getRooms() {
		return rooms;
	}
	public void setRooms(Integer rooms) {
		this.rooms = rooms;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	

}
