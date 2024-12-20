package com.revature.registration;

import com.revature.TestRunner;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class Login {

/*
    @AfterStep("@US2")
    public void pause() {
        System.out.println("Pausing US2");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
 */

    @Then("user is sent to Home page")
    public void userIsSentToHomePage() {
        Assert.assertEquals("http://localhost:8080/planetarium", TestRunner.driver.getCurrentUrl());
    }

    @And("user stays on Login page")
    public void userStaysOnLoginPage() {
        Assert.assertEquals("http://localhost:8080/", TestRunner.driver.getCurrentUrl());
    }
}
