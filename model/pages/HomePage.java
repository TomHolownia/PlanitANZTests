package model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage<HomePage> {
    
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage clickBorrowingPowerCaluclator() {
        driver.findElement(By.cssSelector("#nav-login a")).click();
        return new HomePage(driver);
    }

    public HomePage clickRepaymentsCaluclator() {
        driver.findElement(By.cssSelector("#nav-login a")).click();
        return new HomePage(driver);
    }

    public HomePage clickHomeLoanDepositCaluclator() {
        driver.findElement(By.cssSelector("#nav-login a")).click();
        return new HomePage(driver);
    }
}
