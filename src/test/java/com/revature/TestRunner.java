package com.revature;

import com.revature.pom.Planetarium;
import com.revature.registration.Register;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        glue = "com.revature",
        plugin = {"pretty", "html:src/test/resources/reports/report.html"}
)
public class TestRunner {

    public static WebDriver driver = null;

    public static Planetarium planetarium;

    @BeforeClass
    public static void setup() {
        driver = new FirefoxDriver();
        
        planetarium = new Planetarium(driver);

    }

    @AfterClass
    public static void teardown() {
            driver.quit();
    }
}
