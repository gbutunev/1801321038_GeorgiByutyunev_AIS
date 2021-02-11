package uni.pld.fmi.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import uni.pld.fmi.City;
import uni.pld.fmi.User;

public class RestaurantCreationService {
	
	//dummy db
	
	//userType: 0-admin | 1-owner | 2-normal user
	private static List<User> getUsers(){
		User u1 = new User();
		User u2 = new User();
		
		u1.setUsername("owner123");
		u1.setUserType(1);
		
		u2.setUsername("user1234");
		u2.setUserType(2);
		
		List<User> users = new ArrayList<>();
		users.add(u1);
		users.add(u2);
		
		return users;
	}
	
	private static List<City> getCities(){
		City city = new City();
		
		city.setName("Plovdiv");
		
		List<City> cities = new ArrayList<>();
		cities.add(city);
		
		return cities;
	}

	public static String createRestaurant(String username, String restaurantName, String city, String address,
			int tables) {
	
		List<City> cities = getCities();
		List<User> users = getUsers();
		
		User currentUser = users.stream().filter(user -> user.getUsername().equals(username)).findFirst().get();
		Optional<City> currentCity = cities.stream().filter(c -> c.getName().equals(city)).findFirst();
		
		if (currentUser.getUserType() != 1) {
			return "User does not have access to these tools";
		}
		else if(currentCity.isEmpty()) {
			return "City not in database";
		}
		else {
			return "OK";
		}
	}
	
}
