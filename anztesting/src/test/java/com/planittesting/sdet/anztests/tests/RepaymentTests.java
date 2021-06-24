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

    @Test
    public void validateRepaymentsInvestmentProperty() {

        var estimatedRepayments = open(HomePage.class)
            .clickRepaymentsCalculator()
            .setLoanAmount("800000")
            .setAsInvestmentProperty();

        assertEquals(3724, estimatedRepayments.getEstimatedRepayments());
    }

    @Test
    public void validateRepaymentsInterestOnly() {

        var estimatedRepayments = open(HomePage.class)
            .clickRepaymentsCalculator()
            .setLoanAmount("800000")
            .setAsInterestOnly();

        assertEquals(2494, estimatedRepayments.getEstimatedRepayments());
    }

    @Test
    public void validateRepaymentsButtonsRight() {

        var estimatedRepayments = open(HomePage.class)
            .clickRepaymentsCalculator()
            .setLoanAmount("800000")
            .setAsInvestmentProperty()
            .setAsInterestOnly()
            .setAsFixedRate()
            .setAsNonPackagedLoan();

        assertEquals(1894, estimatedRepayments.getEstimatedRepayments());
    }

}
