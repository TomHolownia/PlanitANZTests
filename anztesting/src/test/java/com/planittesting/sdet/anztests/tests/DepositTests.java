package com.planittesting.sdet.anztests.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.planittesting.sdet.anztests.model.pages.HomePage;
import org.junit.jupiter.api.Test;

public class DepositTests extends BaseTest {

    @Test
    public void validateBorrowCaluclationsDefault() {

        var depositPage = open(HomePage.class)
        .clickHomeLoanDepositCaluclator()
        .setEstimatedPropertyValue("250000")
        .setHowMuchDoYouHaveNow("50000");

        assertEquals(3082, depositPage.getEstimatedCosts());
        assertEquals(46918, depositPage.getEstimatedDeposit());

    }

}