package com.revature.pom;

import com.revature.TestRunner;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.nio.file.Path;
import java.util.List;

public class Home {

    @FindBy(tagName = "tr")
    private List<WebElement> images;

    @FindBy(xpath = "//input[@id = 'deleteInput']")
    private WebElement bodyName;

    @FindBy(xpath = "//input[@id = 'planetNameInput']")
    private WebElement planetName;

    @FindBy(xpath = "//input[@id = 'moonNameInput']")
    private WebElement moonName;

    @FindBy(xpath = "//input[@id = 'orbitedPlanetInput']")
    private WebElement planetID;

    @FindBy(xpath = "//input[@type='file']")
    private WebElement browseFiles;

    //  Submit button is celestial body agnostic
    @FindBy(xpath = "//button[@class='submit-button']")
    private WebElement submitButton;


    public Home() {
        PageFactory.initElements(TestRunner.driver, this);

    }

    public int countBodies() {
        return images.size() - 1;
    }

    public void enterPlanet(String planetName) {
        this.planetName.sendKeys(planetName);
    }

    public void enterMoon(String moonName) {
        this.moonName.sendKeys(moonName);
    }

    public void enterID(String id) {
        this.planetID.sendKeys(id);
    }

    public void enterFile(String file) {
        browseFiles.sendKeys(file);
    }


}
