package com.atsistemas.formacion.base.booking.bootspringbooking.repository.Jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.atsistemas.formacion.base.booking.bootspringbooking.entity.Availability;
import com.atsistemas.formacion.base.booking.bootspringbooking.repository.AvailabilityRepository;

@Repository
public class JpaAvailabilityRepository implements AvailabilityRepository{

	@PersistenceContext
	private EntityManager em;
	
	public JpaAvailabilityRepository() {
		
	}
	
	@Override
	public List<Availability> findAll(){
		return em.createQuery("FROM availabilities", Availability.class).getResultList();
	}

	@Override
	public List<Availability> findByHotelNameContains(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Availability findAllById(Integer id) {
		return em.find(Availability.class, id);
	}
}
