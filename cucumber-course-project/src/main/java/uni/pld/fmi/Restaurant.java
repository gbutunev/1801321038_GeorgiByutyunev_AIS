package uni.pld.fmi;
import java.util.*;

public class Restaurant {

    public String name;
    public String address;
    public int tableCount;
    public City City;
    public User User;
    public Set<Reservation> Reservations;

    public Restaurant() {
    	
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

    public String getAddress() {
        return address;
    }

    public boolean setAddress(String address) {
        try {
			this.address = address;
			return true;
		} catch (Exception e) {
			return false;
		}
    }

    public int getTableCount() {
        return tableCount;
    }

    public boolean setTableCount(int tables) {
        try {
			this.tableCount = tables;
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

}