package com.atsistemas.formacion.base.booking.bootspringbooking.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="hotel")
public class Hotel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="category")
	private Integer category;
/**	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name="id_hotel", referencedColumnName="id")
	private List<Availability> availability = new ArrayList<>();
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name="id_hotel", referencedColumnName="id")
	private List<Booking> booking = new ArrayList<>();
	*/
	public Hotel() {
		
	}
	
	public Hotel(Integer id, String name, Integer category) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCategory() {
		return category;
	}
	public void setCategory(Integer category) {
		this.category = category;
	}

	
}
