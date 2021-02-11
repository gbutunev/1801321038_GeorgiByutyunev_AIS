package uni.pld.fmi;
import java.util.*;

public class User {

    private String username;
    private String password;
    private int userType;
    public City City;
    public Set<Reservation> Reservations;
    public Set<Restaurant> Restaurants;
    
    public User() {
    	
    }
    
    public String getUsername() {
        return username;
    }
    
    public boolean setUsername(String username) {
        try {
			this.username = username;
			return true;
		} catch (Exception e) {
			return false;
		}
    }

    public String getPassword() {
        return password;
    }

    public boolean setPassword(String password) {
        try {
			this.password = password;
			return true;
		} catch (Exception e) {
			return false;
		}
    }

    public int getUserType() {
        return userType;
    }

    public boolean setUserType(int type) {
        try {
			this.userType = type;
			return true;
		} catch (Exception e) {
			return false;
		}
    }

    public Set<Reservation> getReservations() {
        return Reservations;
    }

    public boolean setReservations(Set<Reservation> reservations) {
    	try {
			this.Reservations = reservations;
			return true;
		} catch (Exception e) {
			return false;
		}
    }

    public boolean addReservation(Reservation reservation) {
    	try {
			Reservations.add(reservation);
			return true;
		} catch (Exception e) {
			return false;
		}
    }

    public Set<Restaurant> getRestaurants() {
        return Restaurants;
    }

    public boolean setRestaurants(Set<Restaurant> restaurants) {
    	try {
			this.Restaurants = restaurants;
			return true;
		} catch (Exception e) {
			return false;
		}
    }

    public boolean addRestaurant(Restaurant restaurant) {
    	try {
			Restaurants.add(restaurant);
			return true;
		} catch (Exception e) {
			return false;
		}
    }

}