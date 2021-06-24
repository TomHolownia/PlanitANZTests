package com.planittesting.sdet.anztests.model.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class dropDownMenu {

    private WebElement rootElement;

    public dropDownMenu(WebElement rootElement) {
        this.rootElement = rootElement;
    }

    public WebElement getElement(String searchDropDown, String className) {
        var rows = rootElement.findElements(By.cssSelector("select option"));
        for (WebElement row : rows) {
            if (row.getText().equals(searchDropDown)) {
                return row;
            }
        }
        throw new RuntimeException("Value for " + searchDropDown + " not found");
    }
}
