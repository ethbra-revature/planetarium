package com.revature;

import com.revature.pom.Home;
import com.revature.pom.Signup;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "com.revature",
        plugin = {"pretty", "html:src/test/resources/reports/report.html"}
)
public class TestRunner {

    public static WebDriver driver = null;

    public static Signup signup;
    public static Home home;

    public static WebDriverWait wait;

    @BeforeClass
    public static void setup() {
        driver = new FirefoxDriver();

        wait = new WebDriverWait(driver, Duration.ofSeconds(1));

        signup = new Signup(driver);

        home = new Home();

    }

    @AfterClass
    public static void teardown() {
            driver.quit();
    }
}
