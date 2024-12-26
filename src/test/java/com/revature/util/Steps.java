package com.revature.util;

import com.revature.Setup;
import com.revature.TestRunner;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Steps {

    @Before("@US4 or @US5")
    public void login() {
        System.out.println("Logging in...");
        TestRunner.driver.get("http://localhost:8080/");

        try {
            TestRunner.signup.insertText("Batman", "username");
            TestRunner.signup.insertText("Iamthenight1939", "password");
            TestRunner.signup.submit();

        } catch (Exception e) {
            System.out.printf("Incorrect input type, %s %n", e.getMessage());
        }

    }

    @Before("not @excludeReset")
    public void resetDB() {
        Setup.resetTestDatabase();
    }

    @When("user selects planet option")
    public void userSelectsPlanetOption() {
        TestRunner.home.selectType("planet");
    }

    @When("user selects moon option")
    public void userSelectsMoonOption() {
        TestRunner.home.selectType("moon"); // took me ~30 minutes to realize I need this
    }

    @Then("browser alert says {string}")
    public void browserAlertSays(String arg0) {
        // Check if browser text matches
        try {
            Alert alertElement = TestRunner.driver.switchTo().alert();
            String alert = alertElement.getText();
            System.out.printf("Browser alert: %s", alert);

            if (arg0.isEmpty()){
                alertElement.accept();
                Assert.fail("Action was supposed to succeed, but alert showed instead");
                return;
            }

            alertElement.accept();
            Assert.assertEquals(arg0, alert);

        }
        catch (NoAlertPresentException e) {
            if (!arg0.isEmpty()) { // arg0 specifies browser alert, but didn't happen
                Assert.fail("Alert was supposed to appear, but didn't.");
            }
        }
    }


    @Given("user logs in")
    public void userLogsIn() {
        TestRunner.driver.get("http://localhost:8080/");
        try {
            TestRunner.signup.insertText("Batman", "username");
            TestRunner.signup.insertText("Iamthenight1939", "password");

        } catch (Exception e) {
            System.out.printf("Incorrect input type, %s %n", e.getMessage());
        }

        TestRunner.signup.submit();

        TestRunner.wait.until(ExpectedConditions
                .not(ExpectedConditions.titleIs("Planetarium Login")));

        Assert.assertEquals("http://localhost:8080/planetarium", TestRunner.driver.getCurrentUrl());


    }


    public static int getTableCount() {
        {
            List<WebElement> elems = TestRunner.driver.findElements(By.xpath(
                    "//table[@id = 'celestialTable']/tbody/tr"
            ));

            int numOfRows = elems.size();

            return numOfRows;
        }
    }
}
