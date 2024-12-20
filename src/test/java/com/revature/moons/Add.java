package com.revature.moons;

import com.revature.TestRunner;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Add {

    @Given("user on Home page")
    public void userOnHomePage() {
        Assert.assertEquals("http://localhost:8080/planetarium", TestRunner.driver.getCurrentUrl());
    }

    @And("user is logged in")
    public void userIsLoggedIn() {
        System.out.println("TEST TEST TEST TEST TEST TEST TEST TEST TEST");
        String res = TestRunner.driver.findElement(By.xpath("//pre")).getText();

        Assert.assertTrue(res.isEmpty());
    }

    @When("user enters planet {string}")
    public void userEntersPlanet(String arg0) {
        TestRunner.home.enterPlanet(arg0);
    }

    @And("user enters file {string}")
    public void userEntersFile(String arg0) {
        TestRunner.home.enterFile(arg0);
    }

    @Then("browser alert says {string}")
    public void browserAlertSays(String arg0) {
        Assert.assertEquals(arg0, TestRunner.driver.switchTo().alert().getText());
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
