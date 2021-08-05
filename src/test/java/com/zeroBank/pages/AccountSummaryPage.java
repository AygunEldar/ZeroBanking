package com.zeroBank.pages;

import com.zeroBank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountSummaryPage {
    public AccountSummaryPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h2")
    public List<WebElement> accountType;

    @FindBy (xpath = "(//thead)[3]/tr/th")
    public List<WebElement> actualColumnNames;

//    @FindBy(linkText = "a[href='/bank/redirect.html?url=account-summary.html']")
//    public WebElement accountSummery;
//
//    @FindBy (css = "a[href='/bank/redirect.html?url=account-activity.html']")
//    public WebElement accountActivity;
//
//    @FindBy (linkText = "a[href='/bank/redirect.html?url=transfer-funds.html']")
//    public WebElement transferFunds;
//
//    @FindBy (linkText = "a[href='/bank/redirect.html?url=pay-bills.html']")
//    public WebElement payBills;
//
//    @FindBy (linkText = "a[href='/bank/redirect.html?url=money-map.html']")
//    public WebElement myMoneyMap;
//
//    @FindBy (linkText = "a[href='/bank/redirect.html?url=online-statements.html']")
//    public WebElement onlineStatements;
}
