package uni.pld.fmi.services;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;

import uni.pld.fmi.Restaurant;

public class ReservationsService {

	//dummy database	
	private static List<Restaurant> getRestaurants(){
		Restaurant res = new Restaurant();
		res.name = "Happy";
		
		final List<Restaurant> rests = new ArrayList<Restaurant>();
		rests.add(res);
		return rests;
	}
	
	public static String createReservation(String restaurant, DateTime time, int people) {
		List<Restaurant> restaurants = getRestaurants();
		
		if(restaurant == null || restaurant.equals("")){
			return "Please select a restaurant";
		}
		else if (!restaurants.stream().anyMatch(res -> restaurant.equals(res.getName()))){
			return "Restaurant does not exist";
		}
		else if (time == null) {
			return "Please enter time and date";
		}
		else if (time.isBeforeNow()) {
			return "Cannot enter date and time before today";
		}
		else if (people <= 0) {
			return "Please enter correct number of people";
		}
		else {
			return "OK";
		}
	}

}
