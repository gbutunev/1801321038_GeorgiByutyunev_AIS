package uni.pld.fmi;

import static org.junit.Assert.assertEquals;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pld.fmi.models.ReservationPageModel;

public class CreateReservation {
	
	ReservationPageModel rpm = new ReservationPageModel();
	
	@Given("^User opens reservation creation tab$")
	public void openReservationsTab() throws Throwable {
	    rpm.navigateToReservationTab();
	}

	@When("^User selects restaurant \"([^\"]*)\"$")
	public void selectRestaurant(String restaurant) throws Throwable {
	    rpm.setRestaurant(restaurant);
	}

	@When("^Enters date and time \"([^\"]*)\"$")
	public void selectDateTime(String datetimeString) throws Throwable {
		DateTime current;
		if(datetimeString.equals(null) || datetimeString.equals("")){
		    current = null;
		}else{
			DateTimeFormatter dtf = DateTimeFormat.forPattern("dd/MM/YYYY HH:mm");
			current = dtf.parseDateTime(datetimeString);
		}
		
	    rpm.setDateTime(current);
	}

	@When("^Enters number of people \"([^\"]*)\"$")
	public void setPeopleCount(String people) throws Throwable {
		if(people.equals(null) || people.equals("")){
			rpm.setPeopleCount(-1);
		}else{
			rpm.setPeopleCount(Integer.parseInt(people));
		}
	    
	}

	@When("^Clicks on 'create reservation'$")
	public void createReservation() throws Throwable {
	    rpm.createReservation();
	}
		
	@Then("^Message to user \"([^\"]*)\"$")
	public void messageToUser(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, rpm.getReservationMessage());
	}
}
