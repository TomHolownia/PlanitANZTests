package com.planittesting.sdet.anztests.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.planittesting.sdet.anztests.model.pages.HomePage;
import org.junit.jupiter.api.Test;

public class RepaymentTests extends BaseTest {

    @Test
    public void validateRepaymentsDefault() {

        var estimatedRepayments = open(HomePage.class)
            .clickRepaymentsCalculator()
            .setLoanAmount("800000");

        assertEquals(3456, estimatedRepayments.getEstimatedRepayments());
    }

}
