package com.zeroBank.stepdefinitions;

import com.zeroBank.pages.LoginPage;
import com.zeroBank.utilities.ConfigurationReader;
import com.zeroBank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.hssf.record.chart.DatRecord;
import org.openqa.selenium.By;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().findElement(By.id("signin_button")).click();
    }
    @Then("the user enters credentials and logs in")
    public void the_user_enters_credentials_and_logs_in() {
    loginPage.username.sendKeys("username");
    loginPage.password.sendKeys("password");
    loginPage.signIn.click();
    }
}
