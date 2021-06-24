package com.planittesting.sdet.anztests.model.components;

import org.openqa.selenium.WebElement;

public class dropDownMenu {
    
    private WebElement rootElement;

    public dropDownMenu(WebElement rootElement) {
        this.rootElement = rootElement;
    }

    public WebElement getElement(String searchDropDown) {



        return rootElement;
    }

}
