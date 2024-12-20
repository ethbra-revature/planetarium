package com.revature.moons;

import com.revature.TestRunner;
import io.cucumber.java.en.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Add {


    @Given("user is logged in")
    public void userIsLoggedIn() {

    }

    @And("user on Home page")
    public void userOnHomePage() {
    }

    @When("user enters planet {string}")
    public void userEntersPlanet(String arg0) {
    }

    @And("user enters file {string}")
    public void userEntersFile(String arg0) {
    }

    @Then("browser alert says {string}")
    public void browserAlertSays(String arg0) {
    }

    @And("return to Home page")
    public void returnToHomePage() {
    }

    @When("user enters moon {string}")
    public void userEntersMoon(String arg0) {
    }

    @And("user enters owner planet {string}")
    public void userEntersOwnerPlanet(String arg0) {
    }
}
