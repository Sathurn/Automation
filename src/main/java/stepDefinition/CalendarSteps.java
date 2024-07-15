package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class CalendarSteps {

    @Given("User is logged in with email {string}, password {string} and phone number {string}")
    public void user_is_logged_in_with_email_password_and_phone_number(String email, String password, String phoneNumber) {

    }
    @When("User navigates to the specific day {string}")
    public void user_navigates_to_the_specific_day(String date) {

    }
    @And("User creates a new event {string}")
    public void user_creates_a_new_event(String eventText) {

    }

    @Then("The event {string} is present in the calendar")
    public void the_event_is_present_in_the_calendar(String eventText) {

    }

}
