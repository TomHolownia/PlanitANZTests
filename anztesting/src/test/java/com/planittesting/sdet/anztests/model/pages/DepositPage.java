package com.planittesting.sdet.anztests.model.pages;

import com.planittesting.sdet.anztests.model.components.dropDownMenu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DepositPage extends BasePage<DepositPage> {

    public DepositPage(WebDriver driver) {
        super(driver);
    }

    public DepositPage setEstimatedPropertyValue(String propertyValue) {
        driver.findElement(By.id("propertyValue")).sendKeys(propertyValue);
        return this;
    }

    public DepositPage setHowMuchDoYouHaveNow(String contribution) {
        driver.findElement(By.id("contribution")).sendKeys(contribution);
        return this;
    }

    public double getEstimatedCosts() {
        var estimatedCosts = driver.findElements(By.className("upfrontcosts__costValue")).get(0)
            .getText()
            .replace("$", "")
            .replace(",", "");
        return Double.parseDouble(estimatedCosts);
    }

    public double getEstimatedDeposit() {
        var estimatedDeposit = driver.findElements(By.className("upfrontcosts__costValue")).get(1)
            .getText()
            .replace("$", "")
            .replace(",", "");
        return Double.parseDouble(estimatedDeposit);
    }

    public DepositPage clickStateDropDown(String state) {
        dropDownMenu dropDown = new dropDownMenu(driver.findElement(By.id("propertyState")));
        WebElement entry = dropDown.getElement(state, "propertyState");
        entry.click();
        return this;
    }

    public DepositPage clickEstablishedHomeDropDown(String type) {
        dropDownMenu dropDown = new dropDownMenu(driver.findElement(By.id("propertyType")));
        WebElement entry = dropDown.getElement(type, "propertyType");
        entry.click();
        return this;
    }
}