package com.planittesting.sdet.anztests.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RepaymentPage extends BasePage<RepaymentPage> {

    public RepaymentPage(WebDriver driver) {
        super(driver);
    }

    public RepaymentPage setLoanAmount(String loanAmount) {
        var element = driver.findElement(By.id("loanAmount"));
        element.clear();
        element.sendKeys(loanAmount);
        return this;
    }

    public RepaymentPage setAsResidentialProperty() {
        var elements = driver.findElements(By.className("btn"));
        for(WebElement element : elements) {
            if (element.getAttribute("for") != null && element.getAttribute("for").equals("investment_type_home")) {
                element.click();
            }
        }
        return this;
    }

    public RepaymentPage setAsInvestmentProperty() {
        var elements = driver.findElements(By.className("btn"));
        for(WebElement element : elements) {
            if (element.getAttribute("for") != null && element.getAttribute("for").equals("investment_type_investment")) {
                element.click();
            }
        }
        return this;
    }

    public RepaymentPage setAsPrincipleInterest() {
        var elements = driver.findElements(By.className("btn"));
        for(WebElement element : elements) {
            if (element.getAttribute("for") != null && element.getAttribute("for").equals("principal_interest_pi")) {
                element.click();
            }
        }
        return this;
    }

    public RepaymentPage setAsInterestOnly() {
        var elements = driver.findElements(By.className("btn"));
        for(WebElement element : elements) {
            if (element.getAttribute("for") != null && element.getAttribute("for").equals("principal_interst_i")) {
                element.click();
            }
        }
        return this;
    }

    public RepaymentPage setAsVariableRate() {
        var elements = driver.findElements(By.className("btn"));
        for(WebElement element : elements) {
            if (element.getAttribute("for") != null && element.getAttribute("for").equals("variable_fixed_variable")) {
                element.click();
            }
        }
        return this;
    }

    public RepaymentPage setAsFixedRate() {
        var elements = driver.findElements(By.className("btn"));
        for(WebElement element : elements) {
            if (element.getAttribute("for") != null && element.getAttribute("for").equals("variable_fixed_fixed")) {
                element.click();
            }
        }
        return this;
    }

    public RepaymentPage setAsPackagedLoan() {
        var elements = driver.findElements(By.className("btn"));
        for(WebElement element : elements) {
            if (element.getAttribute("for") != null && element.getAttribute("for").equals("package_loan_yes")) {
                element.click();
            }
        }
        return this;
    }

    public RepaymentPage setAsNonPackagedLoan() {
        var elements = driver.findElements(By.className("btn"));
        for(WebElement element : elements) {
            if (element.getAttribute("for") != null && element.getAttribute("for").equals("package_loan_no")) {
                element.click();
            }
        }
        return this;
    }

    public RepaymentPage setInterestTerm() {
        driver.findElement(By.className("select--i-term")).click();// Needs further work for dropdown box
        return this;
    }

    public RepaymentPage setLoanType() {
        new WebDriverWait(driver, 10).until(d -> d.findElement(By.className("type")).isEnabled());// Needs further work for dropdown box
        return this;
    }

    public RepaymentPage setInterestRate(String interest) {
        var element = driver.findElement(By.id("interest"));
        element.clear();
        element.sendKeys(interest);
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
        wait(100); //OMG
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