package com.revature.bodies;

import com.revature.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class View {

    @When("user attempts to access home page")
    public void userAttemptsToAccessHomePage() {
        TestRunner.driver.get("http://localhost:8080/planetarium");
    }

    @Then("user will load Main page")
    public void userWillLoadMainPage() {
        List<WebElement> bodies = TestRunner.driver.findElements(By.xpath("//tr"));

        Assert.assertFalse(bodies.isEmpty());
    }

    @Given("the user is not logged in")
    public void theUserIsNotLoggedIn() {

            TestRunner.driver.manage().deleteAllCookies();

            TestRunner.driver.navigate().refresh();
    }

    @Then("user is denied access")
    public void userIsDeniedAccess() {
        try {
            WebElement rows = TestRunner.driver.findElement(By.xpath("//tr"));

            Assert.fail("User gained access while logged out");

        } catch (Exception e) {
            System.out.println("User is denied access");
            Assert.assertTrue(true);
        }
    }
}
