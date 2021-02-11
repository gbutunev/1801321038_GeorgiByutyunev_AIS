package uni.pld.fmi;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.pld.fmi.models.RestaurantPageModel;

public class CreateRestaurant {
	
	RestaurantPageModel model = new RestaurantPageModel();
	
	@Given("^User opens restaurant creation tab$")
	public void openRestaurantsTab() throws Throwable {
	    model.NavigateToRestaurantsTab();
	}

	@When("^Current user \"([^\"]*)\" is verified$")
	public void verifyLoggedUser(String username) throws Throwable {
	    model.verifyUser(username);
	}

	@When("^User enters restaurant name \"([^\"]*)\"$")
	public void enterRestaurantName(String name) throws Throwable {
	    model.setRestaurantName(name);
	}

	@When("^User selects restaurant city \"([^\"]*)\"$")
	public void selectRestaurantCity(String city) throws Throwable {
	    model.setCity(city);
	}

	@When("^User enters restaurant address \"([^\"]*)\"$")
	public void enterRestaurantAddress(String address) throws Throwable {
		model.setAddress(address);
	}

	@When("^User enters restaurant table count \"([^\"]*)\"$")
	public void enterTableCount(String tableString) throws Throwable {
		if(tableString.equals(null) || tableString.equals("")){
			model.setTableCount(-1);
		}else{
			model.setTableCount(Integer.parseInt(tableString));
		}
	}

	@When("^Clicks on 'Add Restaurant'$")
	public void createRestaurant() throws Throwable {
	    model.CreateRestaurant();
	}

	@Then("^Message to user appears: \"([^\"]*)\"$")
	public void messageToUser(String expectedMessage) throws Throwable {
	    assertEquals(expectedMessage, model.getMessage());
	}
}
