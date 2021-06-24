package com.planittesting.sdet.anztests.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage<HomePage> {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public BorrowPage clickBorrowingPowerCaluclator() {
        driver.findElement(By.partialLinkText("Borrowing power calculator")).click();
        return new BorrowPage(driver);
    }

    public RepaymentPage clickRepaymentsCalculator() {
        driver.findElement(By.partialLinkText("Repayments calculator")).click();
        return new RepaymentPage(driver);
    }

    public DepositPage clickHomeLoanDepositCaluclator() {
        driver.findElement(By.partialLinkText("Home Loan deposit calculator")).click();
        return new DepositPage(driver);
    }
}
