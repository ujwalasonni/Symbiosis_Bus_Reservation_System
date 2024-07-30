package com.Symbiosis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Symbiosis.model.Bookings;




public interface BookingsRepository extends JpaRepository<Bookings, Integer> {

	List<Bookings> findByUserId(int userId);
	
}
