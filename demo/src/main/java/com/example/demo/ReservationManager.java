package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ReservationManager {
	private List<Rezerwacja> reservationList;
	
	public ReservationManager(){
		this.reservationList = new ArrayList<>();
		reservationList.add(new Rezerwacja(1, "20.08.2020"));
		reservationList.add(new Rezerwacja(2, "21.09.2020"));
	}

	public List<Rezerwacja> getReservationList() {
		return reservationList;
	}
	
	public boolean addReservation(Rezerwacja rezerwacja) {
		return reservationList.add(rezerwacja);
	}

	public void setReservationList(List<Rezerwacja> reservationList) {
		this.reservationList = reservationList;
	}	
	
}
