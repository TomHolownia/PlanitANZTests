package com.planittesting.sdet.anztests.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.planittesting.sdet.anztests.model.pages.HomePage;

public class BorrowTests extends BaseTest {

    @Test
    public void validateBorrowCalculationsDefault() {

        var borrowEstimate = open(HomePage.class)
            .clickBorrowingPowerCaluclator()
            .setIncome("100000")
            .setLivingExpenses("2000")
            .clickWorkOutBorrowButton();

        // Wait two seconds for Animation
        borrowEstimate.wait(1500);

        assertEquals(646000, borrowEstimate.getBorrowAmount());

    }
}