package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ListPageSteps extends BaseTest {

  @And("user do scroll")
  public void userDoScroll() {
    listPage.swipeList();
  }

    @And("user long press in list menu")
    public void userLongPressInListMenu() {
    listPage.longPress();
    }

    @Then("user should see the pop up message")
    public void userShouldSeeThePopUpMessage() {
    //kosong
    }

  @And("user tap multiple times in list menu")
  public void userTapMultipleTimesInListMenu() {
    listPage.tapMultipleTimes();
  }
}