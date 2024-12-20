package com.revature.moons;

import com.revature.TestRunner;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Add {

    @Before("@US4")
    public void login() {
        TestRunner.driver.get("http://localhost:8080/");

        try {
            TestRunner.signup.insertText("Batman", "username");
            TestRunner.signup.insertText("Iamthenight1939", "password");
        } catch (Exception e) {
            System.out.printf("Incorrect input type, %s\n", e.getMessage());
        }

        TestRunner.signup.submit();

    }

    @Given("user on Home page")
    public void userOnHomePage() {
        Assert.assertEquals("http://localhost:8080/planetarium", TestRunner.driver.getCurrentUrl());
    }

    @And("user is logged in")
    public void userIsLoggedIn() {
        System.out.println("TEST TEST TEST TEST TEST TEST TEST TEST TEST");
        try {
            WebElement res = TestRunner.driver.findElement(By.xpath("//pre"));

            Assert.fail("Planetarium didn't load");
        } catch (Exception e) {
            System.out.println("Successful login");

        }

    }

    @When("user selects planet option")
    public void userSelectsPlanetOption() {
        TestRunner.home.selectType("planet");
    }


    @When("user enters planet {string}")
    public void userEntersPlanet(String arg0) {
        TestRunner.home.enterPlanet(arg0);
    }

    @And("user enters file {string}")
    public void userEntersFile(String arg0) {
        // TODO: make this actually work
        if (arg0.isEmpty())
            return;

        TestRunner.home.enterFile(arg0);
    }

    @And("user clicks to submit")
    public void userClicksToSubmit() {
        TestRunner.home.submit();
    }

    @Then("browser alert says {string}")
    public void browserAlertSays(@NotNull String arg0) {
        if (arg0.isEmpty())
            return;

        Assert.assertEquals(arg0, TestRunner.driver.switchTo().alert().getText());
        TestRunner.driver.switchTo().alert().accept();
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
