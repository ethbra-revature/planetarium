package com.revature.planets;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Delete {
    @Given("user has a planet {string}")
    public void userHasAPlanet(String arg0) {
    }

    @When("user deletes planet {string}")
    public void userDeletesPlanet(String arg0) {
    }

    @Then("Home page updates")
    public void homePageUpdates() {
    }

    @Given("user does not have planet {string}")
    public void userDoesNotHavePlanet(String arg0) {
    }

    @Then("browser alert shows {string}")
    public void browserAlertShows(String arg0) {
    }
}
