package com.planittesting.sdet.anztests.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RepaymentPage extends BasePage<RepaymentPage> {

    public RepaymentPage(WebDriver driver) {
        super(driver);
    }

    public RepaymentPage setLoanAmount(String loanAmount) {
        driver.findElement(By.id("loanAmount")).sendKeys(loanAmount);
        return this;
    }

    public RepaymentPage setAsInvestmentProperty() {
        driver.findElement(By.id("investment_type_investment")).click();
        return this;
    }

    public RepaymentPage setAsResidentialProperty() {
        driver.findElement(By.id("investment_type_home")).click();
        return this;
    }

    public RepaymentPage setAsPrincipleInterest() {
        driver.findElement(By.id("principal_interest_pi")).click();
        return this;
    }

    public RepaymentPage setAsInterestOnly() {
        driver.findElement(By.id("principal_interst_i")).click();
        return this;
    }

    public RepaymentPage setAsVariableRate() {
        driver.findElement(By.id("variable_fixed_variable")).click();
        return this;
    }

    public RepaymentPage setAsFixedRate() {
        driver.findElement(By.id("variable_fixed_fixed")).click();
        return this;
    }

    public RepaymentPage setAsPackagedLoan() {
        driver.findElement(By.id("package_loan_yes")).click();
        return this;
    }

    public RepaymentPage setAsNonPackagedLoan() {
        driver.findElement(By.id("package_loan_no")).click();
        return this;
    }

    public RepaymentPage setInterestTerm() {
        driver.findElement(By.className("select--i-term")).click();// Needs further work for dropdown box
        return this;
    }

    public RepaymentPage setLoanType() {
        driver.findElement(By.className("type")).click();// Needs further work for dropdown box
        return this;
    }

    public RepaymentPage setInterestRate(String interest) {
        driver.findElement(By.id("interest")).sendKeys(interest);
        return this;
    }

    public double getComparisonRate() {
        return Double.parseDouble(driver.findElement(By.id("comparison")).getText().replace("%", ""));
    }

    public RepaymentPage setLoanTerm() {
        driver.findElement(By.className("repay__question__answer")).click();// Needs further work for dropdown box
        return this;
    }

    public double getEstimatedRepayments() {
        var estimatedPayments = driver.findElement(By.className("repay__result__text__amount"))
            .getText()
            .replace("$", "")
            .replace(",", "");
        return Double.parseDouble(estimatedPayments);
    }

    public void wait(int milliseconds) {

        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}