package com.example.steps;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;

public class CalculatorPageStepDef extends BaseTest {
    @Given("user input angka1 field {int}")
    public void userInputAngka1Field(int value) {
        calculatorPage.inputAngka1(value);
    }

    @Given("user input angka2 field {int}")
    public void userInputAngka2Field(int value) {
        calculatorPage.inputAngka2(value);
    }

    @Then("the substraction total should be {int}")
    public void theTotalShouldBe(int result) {
        String resultText = calculatorPage.getResults();
        Assertions.assertEquals("Hasil : -10", resultText);
        boolean isDisplayed = calculatorPage.checkResults();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }
    
    @And("user click equal button")
    public void userClickEqualButton() {
        calculatorPage.clickEqualBtn();
    }

    @And("user click drop down button")
    public void userClickDropDownButton() {
        calculatorPage.clickDropDownBtn();
    }

    @And("user click add button")
    public void userClickAddButton() {
        calculatorPage.clickAddBtn();
    }

    @And("user click substract button")
    public void userClickSubstractButton() {
        calculatorPage.clickSubsBtn();
    }

    @Then("the add total should be {int}")
    public void theAddTotalShouldBe(int result) {
        String resultText = calculatorPage.getResults();
        Assertions.assertEquals("Hasil : 110", resultText);
        boolean isDisplayed = calculatorPage.checkResults();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }

    @And("user click multiplication button")
    public void userClickMultiplicationButton() {
        calculatorPage.clickMultiplyBtn();
    }

    @Then("the multiply total should be {int}")
    public void theMultiplyTotalShouldBe(int result) {
        String resultText = calculatorPage.getResults();
        Assertions.assertEquals("Hasil : 3000", resultText);
        boolean isDisplayed = calculatorPage.checkResults();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }

    @And("user click distribution button")
    public void userClickDistributionButton() {
        calculatorPage.clickDistriBtn();
    }

    @Then("the distribution total should be {int}")
    public void theDistributionTotalShouldBe(int result) {
        String resultText = calculatorPage.getResults();
        Assertions.assertEquals("Hasil : 5", resultText);
        boolean isDisplayed = calculatorPage.checkResults();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }

    @And("the total should be NaN")
    public void theTotalShouldBeNaN() {
        String resultText = calculatorPage.getResults();
        Assertions.assertEquals("Hasil : NaN", resultText);
        boolean isDisplayed = calculatorPage.checkResults();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }

    @When("user input decimal angka1 field {double}")
    public void userInputDecimalAngka1Field(double value) {
        calculatorPage.inputAngkaDouble1(value);
    }

    @And("user input decimal angka2 field {double}")
    public void userInputDecimalAngka2Field(double value) {
        calculatorPage.inputAngkaDouble2(value);
    }
}