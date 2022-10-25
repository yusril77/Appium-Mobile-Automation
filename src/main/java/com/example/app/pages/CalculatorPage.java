package com.example.app.pages;

import static com.example.app.drivers.AndroidDriverInit.driver;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorPage extends BasePageObject {

  public String getTitle() {
//    By locator = MobileBy.xpath(
//        "//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView");
//    AndroidElement labelTitle = driver.findElement(locator);
//    return labelTitle.getText();
    return getText(MobileBy.xpath("//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView"));
  }

  public boolean checkHamburgerBtnAppear() {
//    By locator = MobileBy.AccessibilityId("Open navigation drawer");
//    AndroidElement hamburgerBtn = driver.findElement(locator);
//    return hamburgerBtn.isDisplayed();

    //explicit wait
    By locator = MobileBy.AccessibilityId("Open navigation drawer");
    WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
    AndroidElement hamburgerBtn = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    return hamburgerBtn.isDisplayed();
  }

  public void inputAngka1(int angka1){
    type(MobileBy.id("et_1"), (Integer.toString(angka1)));
  }

  public void inputAngkaDouble1(double angka1){
    type(MobileBy.id("et_1"), (Double.toString(angka1)));
  }

  public void inputAngka2(int angka2){
    type(MobileBy.id("et_2"),(Integer.toString(angka2)));
  }

  public void inputAngkaDouble2(double angka2){
    type(MobileBy.id("et_2"),(Double.toString(angka2)));
  }

  public void clickDropDownBtn(){
    click(MobileBy.id("spinner_1"));
  }

  public void clickSubsBtn(){
    click(MobileBy.xpath(
            "//android.widget.TextView[@text=\"-\"]"));
  }

  public void clickAddBtn(){
    click(MobileBy.xpath(
            "//android.widget.TextView[@text=\"+\"]"));
  }

  public void clickMultiplyBtn(){
    click(MobileBy.xpath(
            "//android.widget.TextView[@text=\"*\"]"));
  }

  public void clickDistriBtn(){
    click(MobileBy.xpath(
            "//android.widget.TextView[@text=\"/\"]"));
  }

  public void clickEqualBtn(){
    click(MobileBy.id("acb_calculate"));
  }

  public boolean checkResults(){
    By locator = MobileBy.id("tv_result");
    AndroidElement checkResult = driver.findElement(locator);
    return checkResult.isDisplayed();
  }

  public String getResults(){
    return getText(MobileBy.id("tv_result"));
  }
}