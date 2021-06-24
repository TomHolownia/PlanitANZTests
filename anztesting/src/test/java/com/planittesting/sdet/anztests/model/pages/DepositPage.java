package com.planittesting.sdet.anztests.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
}