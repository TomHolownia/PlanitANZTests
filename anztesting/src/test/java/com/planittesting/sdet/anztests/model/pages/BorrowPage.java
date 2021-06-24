package com.planittesting.sdet.anztests.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BorrowPage extends BasePage<BorrowPage> {

    public BorrowPage(WebDriver driver) {
        super(driver);
    }

    public BorrowPage setIncome(String income) {
        driver.findElement(By.cssSelector("[aria-labelledby='q2q1']")).clear();
        driver.findElement(By.cssSelector("[aria-labelledby='q2q1']")).sendKeys(income);
        return this;
    }

    public BorrowPage setLivingExpenses(String livingExpenses) {
        driver.findElement(By.cssSelector("[aria-labelledby='q3q1']")).sendKeys(livingExpenses);
        return this;
    }

    public BorrowPage clickWorkOutBorrowButton() {
       
        driver.findElement(By.id("btnBorrowCalculater")).click();
        return this;
    }

    public Double getBorrowAmount() {
        //new WebDriverWait(driver, 10).until(d -> d.findElement(By.id("borrowResultTextAmount")).getText().length() > 0);
        var amount = driver.findElement(By.id("borrowResultTextAmount"))
            .getText()
            .replace("$", "")
            .replace(",", "");

        return Double.parseDouble(amount);
    }

    public void wait(int milliseconds) {
        
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}