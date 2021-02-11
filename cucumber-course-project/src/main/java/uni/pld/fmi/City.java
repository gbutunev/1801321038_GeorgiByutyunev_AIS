package uni.pld.fmi;
import java.util.Set;

public class City {

    private String name;
    private int postalCode;
    private String country;
    private String province;
    private String municipality;
    public Set<Restaurant> Restaurants;
    public Set<User> Users;

    public City() {
    	
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        try {
			this.name = name;
			return true;
		} catch (Exception e) {
			return false;
		}
    }

    public int getPostalCode() {
        return postalCode;
    }

    public boolean setPostalCode(int code) {
        try {
			this.postalCode = code;
			return true;
		} catch (Exception e) {
			return false;
		}
    }

    public String getCountry() {
        return country;
    }

    public boolean setCountry(String country) {
        try {
			this.country = country;
			return true;
		} catch (Exception e) {
			return false;
		}
    }

    public String getProvince() {
        return province;
    }

    public boolean setProvince(String province) {
        try {
			this.province = province;
			return true;
		} catch (Exception e) {
			return false;
		}
    }

    public String getMunicipality() {
        return municipality;
    }

    public boolean setMunicipality(String municipality) {
        try {
			this.municipality = municipality;
			return true;
		} catch (Exception e) {
			return false;
		}
    }

    public Set<Restaurant> getRestaurants() {
        return Restaurants;
    }

    public Set<User> getUsers() {
        return Users;
    }

    public boolean setRestaurants(Set<Restaurant> restaurants) {
        try {
			this.Restaurants = restaurants;
			return true;
		} catch (Exception e) {
			return false;
		}
    }

    public boolean setUsers(Set<User> users) {
    	try {
			this.Users = users;
			return true;
		} catch (Exception e) {
			return false;
		}
    }

    public boolean addUser(User user) {
        try {
			Users.add(user);
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