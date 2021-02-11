package uni.pld.fmi.models;

import org.joda.time.DateTime;

import uni.pld.fmi.services.ReservationsService;

public class ReservationPageModel {
	
	String restaurant;
	DateTime time;
	int people;
	String message;
	
	public void navigateToReservationTab() {
		System.out.println("Reservations tab opened");
	}

	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}

	public void setDateTime(DateTime current) {
		this.time = current;
	}

	public void setPeopleCount(int count) {
		this.people = count;
		
	}

	public void createReservation() {
		message = ReservationsService.createReservation(restaurant, time, people);
	}

	public Object getReservationMessage() {
		return message;
	}



}
