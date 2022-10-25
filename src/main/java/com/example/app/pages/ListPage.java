package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import static com.example.app.drivers.AndroidDriverInit.driver;

public class ListPage extends BasePageObject {

  public void swipeList() {

    AndroidElement element = find(MobileBy.AndroidUIAutomator(
        "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().text(\"List ke-80\"))"));
  }

  public void longPress(){

    WebElement holdElement = find(MobileBy.xpath("//android.widget.TextView[@text=\"List ke-1\"]"));

    AndroidTouchAction t = new AndroidTouchAction(driver);

    t.longPress(LongPressOptions.longPressOptions()
                    .withElement(ElementOption.element(holdElement))
                    .withDuration(Duration.ofSeconds(5)))
            .release()
            .perform();
  }

  public void tapMultipleTimes(){

    WebElement clickElement = find(MobileBy.xpath("//android.widget.TextView[@text=\"List ke-1\"]"));
    TouchAction action = new TouchAction(getDriver());
    action.tap(TapOptions.tapOptions().withTapsCount(15)
            .withElement(ElementOption.element(clickElement)))
            .perform();
  }
}
