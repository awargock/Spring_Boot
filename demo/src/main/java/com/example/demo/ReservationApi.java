package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationApi {
	
	private ReservationManager reservationManager;
	
	@Autowired
	public ReservationApi(ReservationManager reservationManager){
		this.reservationManager = reservationManager;
	}

	@GetMapping("/hello")
	public String sayHello(){
		return "Hello";
	}
	
	@GetMapping("/getReservations")
	public List<Rezerwacja> getReservations(){
		return reservationManager.getReservationList();
	}
	
	@PostMapping("/addReservation")
	public boolean addReservation(@RequestBody Rezerwacja rezerwacja){
		return reservationManager.addReservation(rezerwacja);
	}

}
