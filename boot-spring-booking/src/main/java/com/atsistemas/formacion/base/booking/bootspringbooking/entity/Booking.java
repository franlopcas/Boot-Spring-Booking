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
@Table(name="bookings")
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="date_from")
	private LocalDate date_from;
	
	@Column(name="date_to")
	private LocalDate date_to;
	
	@Column(name="email")
	private String email;
	
	@Column(name="id_hotel")
	private Integer idHotel;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_hotel", nullable = false, insertable=false , updatable=false )
	private Hotel hotel;
	
	public Booking() {
		
	}
	
	public Booking(Integer id, LocalDate date_from, LocalDate date_to, String email, Integer idHotel) {
		super();
		this.id = id;
		this.date_from = date_from;
		this.date_to = date_to;
		this.email = email;
		this.idHotel = idHotel;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getDate_from() {
		return date_from;
	}
	public void setDate_from(LocalDate date_from) {
		this.date_from = date_from;
	}
	public LocalDate getDate_to() {
		return date_to;
	}
	public void setDate_to(LocalDate date_to) {
		this.date_to = date_to;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getIdHotel() {
		return idHotel;
	}
	public void setIdHotel(Integer idHotel) {
		this.idHotel = idHotel;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	
}
