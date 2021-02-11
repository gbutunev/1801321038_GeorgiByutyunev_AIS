package uni.pld.fmi.models;

import uni.pld.fmi.services.RestaurantCreationService;

public class RestaurantPageModel {
	String username;
	String restaurantName;
	String city;
	String address;
	int tables;
	String message;
	
	public void NavigateToRestaurantsTab() {
		System.out.println("Restaurant management tab opened");
	}

	public void verifyUser(String username) {
		this.username = username;		
	}

	public void setRestaurantName(String name) {
		this.restaurantName = name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setTableCount(int tables) {
		this.tables = tables;
	}

	public void CreateRestaurant() {
		message = RestaurantCreationService.createRestaurant(username, restaurantName, city, address, tables);
	}

	public Object getMessage() {
		return message;
	}
	
	
}
