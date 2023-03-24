package com.atsistemas.formacion.base.booking.bootspringbooking.repository.Jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.atsistemas.formacion.base.booking.bootspringbooking.entity.Hotel;
import com.atsistemas.formacion.base.booking.bootspringbooking.repository.HotelRepository;

@Repository
public class JpaHotelRepository implements HotelRepository{
	
	@PersistenceContext
	private EntityManager em;
	
	public JpaHotelRepository() {
		
	}

	@Override
	public List<Hotel> findAll() {
		return em.createQuery("FROM Hotel", Hotel.class).getResultList();
	}

	@Override
	public Hotel findAllById(Integer id) {
		return em.find(Hotel.class, id);
	}

	@Override
	public void updateHotel(Hotel hotel) {
		em.merge(hotel);
	}

	@Override
	public Hotel createHotel(Hotel hotel) {
		em.persist(hotel);
		return hotel;
	}

}
