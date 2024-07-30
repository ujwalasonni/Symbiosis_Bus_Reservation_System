package com.Symbiosis.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.Symbiosis.DTO.BookingsDTO;
import com.Symbiosis.DTO.UserRegisteredDTO;
import com.Symbiosis.model.Bookings;
import com.Symbiosis.model.User;

public interface DefaultUserService extends UserDetailsService{

	User save(UserRegisteredDTO userRegisteredDTO);

	Bookings updateBookings(BookingsDTO bookingDTO,UserDetails user);


	
}
