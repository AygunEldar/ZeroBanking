package com.zeroBank.stepdefinitions;

import com.zeroBank.pages.BasePage;
import com.zeroBank.pages.LoginPage;
import com.zeroBank.utilities.ConfigurationReader;
import com.zeroBank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.hssf.record.chart.DatRecord;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginStepDefinitions {

     BasePage basePage = new BasePage();
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

    @And("user logins with username {string} and {string}")
    public void userLoginsWithUsernameAnd(String arg0, String arg1) {
        loginPage.login(arg0,arg1);
    }

    @Then("the {string} page should be displayed")
    public void thePageShouldBeDisplayed(String pageName) {
        String currentTitle = Driver.getDriver().getTitle();
        String selectedTab = basePage.selectedTab.getText();


        Assert.assertEquals("Page is not matching as expected", pageName,selectedTab);
        Assert.assertTrue("Title is not matching", currentTitle.toLowerCase().contains(pageName.toLowerCase()) );
    }


    @Then("error message {} should be displayed")
    public void error_message_should_be_displayed(String expectedError) {
        Assert.assertEquals("Error message does not match", expectedError,loginPage.errorMessage.getText() );
    }
    @When("user logins with username {string} and password {string}")
    public void user_logins_with_username_and_password(String string, String string2) {

    }

}
