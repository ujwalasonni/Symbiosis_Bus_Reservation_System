package com.Symbiosis.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Symbiosis.DTO.BookingsDTO;
import com.Symbiosis.model.Bookings;
import com.Symbiosis.model.User;
import com.Symbiosis.repository.BookingsRepository;
import com.Symbiosis.repository.UserRepository;

@Controller
@RequestMapping("/myBooking")
public class MyBookingController {

	
	@Autowired
	BookingsRepository bookingsRepository;
	
	@Autowired
	UserRepository userRepository;
	
	 @ModelAttribute("bookings")
	    public BookingsDTO bookingDto() {
	        return new BookingsDTO();
	    }
	    
		@GetMapping
		public String login(Model model) {
			SecurityContext securityContext = SecurityContextHolder.getContext();
	        UserDetails users = (UserDetails) securityContext.getAuthentication().getPrincipal();
	        User user =userRepository.findByEmail(users.getUsername());
			List<Bookings> bs = bookingsRepository.findByUserId(user.getId());
			model.addAttribute("userDetails", user.getName());
			Collections.reverse(bs);
			model.addAttribute("bookings",bs);
			return "myBookings";
		}
}

