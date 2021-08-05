package com.zeroBank.pages;

import com.zeroBank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriverWait wait =new WebDriverWait(Driver.getDriver(),10);
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id= "user_login")
    public WebElement username;

    @FindBy(id="user_password")
    public WebElement password;

    @FindBy(xpath="//input[@name='submit']")
    public WebElement signIn;

    @FindBy(xpath ="button[@id='details-button']")
    public WebElement advanced;

    @FindBy(xpath ="//a[@id='proceed-link']")
    public WebElement proceedLink;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement errorMessage;

    public void resolveUnsecureConnections(){
       wait.until(ExpectedConditions.visibilityOf(advanced));
       advanced.click();

       wait.until(ExpectedConditions.visibilityOf(proceedLink));
       proceedLink.click();
    }

    public void login(String user, String pass) {
        username.sendKeys(user);
        password.sendKeys(pass);
        signIn.click();
    }
}
