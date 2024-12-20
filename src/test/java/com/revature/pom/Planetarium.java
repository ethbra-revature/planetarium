package com.revature.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Planetarium {

    @FindBy(id = "usernameInput")
    private WebElement userField;

    @FindBy(id = "passwordInput")
    private WebElement passwordField;

    @FindBy(linkText = "Create an Account")
    private WebElement registerLink;

    private WebDriver driver;

    public Planetarium(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void gotoSite(String address) {
        driver.get(address);
    }

    public void clickRegister() {
        registerLink.click();
    }

    public void insertText(String text, String field) throws Exception {
        switch (field) {
            case "username":
                userField.sendKeys(text);
                break;
            case "password":
                passwordField.sendKeys(text);
                break;
            default:
                throw new Exception("Invalid field");
        }
    }

    public void submitRegister() {
        WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
        submit.click();
    }
}
