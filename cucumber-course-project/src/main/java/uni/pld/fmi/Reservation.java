package uni.pld.fmi;
import org.joda.time.DateTime;

public class Reservation {

    private DateTime time;
    private int people;
    public User User;
    public Restaurant Restaurant;
    
    public Reservation() {
    	
    }
    
    public DateTime getDateTime() {
        return time;
    }

    public boolean setDateTime(DateTime time) {
        try {
			this.time = time;
			return true;
		} catch (Exception e) {
			return false;
		}
    }

    public int getPeopleCount() {
        return people;
    }

    public boolean setPeopleCount(int people) {
        try {
			this.people = people;
			return true;
		} catch (Exception e) {
			return false;
		}
    }

}